# Repositório de Exemplos — Padrões de Projeto (GoF) em Java

Este repositório reúne **todos os códigos-exemplo** vistos em sala sobre **Padrões de Projeto (Design Patterns)**, com foco nos padrões do **GoF (Gang of Four)**, implementados em **Java**.

A ideia é que você consiga:
- revisar os conceitos fora do horário de aula;
- comparar implementações;
- usar como base para as atividades;
- praticar modificando os exemplos.

---

## 🎯 Objetivos do repositório

- Servir como **material de apoio** para a disciplina **Padrões de Projeto**.
- Manter exemplos **curtos, claros e executáveis**.
- Mostrar sempre (quando fizer sentido):
  - o **problema**
  - a **solução com o padrão**
  - um **exemplo prático**
  - uma forma simples de **testar no `Main`**

---

## 🧱 Estrutura de pastas

Os exemplos serão organizados por categoria:

```
/criacionais
  /factory-method
  /abstract-factory
  /builder
  /prototype
  /singleton

/estruturais
  /adapter
  /decorator
  /facade
  /proxy
  /composite
  /bridge
  /flyweight

/comportamentais
  /strategy
  /observer
  /command
  /state
  /template-method
  /iterator
  /mediator
  /memento
  /chain-of-responsibility
  /visitor
  /interpreter
```

> Cada pasta contém um projeto simples com um `Main.java` para rodar e ver o padrão funcionando.

---

## ✅ Padrões já vistos em sala

### Criacionais
- Factory Method
- Abstract Factory
- Builder
- Prototype
- Singleton

*(Os padrões estruturais e comportamentais serão adicionados conforme avançarmos.)*

---

## ▶️ Como executar os exemplos

### Opção A — Usando uma IDE (recomendado)
1. Abra a pasta do padrão na sua IDE (IntelliJ / Eclipse / VS Code)
2. Rode o arquivo `Main.java`

### Opção B — Pelo terminal (Java instalado)
Entre na pasta do exemplo e compile/execute:

```bash
javac *.java
java Main
```

> Alguns exemplos podem ter subpastas (ex.: `src/`). Nesse caso, compile apontando para o caminho correto.

---

## 📌 Padrão de organização dentro de cada exemplo

Em geral, você vai encontrar:

- `Main.java` → execução e testes
- classes/interfaces do padrão
- um mini-cenário “real” (ex.: fila, pedido, integrações, templates etc.)

Quando for uma atividade, pode existir:
- `README_ATIVIDADE.md` (enunciado)
- `SOLUCAO` ou `GABARITO` (se liberado pelo docente)

---

## 🧪 Dica para estudar bem

Para cada padrão, tente responder:
1. Qual problema ele resolve?
2. Qual é a estrutura (classes e responsabilidades)?
3. O que muda se eu adicionar uma nova variação?
4. Quais erros o padrão evita?
5. Qual seria uma alternativa sem usar o padrão?

---

## 🤝 Contribuição (alunos)

Se você encontrar:
- bug no exemplo,
- melhoria de clareza,
- sugestão de cenário mais real,

você pode:
1. abrir uma *issue* (se estivermos usando GitHub),
2. ou enviar a sugestão diretamente ao docente.

> **Atenção:** não envie soluções de atividades avaliativas se o docente ainda não tiver liberado.

---

## 🧾 Licença / Uso

Este repositório é destinado ao **uso educacional** na disciplina.  
Você pode baixar e modificar para estudo, desde que não utilize para fins indevidos.

---

## 👨‍🏫 Informações da disciplina

- **Disciplina:** Padrões de Projeto  
- **Instituição:** IFPB  
- **Docente:** Miquéias Soares Cardoso

---
