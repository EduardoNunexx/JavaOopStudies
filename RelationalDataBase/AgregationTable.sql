/*Select agregation commands*/
/*sum the total population value of states table*/
select sum(population) as 'Total Population' from states
/*grouping by region and using desc*/
select region as 'Region', sum(population) as 'TotalPopulation' from states GROUP BY region order by TotalPopulation DESC
/*Using the avg to calc the average*/
select avg(population) as 'Average population' from states