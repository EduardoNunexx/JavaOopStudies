/*Update commands*/
/*updating just one column(attribute)*/
update states set nme='maranhão' where letters='MA'
/*updating 2 attributes at the same time*/
update states set nme='marrocos', population=100.12 where letters='PR'


select * from states where letters='PR'
