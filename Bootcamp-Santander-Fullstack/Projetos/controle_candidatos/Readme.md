# Controle de Candidatos
## Descrição do Projeto
O projeto Controle de Candidatos é uma aplicação Java que permite gerenciar e analisar candidatos para um processo seletivo. Ele fornece funcionalidades para analisar a pretensão salarial dos candidatos, selecionar candidatos com base em critérios específicos, imprimir os detalhes dos candidatos selecionados e tentar entrar em contato com os candidatos selecionados.

## Estrutura do Projeto
O projeto está estruturado da seguinte maneira:
```
src
│
└───candidatura
    │   ProcessoSeletivo.java (contém apenas o método main)
    │
    └───utils
    │   │   AnaliseCandidato.java
    │   │   EntrandoEmContato.java
    │   │   ImprimeSelecionados.java
    │   │   SelecaoCandidatos.java
    │
    └───model
    │   │   Candidato.java
    │
    └───data
        │   Candidatos.java
        │   Ligacao.java        
        │   Salario.java
```
## Como Usar
Para usar o projeto, siga estas etapas:

Clone o repositório para sua máquina local.
1. Abra o projeto no seu IDE preferido (por exemplo, VSCode).
2. Execute o método main na classe ProcessoSeletivo.
Contribuindo
3. Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença
Este projeto está licenciado sob os termos da licença MIT.