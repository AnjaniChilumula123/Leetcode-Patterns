-- Last updated: 7/28/2025, 12:29:24 PM
# Write your MySQL query statement below
SELECT Product.product_name , Sales.year,Sales.price
FROM Product
RIGHT JOIN Sales
ON Product.product_id = Sales.product_id;