# Write your MySQL query statement below
select name,bonus from Employee e LEFT JOIN bonus b on e.empid=b.empid where b.bonus<1000 or b.bonus IS NULL;