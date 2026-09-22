# Write your MySQL query statement below
SELECT s.year, s.price, p.product_name
FROM Sales s
JOIN product P
ON s.product_id = p.product_id