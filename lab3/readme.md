# 📦 Sistema de Gerenciamento de Produtos - Lab 3 Projeto 1

## 📋 Visão Geral

Este é um projeto educacional desenvolvido como parte do **Lab 3 da disciplina de Engenharia de Software**. Trata-se de uma **aplicação web full-stack** para gerenciamento de produtos de um supermercado, implementando as operações básicas de CRUD (Create, Read, Update, Delete) com arquitetura cliente-servidor.

A aplicação demonstra boas práticas de desenvolvimento web moderno, incluindo separação de responsabilidades, integração com banco de dados relacional, e construção de APIs REST.

---

## 🎯 Objetivos

O projeto foi desenvolvido com o propósito de:

- Consolidar conhecimentos de **programação backend** com Spring Boot
- Aplicar padrões de arquitetura em camadas (Controller, Repository, Entity)
- Integrar com **banco de dados relacional** (MySQL)
- Construir uma **API REST** funcional
- Desenvolver uma **interface web responsiva** para consumo da API
- Praticar técnicas de versionamento de código com Git

---

## 🏗️ Arquitetura e Estrutura do Projeto

### Padrão de Arquitetura: MVC + Repository

```
projeto1/
├── src/main/java/lab/bertoti/projeto1/
│   ├── Projeto1Application.java          # Classe principal (Spring Boot)
│   ├── Controllers/
│   │   └── ProdutoController.java        # Endpoints REST da API
│   ├── Entities/
│   │   ├── Produto.java                  # Entidade Produto
│   │   ├── Categoria.java                # Entidade Categoria
│   │   ├── Fornecedor.java               # Entidade Fornecedor
│   │   ├── Venda.java                    # Entidade Venda
│   │   ├── ItemVenda.java                # Entidade ItemVenda (relacionamento)
│   │   ├── Cliente.java                  # Entidade Cliente
│   │   └── Funcionario.java              # Entidade Funcionário
│   └── Repositories/
│       └── ProdutoRepository.java        # Interface de acesso a dados
├── src/main/resources/
│   ├── application.properties            # Configurações da aplicação
│   └── static/
│       ├── index.html                    # Interface web
│       ├── script.js                     # Lógica frontend (AJAX)
│       └── style.css                     # Estilos da aplicação
├── pom.xml                               # Dependências Maven
└── target/                               # Arquivos compilados (build)
```

### Fluxo de Dados

```
┌─────────────────────────────────────────────────────────────────┐
│                        CLIENTE (Frontend)                        │
│  ┌──────────────────────────────────────────────────────────┐  │
│  │ HTML + CSS (interface)  |  JavaScript (lógica cliente)   │  │
│  └──────────────────────────────────────────────────────────┘  │
└──────────────────────────────────────────────────────────────────┘
                      ↑  (HTTP)  ↓
                   (JSON)  (REST API)
                      ↑         ↓
┌──────────────────────────────────────────────────────────────────┐
│                     SERVIDOR (Backend)                            │
│  ┌──────────────────────────────────────────────────────────┐  │
│  │ ProdutoController                                        │  │
│  │  - GET /produtos         → listar todos                 │  │
│  │  - GET /produtos/{id}    → buscar um                    │  │
│  │  - POST /produtos        → criar novo                   │  │
│  │  - PUT /produtos/{id}    → atualizar                    │  │
│  │  - DELETE /produtos/{id} → deletar                      │  │
│  └──────────────────────────────────────────────────────────┘  │
                           ↓ JPA/Hibernate
│  ┌──────────────────────────────────────────────────────────┐  │
│  │ ProdutoRepository (Data Access Layer)                    │  │
│  └──────────────────────────────────────────────────────────┘  │
└──────────────────────────────────────────────────────────────────┘
                           ↓ SQL
┌──────────────────────────────────────────────────────────────────┐
│                    BANCO DE DADOS (MySQL)                        │
│  Tabelas: produtos, categorias, fornecedores, vendas, etc.      │
└──────────────────────────────────────────────────────────────────┘
```

---

## 🛠️ Tecnologias Utilizadas

### Backend
| Tecnologia | Versão | Propósito |
|-----------|--------|----------|
| **Java** | 21 | Linguagem de programação |
| **Spring Boot** | 4.1.1 | Framework web |
| **Spring Data JPA** | - | Acesso a dados com ORM |
| **Hibernate** | - | ORM (Object-Relational Mapping) |
| **MySQL** | - | Banco de dados relacional |
| **Lombok** | - | Geração automática de getters/setters |
| **Maven** | 3.x | Gerenciador de dependências |

### Frontend
| Tecnologia | Propósito |
|-----------|----------|
| **HTML5** | Estrutura da página |
| **CSS3** | Estilização e layout |
| **JavaScript (Vanilla)** | Lógica de interação e requisições AJAX |
| **Fetch API** | Comunicação com a API REST |

---

## 📦 Dependências Principais (pom.xml)

```xml
<!-- Spring Boot Starter Data JPA -->
<!-- Fornece suporte para acesso a dados com JPA -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<!-- MySQL Connector -->
<!-- Driver JDBC para comunicação com MySQL -->
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>

<!-- Lombok -->
<!-- Reduz código boilerplate com anotações -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>

<!-- Spring Boot Starter Web -->
<!-- Fornece suporte para aplicações web com Spring MVC -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- **JDK 21** instalado e configurado
- **Maven** instalado
- **MySQL 8.0+** instalado e rodando
- **Navegador moderno** (Chrome, Firefox, Edge, Safari)

---

**Última atualização:** 2024
**Status:** ✅ Funcional e pronto para uso educacional
