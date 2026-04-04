-- Last updated: 4/3/2026, 9:39:26 PM
# Write your MySQL query statement below
SELECT name, bonus
FROM Employee
LEFT JOIN Bonus
ON Employee.empID = Bonus.empID
WHERE Bonus.bonus IS NULL
OR Bonus.bonus < 1000