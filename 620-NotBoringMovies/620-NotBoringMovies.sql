-- Last updated: 7/28/2025, 12:30:00 PM
# Write your MySQL query statement belowselec
select id , movie , description , rating from Cinema 
where id%2 != 0 and description != "boring"
order by rating desc