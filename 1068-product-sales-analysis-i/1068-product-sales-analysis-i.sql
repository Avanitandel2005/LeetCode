# Write your MySQL query statement below 
select Product.Product_name ,Sales.Year , Sales.price from Sales 
INNER JOIN Product on 
Sales.product_id = Product.product_id;