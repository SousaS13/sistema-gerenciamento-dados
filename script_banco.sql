-- ==============================================================================
-- PROJETO: Banco de Dados para Governança de Pessoal (Simulação Dataprev/MGI)
-- AUTORA: Thaynara Sousa Nascimento
# OBJETIVO: Estruturação sistêmica para controle de atos da força de trabalho
-- ==============================================================================

-- 1. CRIAÇÃO DO AMBIENTE
-- Cria o banco de dados focado em auditoria interna e isolamento de escopo.
CREATE DATABASE IF NOT EXISTS sistema_corporativo;
USE sistema_corporativo;

-- 2. MODELAGEM DA TABELA (INTEGRIDADE REFERENCIAL E AUDITORIA)
-- Criação da tabela de atos de pessoal com constraints rígidas para evitar dados corrompidos.
CREATE TABLE IF NOT EXISTS atos_pessoal (
    -- id: Chave primária auto-incremental para indexação rápida e rastreabilidade única.
    id INT PRIMARY KEY AUTO_INCREMENT,
    
    -- nome_servidor: Campo obrigatório (NOT NULL) para identificação do servidor público.
    nome_servidor VARCHAR(150) NOT NULL,
    
    -- tipo_ato: Armazena a movimentação (ex: NOMEAÇÃO, EXONERAÇÃO, LICENÇA).
    tipo_ato VARCHAR(50) NOT NULL,
    
    -- data_publicacao: Registra automaticamente a data e hora exata do salvamento do ato (Auditoria temporal).
    data_publicacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 3. PERSISTÊNCIA E VALIDAÇÃO DE DADOS (CARGA DE TESTE)
-- Inserção de registros de simulação integrando a lógica com o Sistema de Triagem Dataprev.
INSERT INTO atos_pessoal (nome_servidor, tipo_ato) 
VALUES ('Carlos Silva', 'NOMEAÇÃO');

INSERT INTO atos_pessoal (nome_servidor, tipo_ato) 
VALUES ('Ana Souza', 'EXONERAÇÃO');

-- 4. CONSULTA E AUDITORIA DE CONFORMIDADE
-- Query estruturada para extração rápida e geração de relatórios gerenciais das movimentações.
SELECT * FROM atos_pessoal;
