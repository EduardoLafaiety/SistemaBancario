# Decisões técnicas

Registro das decisões relevantes do projeto. Cada decisão tem o contexto, a escolha, o porquê e as alternativas consideradas. Se uma decisão mudar, não apague: marque como substituída e registre a nova.

Modelo:

```markdown
## AAAA-MM-DD — Título da decisão
- **Contexto:** que problema ou necessidade levou à decisão?
- **Decisão:** o que foi escolhido.
- **Por quê:** os motivos, com suas palavras.
- **Alternativas consideradas:** o que mais poderia ter sido usado e por que não foi.
- **Status:** ativa | substituída por [decisão]
```

---

## 2026-10-13 — Java 25 como versão do projeto
- **Contexto:** o projeto precisa de uma versão LTS (suporte de longo prazo) do Java.
- **Decisão:** Java 25, que é a versão instalada na máquina.
- **Por quê:** _a preencher por você_
- **Alternativas consideradas:** Java 21 (LTS anterior).
- **Status:** ativa

## 2026-10-13 — Nomes no código em português
- **Contexto:** é preciso um padrão único para nomes de classes, métodos e variáveis.
- **Decisão:** português (ex.: `Conta`, `depositar()`, `saldo`). Termos da própria linguagem continuam em inglês (`public`, `String`, `List`).
- **Por quê:** _a preencher por você_
- **Alternativas consideradas:** inglês, que é o padrão mais comum no mercado.
- **Status:** ativa

## 2026-10-13 — Maven como ferramenta de build
- **Contexto:** o projeto precisa compilar, executar, rodar testes e gerenciar bibliotecas de forma padronizada.
- **Decisão:** Maven, com o JUnit como única dependência inicial.
- **Por quê:** _a preencher por você_
- **Alternativas consideradas:** Gradle; compilar manualmente com `javac`.
- **Status:** ativa
