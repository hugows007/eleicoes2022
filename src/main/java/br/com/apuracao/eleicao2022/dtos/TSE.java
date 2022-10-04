package br.com.apuracao.eleicao2022.dtos;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TSE {
    private String ht;
    private List<TSECand> cand;
}
