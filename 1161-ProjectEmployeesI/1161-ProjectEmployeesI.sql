-- Last updated: 7/28/2025, 12:29:23 PM
# Write your MySQL query statement below
select project_id , round(avg(Employee.experience_years),2) as average_years 
from Project left join Employee 
on Project.employee_id = Employee.Employee_id
group by Project.project_id