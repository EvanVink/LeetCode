-- Last updated: 9/23/2026, 9:24:19 AM
# Write your MySQL query statement below
SELECT unique_id, name
FROM Employees
LEFT JOIN EmployeeUNI
ON EmployeeUNI.id = Employees.id;