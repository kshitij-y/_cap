use scott;
/*
CO-RELATED SUBQUERY
A query written inside another query such that outer query and the inner query are dependant on each other, this is known as co-related query

SELECT e.*
FROM Employees e
WHERE e.salary >
(
  SELECT AVG(e2.salary)
  FROM Employees e2
  WHERE e2.dept_id = e.dept_id
);


in subquery inner query exceutes first
but in co-related query outer -> inner -> outer

join is mandatory in co-related inner query


*/

-- Q. Fourth highest distinct salary
select e1.sal
from emp e1
where 3 in (
	select count(distinct e2.sal)
	from emp e2
	where e1.sal < e2.sal
);
    
-- Q. query to display 5th minimum
select e1.sal
from emp e1
where 4 in (
	select count(distinct e2.sal)
	from emp e2
    where e1.sal > e2.sal
);
    
-- Q. query to display 2nd maximum sal of each dept
select 
    max(e1.sal),
    e1.deptno
from emp e1
where e1.sal < (
    select max(e2.sal)
    from emp e2
    where e2.deptno = e1.deptno
)
group by e1.deptno;

-- Q. query to display details of employee wose salary is greater than the avg salary of the table
select
	e1.sal,
    e1.ename
from emp e1
where e1.sal > (
	select avg(sal) from emp
);

-- Q. query to display details of of emp whose sal is greater than avg sal of their own dept
select 
	e1.*
from emp e1
where e1.sal > (
	select avg(e2.sal)
    from emp e2
    where e1.deptno = e2.deptno
);
    
SELECT SUBSTRING("kshitij", 1);
SELECT SUBSTRING('foobarbar' FROM 4);
SELECT SUBSTRING('Quadratically',5,6);
SELECT SUBSTRING('Sakila', -3);
SELECT SUBSTRING('Sakila', -5, 3);
SELECT SUBSTRING('Sakila' FROM -4 FOR 2);

select distinct job 
from emp
where substr(job, 1,1) in ('A', 'E', 'I', 'O', 'U');
    
SELECT SUBSTRING_INDEX("Quadratically", "c", -3);
SELECT INSTR("W3Schools.com", "3") AS MatchPosition;
SELECT INSTR("YASHRAJ", "A");
