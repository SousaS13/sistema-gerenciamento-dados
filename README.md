# Sistema de Gerenciamento e Estruturação de Dados (Java & SQL)

Este projeto apresenta o desenvolvimento de um sistema corporativo focado no processamento, organização e armazenamento seguro de dados institucionais. O sistema simula a lógica de um **Sistema de Triagem e Governança de Projetos**, inspirado nos modelos de arquitetura de dados utilizados por empresas públicas como a **Dataprev**.

---

##  Tecnologias e Ferramentas Utilizadas

* **Linguagem Back-End:** Java (Lógica Orientada a Objetos para regras de negócio e persistência).
* **Banco de Dados:** Relacional (MySQL / MariaDB) com escrita de queries estruturadas e otimizadas.
* **Governança:** Modelagem de dados baseada em integridade referencial, auditoria e segurança da informação.
* **Controle de Versão:** Git e GitHub para documentação e versionamento.

---

##  Estrutura da Solução e Regras de Negócio

O projeto foi construído dividindo a inteligência do software em duas frentes integradas:

### 1. Modelagem e Governança do Banco de Dados (`script_banco.sql`)
* **Estruturação Sistêmica:** Criação do banco de dados focado em auditoria interna e rastreabilidade.
* **Integridade de Dados:** Tabelas com chaves primárias auto-incrementais (`PRIMARY KEY AUTO_INCREMENT`), constraints para consistência financeira (`DECIMAL`) e rastreabilidade temporal automatizada (`TIMESTAMP`).
* **Relatórios e Auditoria:** Desenvolvimento de queries avançadas para extração rápida de dados, simulando auditorias de conformidade do setor público.

### 2. Lógica de Integração (`ECommerceApp.java`)
* **Processamento de Dados:** Arquitetura em Java que consome, valida e manipula as regras corporativas dos registros.
* **Consistência:** Aplicação de conceitos de POO para garantir que os dados trafegados entre o banco e o usuário não sofram corrupção ou vazamento de escopo.

---

#  Como Executar e Validar o Projeto

1. Certifique-se de ter o **Java JDK** e o **MySQL/MariaDB** instalados na sua máquina.
2. Execute o script contido em `script_banco.sql` para criar e popular o banco de dados.
3. Abra e execute a classe `ECommerceApp.java` na sua IDE de preferência para rodar a aplicação via terminal.

---

#  Aprendizados e Soft Skills Aplicados
Este projeto reflete não apenas o domínio técnico em Java e SQL, mas também competências essenciais de **atenção a processos, controle rigoroso de dados e organização lógica**, habilidades consolidadas ao longo da minha trajetória profissional em controle de inventários e almoxarifados.
