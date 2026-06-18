-- Criando o banco de dados do sistema
CREATE DATABASE sistema_corporativo;
USE sistema_corporativo;

-- Criando a tabela para armazenar os projetos
CREATE TABLE projetos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    orcamento DECIMAL(10,2) NOT NULL,
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Inserindo um dado de teste (Simulação)
INSERT INTO projetos (nome, orcamento) 
VALUES ('Sistema de Triagem Dataprev', 15000.00);

-- Comando para consultar os dados
SELECT * FROM projetos;
