CREATE DATABSE quitanda;

USE quitanda;

CREATE TABLE clientes (
	id_cliente INT AUTO_INCREMENT NOT NULL,
	nome VARCHAR(60) NULL,
    cpf CHAR(11) NULL,
    idade TINYINT NULL,
    data_registro DATE NOT NULL,
    hora_registro TIME NOT NULL,
    CONSTRAINT pkid_cliente PRIMARY KEY(id_cliente));
    
INSERT INTO clientes VALUE
(NULL, 'Bruno Gressler da Silveira', '03154619003', 26, NOW(), NOW()),
(NULL, 'Alessandro Gressler da Silveira', '00000000000', 39, NOW(), NOW()),
(NULL, 'Cristiano Gressler da Silveira', '00000000001', 28, NOW(), NOW());

DESCRIBE clientes;

SElECT * FROM clientes;

CREATE TABLE frutas (
	id_fruta INT AUTO_INCREMENT NOT NULL,
	nome VARCHAR(50) NULL,
    valor FLOAT(2.10) NULL,
    quantidade INT NULL,
    data_registro DATE NOT NULL,
    hora_registro TIME NOT NULL,
    CONSTRAINT pkid_fruta PRIMARY KEY(id_fruta));
    
INSERT INTO frutas VALUES
(NULL, 'Abacaxi', 10.00, 50, NOW(), NOW()),
(NULL, 'Abacate', 12.50, 30, NOW(), NOW()),
(NULL, 'Pitaia', 31.10, 50, NOW(), NOW());

DESCRIBE frutas;

SElECT * FROM frutas;

CREATE TABLE quitandas (
	id_quitanda INT AUTO_INCREMENT NOT NULL,
	nome VARCHAR(50) NULL,
    cliente VARCHAR(50) NULL,
    funcionario VARCHAR(50) NULL,
    data_registro DATE NOT NULL,
    hora_registro TIME NOT NULL,
    CONSTRAINT pkid_quitanda PRIMARY KEY(id_quitanda));
    
INSERT INTO quitandas VALUES
(NULL, 'Quitanda do seu madruga', 'Seu Osvalldo', 'KIKO', NOW(), NOW()),
(NULL, 'Quitanda do José', 'Josefina', 'Madalena', NOW(), NOW()),
(NULL, 'Quitanda dos macacos', 'KAKO', 'Chita', NOW(), NOW());

DESCRIBE quitandas;

SElECT * FROM quitandas;