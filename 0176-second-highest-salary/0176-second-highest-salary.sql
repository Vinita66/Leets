# Write your MySQL query statement below
select  MAX(salary) AS SecondHighestSalary
from  Employee
WHERE SALARY < (select  MAX(salary) 
from  Employee);