/*Some select examples*/
/*Selecting all the table values*/
Select * FROM states;
/*Selecting all the values of some specifycs colummns */
Select nme,letters from states;
/*Using where*/
Select nme,letters from states where region='midwest';
Select nme,letters from states where region='midwest' AND population>3.5;
/*Ordering ascendent order*/
Select nme,letters from states where population>10 Order by population; 
/*Orderign by descrease order*/
Select nme,letters from states where population>10 Order by population DESC;
/*Giving nick names to selects*/ 
Select nme as 'City Names',letters from states where population>10 Order by population DESC;
/*USING AND*/
SELECT cp.name, ct.name from companys cp, companys_nits cn, citys ct where cp.id=cn.company_id and ct.id=cn.city_id
