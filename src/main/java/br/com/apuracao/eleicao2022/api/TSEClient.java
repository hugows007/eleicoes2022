package br.com.apuracao.eleicao2022.api;

import br.com.apuracao.eleicao2022.dtos.TSE;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name  = "tse", url = "https://resultados.tse.jus.br")
public interface TSEClient {
    @RequestMapping(method = RequestMethod.GET, value = "/oficial/ele2022/544/dados-simplificados/br/br-c0001-e000544-r.json")
    TSE getResult();
}
