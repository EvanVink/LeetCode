-- Last updated: 4/3/2026, 9:39:22 PM
# Write your MySQL query statement below
SELECT customer_id, COUNT(customer_id) AS count_no_trans
FROM Visits
LEFT JOIN Transactions
ON Visits.visit_id = Transactions.visit_id
WHERE Transactions.transaction_id IS NULL
GROUP BY customer_id