# Write your MySQL query statement below
-- select DISTINCT s.name from SalesPerson s JOIN Orders o ON s.sales_id=o.sales_id

-- JOIN Company c ON o.com_id=c.com_id where c.name!="RED";

select name 
from SalesPerson 
where Sales_id not in (select sales_id 
from Orders 
where com_id = (select com_id 
from Company 
where name="RED"));