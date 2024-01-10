INSERT INTO states
(nme, letters, region, population)
VALUES
('Bahia', 'BA', 'North', 15.34),
('Distrito Federal','DF', 'midwest', 3.04),
('Espírito Santo', 'ES', 'southEast', 4.02),
('Goiás', 'GO', 'midwest', 6.78), 
('Maranhao', 'MA', 'North', 7.00), 
('Mato Grosso', 'MT', 'midwest', 3.34),
('Mato Grosso do Sul', 'MS', 'midwest', 2.71),
('Minas Gerais', 'MG', 'southEast', 21.12),
('Pará', 'PA', 'North', 8.36),
('Paraíba', 'PB', 'North', 4.03),
('Parana', 'PR', 'southEast', 11.22),
('Pernambuco', 'PE', 'North', 9.47),
('Piauí', 'PI', 'North', 3.22),
('Rio de Janeiro', 'RJ', 'southEast', 16.72),
('Rio Grande do North', 'RN', 'North', 3.51),
('Rio Grande do Sul', 'RS', 'southEast', 11.32),
('Rondônia', 'RO', 'North', 1.81),
('Roraima', 'RR', 'North', 0.52),
('Santa Catarina', 'SC', 'southEast', 7.01),
('Sergipe', 'SE', 'North', 2.29),
('Tocantins', 'TO', 'North', 1.55);

--inserting some values in the new table
SELECT * from citys
--common way
INSERT INTO citys (name,area,state_id)VALUES('Campinas',795,4);
--inserting using the select id to get the state id
INSERT INTO citys(name,area,state_id)VALUES('Caruaru',920.6,(SELECT id from states where letters='PE'));
--inserting mayors in the table mayors 
INSERT INTO mayors(name, city_id) 
    VALUES
    ('Rodrigo Neves',1),
    ('Raquel Lyra',2),
    ('Zenaldo coutinho',NULL);
select *from mayors
INSERT INTO mayors(name, city_id) 
    VALUES
    ('Rafael graca',NULL);

--INSERTING COPANYS 
--using alter table to change the cnpj field 
ALTER TABLE companys MODIFY cnpj VARCHAR(14);
--inserting companys
INSERT INTO companys (name, cnpj)
VALUES
('Bradesco', 95694186000132), 
('Vale', 27887148000146), 
('Cielo', 01598317000134);
--using the desc commando to get the data aout the table 
desc companys; 

--inserting the relation between companys and citys 
INSERT INTO companys_nits(company_id, city_id,main) VALUES(1,1,1),(1,2,0),(2,1,0),(2,2,1)