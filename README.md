Sistema de Gerenciamento e Estruturação de Dados (Java & SQL)

Este projeto apresenta o desenvolvimento de um sistema corporativo focado no processamento, organização e armazenamento seguro de dados institucionais, simulando a triagem e o controle de projetos de grande porte.

## Tecnologias e Ferramentas Utilizadas
* **Linguagem de Programação:** Java (Lógica Orientada a Objetos para persistência de dados)
* **Banco de Dados:** Relacional (MySQL / MariaDB) com comandos estruturados SQL
* **Ambiente de Desenvolvimento:** IDE para integração de sistemas e consolidação de dados
* **Controle de Versão:** Git / GitHub

## Estrutura e Funcionalidades do Banco de Dados
O projeto realiza a modelagem completa de um banco de dados relacional voltado para a governança corporativa:

1. **Criação do Ambiente:** Estruturação do banco de dados `sistema_corporativo` de forma sistêmica.
2. **Modelagem de Tabelas:** Criação da tabela `projetos` utilizando chaves primárias com incremento automático (`PRIMARY KEY AUTO_INCREMENT`), tratamento rigoroso para valores numéricos (`DECIMAL`) e carimbo de data automatizado (`TIMESTAMP`).
3. **Persistência de Dados:** Inserção e manipulação de registros de teste para validação de fluxos (Simulação com o *Sistema de Triagem Dataprev*).
4. **Consultas Estruturadas:** Escrita de queries (`SELECT *`) para auditoria, extração rápida e geração de relatórios de dados.

## Como Visualizar o Projeto
* O script de criação das tabelas e inserção de dados está disponível no arquivo `script_banco.sql`.
* A lógica de integração e exibição dos dados via terminal está estruturada no arquivo `ECommerceApp.java`.
