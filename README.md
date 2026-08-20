# Pipeline de Extração, Tratamento e Análise de Dados (Python & SQL)

Este projeto apresenta a construção de um pipeline de engenharia e análise de dados para o setor de varejo e inteligência de negócios, focado na manipulação, limpeza e análise exploratória de grandes volumes de dados estruturados.

##  Tecnologias e Ferramentas Utilizadas
* **Linguagem Principal:** Python 3
* **Biblioteca de Manipulação:** Pandas
* **Banco de Dados:** Relacional (MySQL / MariaDB) e comandos estruturados SQL
* **Ambiente de Desenvolvimento:** Google Colab (Cloud Computing)
* **Controle de Versão:** Git / GitHub

##  Etapas e Funcionalidades do Projeto

### 1. Extração e Importação em Nuvem
O projeto realiza a extração automatizada de bases de dados reais armazenadas na nuvem em formato `.csv` utilizando a função `pd.read_csv()`, processando milhares de registros de forma otimizada e performática na memória RAM.

### 2. Tratamento e Higienização dos Dados (Data Cleaning)
A etapa de inteligência e limpeza de dados envolveu:
* **Tratamento de Nulos:** Utilização do método `.dropna()` ou `.fillna()` para eliminação de registros inconsistentes ou preenchimento de campos vazios, garantindo a integridade dos relatórios.
* **Padronização de Strings:** Aplicação de tratamento de texto (`.str.upper()`) para normalizar e categorizar registros textuais de forma sistêmica.
* **Persistência e Consultas:** Escrita de queries estruturadas em SQL envolvendo junções (`JOINs`), agregações, subqueries e filtros avançados para consolidação de dados.

##  Como Visualizar o Projeto
O código completo com as saídas e tabelas geradas em tempo real pode ser visualizado diretamente no arquivo do caderno digital criado para esta análise.
