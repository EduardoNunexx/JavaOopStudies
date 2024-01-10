CREATE TABLE states(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nme VARCHAR(45) NOT NULL,
    letters VARCHAR(2) NOT NULL,
    region ENUM('North','midwest','NorthEast','southEast'),
    population DECIMAL(5,2) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY (nme),
    UNIQUE KEY(letters)
); 

/*inserting a new element into state's table*/
Insert into states (nme,letters,region, population) VALUES('Acre','AC','North',0.83);

/*inserting multiples elements at the same time in the table*/
Insert into states (nme,letters,region, population)
VALUES('Alagoas','AL','midWest',2.5),
('CEARA','CE','NorthEast',4.9),
('SaoPaulo','SP','southEast',9.0);

select * from states;

/*creating the second table to do the relations*/
create table if not exists citys(
    id INT  UNSIGNED not NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    state_id int UNSIGNED NOT NULL,
    area decimal(10,2),
    primary key(id),
    FOREIGN KEY(state_id) REFERENCES states(id)
);
select * from citys;
/*creating the third table mayors*/
CREATE TABLE IF NOT EXISTS mayors(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    city_id int unsigned,
    PRIMARY KEY(id),
    UNIQUE KEY(city_id),
    FOREIGN KEY(city_id) REFERENCES citys(id)
);
--CRATING THE TABLE COMPANYS 
CREATE TABLE IF NOT EXISTS companys(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    cnpj INT UNSIGNED,
    PRIMARY KEY(id),
    UNIQUE KEY(cnpj)
)
--CREATING THE RELATION N-N BETWEEN COMPANYS AND CITYS 
CREATE TABLE IF NOT EXISTS companys_nits(
    company_id INT UNSIGNED NOT NULL,
    city_id INT UNSIGNED NOT NULL,
    main TINYINT(1) NOT NULL
);