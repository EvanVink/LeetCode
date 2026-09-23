-- Last updated: 9/23/2026, 9:24:27 AM
# Write your MySQL query statement below
SELECT product_name, year, price
FROM Sales
INNER JOIN Product
ON Sales.product_id = Product.product_id;