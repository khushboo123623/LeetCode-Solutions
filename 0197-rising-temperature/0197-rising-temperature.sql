# Write your MySQL query statement below
SELECT t1.id 
from Weather as t1, Weather as t2
where datediff(t1.recordDate,t2.recordDate) = 1
and t1.temperature > t2.temperature;

