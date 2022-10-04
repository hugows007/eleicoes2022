package br.com.apuracao.eleicao2022.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TSECand {
    private String nm;
    private Long vap;
    private String pvap;
}
