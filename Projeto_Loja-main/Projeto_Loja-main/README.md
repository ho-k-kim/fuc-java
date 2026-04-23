# Projeto Loja - Gestão de Armazém (Didático)

Este é um projeto didático desenvolvido em **Java** para exemplificar a organização de um sistema de gestão de estoque simples. O objetivo principal é demonstrar a separação de responsabilidades em camadas e o uso de padrões fundamentais de desenvolvimento.

## 🏗️ Estrutura e Arquitetura

O projeto utiliza uma arquitetura baseada em camadas (Layered Architecture), facilitando a manutenção e o entendimento do fluxo de dados:

- **`models`**: Contém as entidades principais (POJOs). Ex: `Produto`. Aqui definimos as propriedades do objeto e regras simples como geração automática de ID.
- **`repositorys`**: Simula a persistência de dados. No momento, utiliza uma lista em memória para armazenar os produtos.
- **`services`**: Camada de lógica de negócio. Contém as regras do sistema (ex: como calcular o valor total de um item, como deletar logicamente ou fisicamente um produto).
- **`controllers`**: Gerencia a entrada do usuário. No caso de uma aplicação console, captura os dados digitados e repassa para os serviços.
- **`menus`**: Camada de visualização (Interface de Usuário). Responsável por exibir o menu interativo no console.
- **`estoques`**: Contém classes de semente (Seeding) para carregar dados de teste automaticamente.

## 🚀 Tecnologias Utilizadas

- **Linguagem**: Java (JDK 17 ou superior recomendado)
- **Paradigma**: Orientação a Objetos (Encapsulamento, Abstração, Classes Estáticas)
- **Persistência**: Em memória (`ArrayList`)

## ✨ Funcionalidades

1.  **Listar Armazém**: Exibe todos os produtos cadastrados no sistema.
2.  **Adicionar Produto**: Permite cadastrar novos itens com nome, valor, quantidade e descrição.
3.  **Remover Produto**: Exclui um produto do sistema através do seu ID único.
4.  **Procurar por ID**: Localiza e exibe detalhes completos de um produto específico.
5.  **Carga Inicial**: O sistema já inicia com alguns produtos (Notebook, Geladeira, etc.) pré-cadastrados para facilitar os testes.

## 📖 Conceitos Ensinados

- **Encapsulamento**: Uso de atributos privados e métodos públicos (Getters/Setters).
- **Static vs Instance**: Diferença entre membros de classe e membros de objeto.
- **Controle de Fluxo**: Uso de `while(true)`, `switch-case` e loops `for`.
- **Tratamento de ID**: Uso de um contador estático para garantir que cada produto tenha uma identificação única.

## 🛠️ Como Executar

1.  Certifique-se de ter o Java instalado.
2.  Importe o projeto em sua IDE favorita (Eclipse, VS Code, IntelliJ).
3.  Localize a classe `App.java` no pacote `controllers`.
4.  Execute o método `main`.
5.  Siga as instruções no console.

---

Este projeto serve como uma excelente base para quem está começando a entender como sistemas REAIS são estruturados profissionalmente separando o que o usuário vê (Menu) de como os dados são guardados (Repository/Storage).
