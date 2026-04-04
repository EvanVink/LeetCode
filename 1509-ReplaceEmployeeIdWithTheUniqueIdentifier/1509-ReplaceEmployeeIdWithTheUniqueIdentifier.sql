-- Last updated: 4/3/2026, 9:39:19 PM
# Write your MySQL query statement below
SELECT unique_id, name
FROM Employees
LEFT JOIN EmployeeUNI
ON EmployeeUNI.id = Employees.id;