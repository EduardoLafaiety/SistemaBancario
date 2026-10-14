# Progresso

## Onde paramos
- Última sessão: 2026-10-13 — ambiente local configurado (Claude Code + IntelliJ) e diagnóstico iniciado com `ContaBancaria`.
- Próximo passo: rastrear as chaves de `ContaBancaria.java` (linhas 3, 5 e 11) e transformar `numeroDaConta`, `saldo` e `nomeDoTitular` em atributos.

## Conceitos
| Conceito | Nível | Evidência |
| --- | --- | --- |
| Estrutura de classe, construtor e método | Em desenvolvimento | Criou `ContaBancaria` com construtor e `sacar()` sem consultar; sintaxe correta, compila |
| Escopo: atributo × variável local | Não compreendido | Declarou os dados da conta dentro do construtor e os classificou como atributos mesmo após exemplo (1ª evidência; confirmar) |
| Parâmetros e sombreamento | A verificar | `sacar(double saldo)` com `saldo -= saldo` zera o próprio parâmetro; ainda não discutido |
| Validação de regras no método | A verificar | `sacar()` não tratava valor ≤ 0 nem saldo insuficiente; comportamento na recusa sem resposta |
| Herança e interfaces | A verificar | Criou `ContaCorrente extends ContaBancaria` e `Tributavel` sem justificativa discutida |
| Git (commit e push) | Em desenvolvimento | Fluxo configurado; operações feitas com ajuda |

## Erros recorrentes
- Dados da conta declarados dentro do construtor em vez da classe — 2 vezes (versões 1 e 2 de `ContaBancaria`).
- Avançar antes de fechar a base (herança e interface criadas com o escopo ainda pendente) — 1 vez.

## Decisões tomadas
- Java 25, nomes em português, Maven — ver docs/decisoes.md (campo "Por quê" ainda a preencher)
- Pendente: o JDK instalado é o 26 e a decisão registrada é Java 25

## Etapa atual da trilha
- Diagnóstico em andamento — lacuna de escopo (Etapa 2) identificada antes de avançar na POO; falta o rastreamento das chaves e o desafio do saque com validação.
