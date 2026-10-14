# Diagnóstico

_(Atualizado ao fim de cada sessão, com minha aprovação. Regras na seção 13 do `CLAUDE.md`. Nunca apagar entradas antigas.)_

## RESUMO GERAL

**Etapa atual:** 3 - Orientação a objetos (revisão antes de começar o sistema bancário).

**Conceitos aprendidos ou declarados:**

- Lógica de programação: a confirmar. Declarei que já conheço; ainda sem exercício diagnóstico.
- Escolha de versão do Java (LTS): funcional. Escolhi e instalei o Java 25.
- Convenção de nomes no código: funcional. Defini nomes em português.
- Maven: não avaliado. Pedi projeto Maven, mas ainda não discutimos como funciona.

**Dificuldades em aberto:**

- Getters e setters (encapsulamento).
- Orientação a objetos em geral (em revisão).

**Erros recorrentes:**

- Sem evidência ainda.

**Próximos focos:**

- Encapsulamento: por que atributos privados existem e o papel de getters e setters.
- Construtores e estado válido de um objeto.
- Exercício diagnóstico curto de lógica para confirmar o nível declarado.

## REGISTRO DIÁRIO

### 13/10/2026

- **O que fiz:** defini o projeto (sistema bancário do zero, com o Claude como mentor), escolhi Java 25, Maven e nomes em português, e decidi revisar POO antes de começar o código.
- **Conceitos trabalhados:** escolha de versão LTS (funcional); convenção de nomes (funcional).
- **Dificuldades:** nenhuma observada.
- **Erros:** nenhum registrado.
- **Materiais indicados:** nenhum.
- **Foco para a próxima sessão:** revisão de POO.

### 14/10/2026

- **O que fiz:** reescrevi o prompt de mentoria com uma regra nova para dúvidas de conceito (roteiro de estudo com material do Claude e fontes externas, sem resposta pronta), juntei prompt e diagnóstico no `CLAUDE.md` e trouxe a dúvida sobre getters e setters.
- **Conceitos trabalhados:** encapsulamento, não compreendido ainda (dúvida declarada, sem exercício feito).
- **Dificuldades:** getters e setters. Causa provável: conceito ainda não estudado; a confirmar.
- **Erros:** nenhum registrado.
- **Materiais indicados (pendentes):**
  - Oracle Java Tutorials: "Controlling Access to Members of a Class" e "Object-Oriented Programming Concepts".
  - dev.java: seção sobre classes e objetos.
  - Termos de busca: "java encapsulamento getter setter", "java encapsulation access modifiers".
- **Perguntas para responder depois de estudar:**
  - Por que um atributo seria `private`?
  - O que se ganha ao acessar um atributo por um método em vez de diretamente?
  - Toda classe precisa de get e set para todos os atributos? Numa conta bancária, faz sentido existir um `setSaldo`?
- **Foco para a próxima sessão:** responder essas perguntas e fazer o exercício de verificação de encapsulamento.
