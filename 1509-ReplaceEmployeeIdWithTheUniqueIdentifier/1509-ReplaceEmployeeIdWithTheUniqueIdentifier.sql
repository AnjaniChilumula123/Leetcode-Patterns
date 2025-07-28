-- Last updated: 7/28/2025, 12:29:04 PM
# Write your MySQL query statement below
SELECT EmployeeUNI.unique_id , Employees.name 
FROM Employees 
LEFT JOIN EmployeeUNI
ON EmployeeUNI.id=Employees.id