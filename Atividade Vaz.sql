/*  0 - criação da tabela */

CREATE Database Carroslegais

/*  A - criando tabela */
CREATE Table Veiculos (
Placa CHAR(7) NOT NULL PRIMARY KEY,  
Modelo VARCHAR(20),
Fabricante VARCHAR(20),
Ano int,
Cor VARCHAR(20),
Combustivel VARCHAR(20),
Preco NUMERIC(10,2)
);

/*  B) 10+ registros */
INSERT INTO Veiculos (Placa, Modelo, Fabricante, Ano, Cor, Combustivel, Preco) VALUES
('KAA1000', 'Corsa', 'Chevrolet', 2002, 'Prata', 'Gasolina', 14500.00),
('KBB2000', 'Astra', 'Chevrolet', 2008, 'Preto', 'Flex', 24900.00),
('KCC3000', 'Vectra', 'Chevrolet', 2010, 'Cinza', 'Flex', 31000.00),
('KDD4000', 'Corolla', 'Toyota', 2004, 'Bege', 'Gasolina', 28500.00),
('KEE5000', 'Corolla', 'Toyota', 2009, 'Preto', 'Flex', 42000.00),
('KFF6000', 'Fielder', 'Toyota', 2007, 'Prata', 'Flex', 33500.00),
('KGG7000', 'Fiesta', 'Ford', 2005, 'Vermelho', 'Flex', 16800.00),
('KHH8000', 'Focus', 'Ford', 2009, 'Prata', 'Flex', 26000.00),
('KII9000', 'EcoSport', 'Ford', 2008, 'Preto', 'Flex', 29900.00),
('KJJ1010', 'Ka', 'Ford', 2010, 'Branco', 'Flex', 18500.00),
('OLD1980', 'Chevette', 'Chevrolet', 1982, 'Azul', 'Álcool', 18500.00),
('OLD1983', 'Opala', 'Chevrolet', 1985, 'Preto', 'Gasolina', 45000.00),
('OLD1986', 'Escort XR3', 'Ford', 1988, 'Vermelho', 'Álcool', 38000.00),
('OLD1989', 'Monza', 'Chevrolet', 1990, 'Vinho', 'Gasolina', 22000.00),
('OLD1990', 'Del Rey', 'Ford', 1987, 'Dourado', 'Álcool', 19900.00),
('GMM1111', 'Kadett', 'Chevrolet', 1994, 'Vermelho', 'Gasolina', 16500.00),
('GMM2222', 'Omega', 'Chevrolet', 1998, 'Preto', 'Gasolina', 35000.00),
('GMM3333', 'Meriva', 'Chevrolet', 2007, 'Prata', 'Flex', 22800.00),
('GMM4444', 'Cruze', 'Chevrolet', 2014, 'Branco', 'Flex', 58000.00),
('GMM5555', 'Spin', 'Chevrolet', 2018, 'Cinza', 'Flex', 61900.00),
('FIA1234', 'Uno', 'Fiat', 2012, 'Vermelho', 'Flex', 22500.00),
('FIA5678', 'Palio', 'Fiat', 2015, 'Prata', 'Flex', 31000.00),
('FIA9012', 'Siena', 'Fiat', 2010, 'Preto', 'Flex', 24800.00),
('FIA3456', 'Strada', 'Fiat', 2020, 'Branco', 'Flex', 68000.00),
('FIA7890', 'Toro', 'Fiat', 2022, 'Cinza', 'Diesel', 125000.00);



/* C) Select modelos iniciados com F*/
SELECT * From Veiculos
WHERE Modelo LIKE 'F%';

/* D) Select com ano entre 2000 e 2008  */
SELECT * From Veiculos
WHERE Ano BETWEEN 2000 and 2008;

/* E) Select combustivel FLEX  */
SELECT * From Veiculos
WHERE Combustivel LIKE 'Flex';

/* F) Select com fabricante GM e ano 2001+ */
SELECT * From Veiculos
WHERE Fabricante LIKE 'Chevrolet' And Ano > 2001;

/* G) Media de preço dos veiculos e utilizei cast pra ser soh duas casas decimais */
SELECT CAST(AVG(Preco) AS NUMERIC(10,2))AS Media_Preco
FROM Veiculos;

/* H) Valor do Veiculo mais caro */
SELECT CAST(MAX(Preco) AS NUMERIC(10,2))AS Valor_mais_caro
FROM Veiculos;

/* I) Valor do Veiculo mais barato */
SELECT CAST(MIN(Preco) AS NUMERIC(10,2))AS Carro_mais_barato
FROM Veiculos;

/* J) Acrescimo de 10% pros carro Fiat */
UPDATE Veiculos
SET Preco = Preco * 1.10
WHERE Fabricante = 'Fiat';

/*K) Quantos veiculos sao pratas? */
SELECT COUNT(*) AS Qtd_CarrosPratas
From Veiculos
WHERE Cor = 'Prata';

/* L) Somatorio dos preços */
SELECT CAST(SUM(Preco) AS NUMERIC(10,2)) AS Soma_Precos
FROM VEICULOS;

/* M) Excluir carros abaixo de 1985 */
DELETE FROM VEICULOS
WHERE Ano < 1985;

/* N) Selecionar GM FORD Toyota*/
SELECT * 
FROM Veiculos
WHERE Fabricante IN ('Chevrolet', 'Ford', 'Toyota'); 

/* O) Listar Fabricantes sem duplicidade */
SELECT DISTINCT Fabricante
FROM VEICULOS;

/* Comandos q salvam*/
Select * from Veiculos
Delete from Veiculos