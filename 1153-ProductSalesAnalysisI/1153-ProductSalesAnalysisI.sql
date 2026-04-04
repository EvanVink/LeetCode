-- Last updated: 4/3/2026, 9:39:24 PM
# Write your MySQL query statement below
SELECT product_name, year, price
FROM Sales
INNER JOIN Product
ON Sales.product_id = Product.product_id;