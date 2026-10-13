# Sistema Bancário

Sistema bancário construído do zero, em Java, como projeto de aprendizado. A aplicação evolui por etapas: lógica no terminal, Java e POO, PostgreSQL, Spring Boot, testes, segurança e Docker.

## Funcionalidades do MVP

- [ ] Cadastrar cliente
- [ ] Criar conta bancária
- [ ] Consultar saldo
- [ ] Depositar
- [ ] Sacar
- [ ] Transferir entre contas
- [ ] Consultar extrato
- [ ] Persistir os dados no banco

As regras completas estão em [docs/regras-de-negocio.md](docs/regras-de-negocio.md).

## Pré-requisitos

- Java 25 (JDK)
- Maven 3.9 ou superior

Confira as versões instaladas:

```bash
java -version
mvn -version
```

## Como usar

```bash
mvn compile           # compila o código
mvn compile exec:java # compila e executa o programa
mvn test              # executa os testes automatizados
mvn clean             # apaga a pasta target/ (saída do build)
```

## Estrutura

```
sistema-bancario/
├── pom.xml                 # configuração do Maven: Java, dependências e plugins
├── src/main/java/          # código da aplicação
├── src/test/java/          # testes automatizados
├── docs/
│   ├── regras-de-negocio.md
│   └── decisoes.md         # decisões técnicas e seus motivos
├── PROGRESSO.md            # acompanhamento do aprendizado
└── CLAUDE.md               # instruções do modo mentor para o Claude Code
```

## Etapa atual

Etapa 1: lógica de programação (menu bancário no terminal).
