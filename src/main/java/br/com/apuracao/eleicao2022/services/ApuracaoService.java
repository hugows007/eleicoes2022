package br.com.apuracao.eleicao2022.services;

import br.com.apuracao.eleicao2022.api.TSEClient;
import br.com.apuracao.eleicao2022.dtos.TSE;
import br.com.apuracao.eleicao2022.dtos.TSECand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApuracaoService {
    private final TSEClient tseClient;

    @PostConstruct
    public void run() {
        while (true) {
            try {
                TSE tse = tseClient.getResult();
                tse.getCand().sort(Comparator.comparing(TSECand::getVap).reversed());

                System.out.println("================================================");
                System.out.println("Apuracao em: " + LocalDateTime.now());
                System.out.println("Ultima atualizacao: " + tse.getHt());
                System.out.println("================================================");
                for (TSECand tseCand : tse.getCand()) {
                    System.out.printf("%-10s %-10s %-10s\n", tseCand.getNm(), tseCand.getVap(), tseCand.getPvap());
                }

                Thread.sleep(60000);
            } catch (Exception e) {
                log.error("[ERROR]", e);
            }
        }
    }
}
