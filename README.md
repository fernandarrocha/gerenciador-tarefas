# 🧪 Gerenciador de Tarefas - API REST

Este projeto é uma API RESTful desenvolvida com **Spring Boot 3** e **MongoDB** para o gerenciamento de tarefas (CRUD). O objetivo é permitir criar, listar, atualizar e remover tarefas de forma simples e eficiente.

<hr>

## 🚀 Tecnologias Utilizadas

* **Java 17** (ou superior)
* **Spring Boot 3.x**
* **Spring Web** (criação da API REST)
* **Spring Data MongoDB** (integração com banco NoSQL)
* **MongoDB Atlas** (Banco de dados na nuvem)
* **Maven** (Gerenciamento de dependências)

<hr>

## ⚙️ Configuração e Execução

### Pré-requisitos

* Java 17 instalado.
* Uma conta no MongoDB Atlas (ou MongoDB local).

### 1. Clonar o repositório

git clone [https://github.com/fernandarrocha/gerenciador-tarefas](https://github.com/fernandarrocha/gerenciador-tarefas)
<p>
cd gerenciador-tarefas
</p>
---

### 2. Executar a aplicação

No terminal (dentro da pasta do projeto), execute:

* Linux/Mac:

./mvnw spring-boot:run

* Windows:

mvnw spring-boot:run

<hr>

## 📂 Estrutura do Projeto
src/main/java/com/projeto/gerenciadortarefas
── controller   # Camada de controle (Endpoints REST)
── model        # Modelo de dados (Entidade Tarefa)
── repository   # Interface de comunicação com MongoDB
── GerenciadorTarefasApplication.java # Classe principal

<hr>

## 👤 Autor
Desenvolvido por Fernanda Rocha.












