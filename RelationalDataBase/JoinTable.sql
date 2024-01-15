--creating a selest using two tables
Select ct.name,st.nme, region from citys ct, states st WHERE ct.state_id=st.id
--doing the same select using inner join
SELECT ct.name as 'citys_name', st.nme as'state_name' from states st inner Join citys ct on st.id=ct.state_id;
--iNNER JOIN
SELECT * from citys ct INNER JOIN mayors m on ct.id=m.city_id;
--RIGHT JOIN 
SELECT * from citys ct RIGHT JOIN mayors m on ct.id=m.city_id;
--LEFT JOIN
SELECT * from citys ct LEFT JOIN mayors m on ct.id=m.city_id;
--FULL JOIN
SELECT * from citys ct RIGHT JOIN mayors m on ct.id=m.city_id
UNION
    SELECT * from citys ct LEFT JOIN mayors m on ct.id=m.city_id;

SELECT * FROM citys;
SELECT * FROM mayors;