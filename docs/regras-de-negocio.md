# Sistema bancário — requisitos e regras de negócio

A ideia é desenvolver um sistema bancário completo, passando por lógica de programação, Java, POO, banco de dados, Spring Boot, testes e versionamento, como se fosse um projeto real de mercado.

## MVP: o que o sistema precisa fazer

Comece pequeno. Não tente construir o Nubank inteiro na primeira versão.

- Cadastrar cliente.
- Criar conta bancária.
- Consultar saldo.
- Depositar dinheiro.
- Sacar dinheiro.
- Transferir entre contas.
- Consultar extrato.
- Persistir os dados no banco.

## Regras de negócio iniciais

1. Uma conta pertence a um cliente.
2. O saldo não pode ficar negativo, salvo se houver uma modalidade de crédito explicitamente prevista.
3. O valor de depósito, saque e transferência deve ser maior que zero.
4. Uma conta não pode transferir dinheiro para ela mesma.
5. Uma transferência só pode ocorrer se a conta de origem tiver saldo suficiente.
6. A transferência deve debitar uma conta e creditar a outra integralmente, ou não ocorrer.
7. Toda movimentação deve gerar um registro no extrato.
8. Uma conta encerrada ou bloqueada não pode movimentar dinheiro.
9. Valores monetários devem usar `BigDecimal` em Java, evitando `double` para cálculos financeiros.
10. Operações concorrentes precisam preservar a integridade do saldo.

## Ordem de implementação

| Etapa | Tecnologia       | Entrega                                      |
| ----- | ---------------- | -------------------------------------------- |
| 1     | Lógica           | Menu bancário no terminal                    |
| 2     | Java             | Classes e regras de negócio                  |
| 3     | POO              | Modelo organizado e responsabilidades claras |
| 4     | Git/GitHub       | Histórico de evolução                        |
| 5     | SQL + PostgreSQL | Dados persistidos                            |
| 6     | Spring Boot      | API REST                                     |
| 7     | JUnit + Mockito  | Testes automatizados                         |
| 8     | Spring Security  | Autenticação e autorização                   |
| 9     | Docker           | Aplicação reproduzível                       |
| 10    | Documentação     | Projeto pronto para demonstração             |

**Regra de ouro:** só avance para a próxima etapa quando conseguir explicar o que construiu, por que construiu dessa forma e como verificou que funciona.

Para aprender de verdade, desenvolva primeiro as regras e a lógica sem Spring Boot. Depois evolua a mesma aplicação, em vez de pular diretamente para um projeto cheio de ferramentas.

## Roadmap completo (0/53)

### 1. Ideia e problema
- [ ] Definir o objetivo do sistema
- [ ] Identificar os usuários
- [ ] Definir o que o sistema resolve

### 2. Requisitos e regras de negócio
- [ ] Definir funcionalidades (requisitos funcionais)
- [ ] Definir requisitos não funcionais
- [ ] Escrever regras de negócio
- [ ] Mapear exceções e casos extremos

### 3. Planejamento
- [ ] Definir o MVP (versão mínima)
- [ ] Escrever histórias de usuário
- [ ] Criar critérios de aceitação
- [ ] Priorizar tarefas em um backlog

### 4. Modelagem
- [ ] Identificar entidades e responsabilidades
- [ ] Desenhar o fluxo das operações
- [ ] Criar diagramas UML básicos
- [ ] Modelar o banco de dados e relacionamentos

### 5. Lógica de programação
- [ ] Criar menu e navegação
- [ ] Trabalhar com condicionais e laços
- [ ] Validar entradas
- [ ] Resolver exercícios de saldo e transações

### 6. Java e POO
- [ ] Criar classes, atributos e métodos
- [ ] Aplicar encapsulamento
- [ ] Trabalhar com interfaces e abstração
- [ ] Aplicar composição e polimorfismo quando fizer sentido
- [ ] Tratar exceções

### 7. Versionamento
- [ ] Criar repositório Git
- [ ] Fazer commits pequenos e claros
- [ ] Criar branches por funcionalidade
- [ ] Documentar o projeto no README

### 8. Banco de dados
- [ ] Escolher PostgreSQL
- [ ] Criar tabelas e relacionamentos
- [ ] Definir chaves e restrições
- [ ] Implementar consultas SQL
- [ ] Aprender transações e integridade dos dados

### 9. Spring Boot e API
- [ ] Criar projeto Spring Boot
- [ ] Implementar camadas Controller, Service e Repository
- [ ] Criar endpoints REST
- [ ] Adicionar validações e tratamento de erros
- [ ] Integrar com o banco de dados

### 10. Testes
- [ ] Testar regras de negócio unitariamente
- [ ] Testar endpoints
- [ ] Testar persistência
- [ ] Testar falhas e casos extremos
- [ ] Garantir que duas operações concorrentes não corrompam o saldo

### 11. Segurança
- [ ] Implementar autenticação e autorização
- [ ] Proteger dados dos usuários
- [ ] Validar acesso à conta correta
- [ ] Não armazenar senhas em texto puro
- [ ] Registrar operações relevantes

### 12. Finalização e entrega
- [ ] Criar documentação da API
- [ ] Configurar variáveis de ambiente
- [ ] Executar aplicação com Docker
- [ ] Preparar ambiente de demonstração
- [ ] Revisar README e publicar o repositório
