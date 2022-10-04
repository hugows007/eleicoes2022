# Eleição 2022
Projeto básico com o objetivo de apurar os resultados da votação para presidente conforme os dados vão sendo disponibilizados pelo TSE, através de sua API pública.

## Funcionamento

Ao inicializar a aplicação Spring Boot, um Service é injetado e via PostConstruct, é iniciado um while que efetua a consulta e "printa" no console.
Ao final do processo, existe um Thread.sleep para intercalar as chamadas.

## Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Cloud (Feign Client)
- Lombok

