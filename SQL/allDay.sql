
/*
AND OPERATOR:
*/
SELECT * , SAL * 6 AS HALF_TERM 
FROM EMP 
WHERE HIREDATE > '1981-4-30' AND SAL > 2000 AND JOB = 'MANAGER';

SELECT *, SAL * 6 AS HALF_TERM FROM EMP 
WHERE HIREDATE > '1979-12-31' AND HIREDATE < '1981-01-01' AND SAL*6 < 7000;


/*
OR OPERATOR
*/
SELECT * 
FROM EMP;

SELECT *
FROM EMP
WHERE JOB = "CEO" OR SAL > 3000;

SELECT * FROM EMP
WHERE JOB = "ANALYST" OR JOB = "CLERK"  OR JOB = "SALESMAN";

/*
COMBINATION OR, AND  OPERATOR:
*/

SELECT * 
FROM EMP
WHERE (JOB = "SALESMAN" OR JOB = "ANALYST") AND SAL > 2000;

SELECT * 
FROM EMP
WHERE ( JOB = "SALESMAN"  OR JOB = "MANAGER"  AND  SAL > 2000 AND SAL < 5000) 
AND (HIREDATE >= '1982-01-01' AND HIREDATE < "1987-01-01"); 

/*
NOT OPERATOR:
*/

SELECT *
FROM EMP
WHERE SAL > 2000 AND NOT JOB = "MANAGER";

SELECT *
FROM EMP
WHERE SAL*12 < 15000 AND NOT (JOB = "MANAGER" AND JOB = "SALESMAN");

SELECT * FROM EMP
WHERE DEPTNO = 10 OR DEPTNO = 20 OR DEPTNO = 30 OR DEPTNO = 40;

/*
IN OPERATOR:
*/

SELECT * FROM EMP
WHERE DEPT IN (10 , 20, 30, 40);


SELECT * FROM EMP
WHERE JOB IN ('ANALYST', 'CLERK', 'SALESMAN') 
AND HIREDATE >= '1981-01-01' AND DEPTNO IN (10, 30);


SELECT ENAME, JOB, HIREDATE
FROM EMP
WHERE HIREDATE < "1987-01-01" AND JOB IN ('CLERK', 'MANAGER') AND DEPTNO NOT IN (20, 30); 


SELECT *, SAL*6 AS HALF_TERM
FROM EMP
WHERE (SAL BETWEEN 1000 AND 5000 )
AND JOB NOT IN ('SALESMAN', 'ANALYST');

SELECT * 
FROM EMP
WHERE (SAL BETWEEN 2001 AND 5999)
AND (HIREDATE BETWEEN '1979-01-01' AND '1985-12-31');


/*
2 FEB 2026
*/

/*
IS
IS
IS NOT
*/

SELECT *
FROM EMP
WHERE SAL NOT BETWEEN 1000 AND 3000;

-- WAQTD DETAILS OF THE EMPLOYEES IF EMPLOYEE ARE NOT HIRED IN THE YEAR 81.
SELECT *
FROM EMP
WHERE HIREDATE NOT BETWEEN '01-JAN-1981' AND '31-DEC-1981';

-- WAQTD ENAME, SAL, HIREDATE IF EMPLOYEE IS NOT HIRE AGTER 81 BUT BEFORE 87
SELECT ENAME, SAL, HIREDATE
FROM EMP
WHERE HIREDATE NOT BETWEEN '01-JAN-1982' AND '31-DEC-1986';


-- DETAILS OF EMPLOYEE WHO ARE NOT EARNING COMMISION
SELECT * FROM EMP;
SELECT * FROM EMP
WHERE COMM IS NULL OR COMM = 0;

-- DETAILS OF EMPLIYEE WHO DON'T HAVE REPORTING MANAGER BUT HE IS EARNING MORE THAN
-- 3000 AND LESS THAN 6000
SELECT * FROM EMP
WHERE (MGR IS NULL OR MGR = 0) AND (SAL BETWEEN 3001 AND 5999);

-- WRITE A QUERY TO DISPLAY THE DETAILS OF EMPLOYEE WHO IS NOT EARNING COMMISION 
-- BUT THEY HAVE REPORTING MANAGER
SELECT * FROM EMP
WHERE (COMM = 0 OR COMM IS NULL) AND MGR IS NOT NULL;


/*
LIKE OPERATOR
*/

SELECT ENAME FROM EMP
WHERE ENAME LIKE '%A%';

-- DETAILS OF EMPLOYEE IF THEY HAVE CHARACTER 'MAN' IN THEIR JOB
SELECT *
FROM EMP
WHERE JOB LIKE '%MAN%';

-- DETAILS OF EMPLOYEE IF THEY HAVE CHARACTER 'A' OR CHAR 'S' IN THEIR JOB 
-- AND THEIR SALARY STARTING WITH THE DIGIT OF '50';
SELECT * 
FROM EMP
WHERE (JOB LIKE '%A%' OR JOB LIKE '%S%') AND SAL LIKE '50%';


-- DETAILS OF EMPLOYEE IF THEY ARE HIRED IN THE MONTH OF DECEMBER
SELECT * FROM EMP
WHERE HIREDATE LIKE '_____12%';

SELECT * FROM EMP
WHERE HIREDATE LIKE '%-12-%';

-- DIPLAY DETAILS OF EMPLOYEE IF THEY ARE HIRE IN THE YEAR 1981 AND 4 DIGIT SALARY
SELECT * FROM EMP
WHERE HIREDATE LIKE '1981%' AND SAL LIKE '____.%';

-- QUERY TO DISPLAY NAME , ANNUAL SLARY
-- AND HALF_YERM SALARY ALONG WITH JOB IF THE EMPLOYEES ARE HIRED
-- AFTER 1982 AND BEFORE 89 AND THEY DON'T HAVE 3 DIGIT SALARY
-- BUT THEY ARE WORKING IN DEPNO 10 AND 30 AS A SALESMAN OR ANALYST
-- BUT THEY HAVE A REPORTING MANAGER.

SELECT 
	concat('MR.', ENAME) AS NAME,
    SAL*12 AS 'ANNUAL SALARY',
    SAL*6 AS 'HALF_TERM SALARY',
    JOB
FROM EMP
WHERE
	(HIREDATE BETWEEN '1983-01-01' AND '1989-12-31')
	AND (SAL NOT LIKE '___.__')
	AND (DEPTNO IN (10,30))
	AND (JOB IN ('SALESMAN', 'ANALYST'))
	AND (MGR IS NOT NULL);
    
    
-- Q. display number of employees along with their maxium salary if they are working a=in deptno 10 0r 30
select count(*) as emp_count, max(sal) as max_salary
from emp
where deptno in (10, 30);

-- Q. display number of emp working in deptno 10 if they have reporting manager
select count(*) 
from emp 
where deptno = 10 and mgr is not null;

-- Q. dipslay no of emp working in each dept
select count(*)
from emp
group by deptno;

-- Q. display maximum sak of emp in each dep
select max(sal) as maximum_salary, deptno
from emp
group by deptno;

-- Q. display number of emp working in each dept if their salary is more than 2000 and they are working as clerk.
select count(*) as employee_count
from emp
where sal > 2000 and job = 'CLERK'
group by deptno;

-- Q. display unique salaries
select sal
from emp
group by sal;

-- Q. number of time salries have been repeated in emp table
select sal, count(sal) as count
from emp
group by sal;

-- Q. query to display total salaries of emp working in each job if their job is clerk or salesman and they are hired in the year of 1981
select sum(sal), job, count(job)
from emp
where
	job in ('clerk', 'SALESMAN')
    and hiredate like '1981%'
group by job;

-- Q. number of employee working ine ach dept if there are alleast 2 employees working in each dept
select count(*) as total_emp, deptno
from emp
group by deptno
having count(*) > 2;

-- Q. display max and min of sal in each job if the max sal is greater than 3000
select max(sal), min(sal), job
from emp
group by job
having max(sal) > 3000;

-- Q. display salaries that repeats more than one
select sal as salary, count(sal) as sal_count
from emp
group by sal
having count(sal) > 1;

-- Q. Query to display maximum salary of emp in each job working as either analyst or clerk annd their deptno is 20 and max sal > 2000 and their sal is more than 1000
select max(sal), job
from emp
where job in ('ANALYST', 'CLERK') and deptno = 20 and sal > 1000
group by job
having max(sal) > 2000;

-- a query which in written inside another query is called subquery
/*
-- when/why do we subquery
1. whenever we have a know or indrect condition in the question then we use the concecpt of subquery
*/

-- display emp earning less than jones sal
select ename ,sal
from emp 
where sal > (
	select sal from emp where ename = 'JONES'
);

-- display name of the employee along with annoual salary whoi are hired befiore james and earning more than 1000.
select ename, sal*12 as annual_sal
from emp
where sal > 1000 and hiredate < (
	select hiredate from emp where ename = 'james'
);

-- Q. display name deptno of emp working in james dept and earning more than 2000
select ename, sal, deptno
from emp
where sal > 2000 and deptno = (
	select deptno from emp where ename = 'james'
);

-- Q. display emp earning more than smith but less than king
select * 
from emp
where sal > (select sal from emp where ename = 'smith') and sal < (select sal from emp where ename = 'king');

/*
same dept as james
sal more than adams
job same as miller
hiredate after maritn
*/
select ename
from emp
where deptno = (select deptno from emp where ename = 'james')
 and sal > (select sal from emp where ename = 'adams')
 and job = (select job from emp where ename = 'miller')
 and hiredate > (select hiredate from emp where ename = 'martin');
 









-- 