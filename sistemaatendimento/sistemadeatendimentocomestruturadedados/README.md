# Clínica de Atendimento Prioritário

## Contexto

Este projeto simula um sistema de atendimento de uma clínica de especialidades, utilizando as estruturas de dados **Fila** (para pacientes normais) e **Pilha** (para pacientes urgentes). O objetivo é demonstrar o uso e a priorização dessas estruturas de dados de forma prática.

## Funcionalidades do Sistema

O sistema permite a gestão do fluxo de pacientes, garantindo que os casos de urgência sejam sempre atendidos com prioridade.

### Funcionalidades:

* **Adicionar paciente normal**: O paciente é adicionado à **fila de espera normal** (FIFO - *First-In, First-Out*).
* **Adicionar paciente urgente**: O paciente é adicionado à **pilha de urgência** (LIFO - *Last-In, First-Out*).
* **Atender paciente**: O sistema verifica primeiro a **pilha de urgência** e, se houver pacientes, atende o último que chegou. Se a pilha estiver vazia, o sistema atende o primeiro paciente da **fila normal**.
* **Listar pacientes**: Exibe a lista de pacientes que estão na fila e na pilha, permitindo visualizar o status de espera.
* **Sair do sistema**: Encerra a execução do programa.

## Regras de Prioridade

* **Atendimento Prioritário**: Pacientes na pilha de urgência sempre têm prioridade sobre os da fila normal.
* **Dados do Paciente**: Cada paciente deve ter nome e especialidade médica.

## Estrutura de Dados Utilizada

* **Fila de Espera Normal**: Implementada para seguir o princípio FIFO, onde o primeiro a entrar é o primeiro a ser atendido.
* **Pilha de Urgência**: Implementada para seguir o princípio LIFO, onde o último a entrar é o primeiro a ser atendido.

---