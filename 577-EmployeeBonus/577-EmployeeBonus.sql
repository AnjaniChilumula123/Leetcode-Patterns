-- Last updated: 7/28/2025, 12:30:03 PM
# Write your MySQL query statement below
SELECT Employee.name , Bonus.bonus
FROM Employee 
LEFT JOIN Bonus 
ON Employee.empId = Bonus.empid
WHERE Bonus.bonus < 1000 OR Bonus.bonus IS null
