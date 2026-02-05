use scott;
/*joins*/
select * from emp;
select * from dept;

desc emp;
desc dept;




-- waqd names of the emp @ their manegers if emp are earning more than 2000
select 
e1.*
from emp e1
join emp e2 on e1.mgr = e2.empno
where e1.sal > 2000;

-- waqd name of the employee and their manager if they emp earn more than their managers and managers are hired after clerk.
select e1.ename, e2.ename
from emp e1 join emp e2
on e1.mgr = e1.empno
where e1.sal > e2.sal and e2.hiredate > ALL(select hiredate from emp where job = 'CLERK');

-- query to display emp if their annual salary is more than their manager and they are hired after emp in 'new york' and their name has character 'A' in it
select 
	e1.*
from emp e1
join emp e2
on e1.mgr = e2.empno
where 
	e1.sal*12 > e2.sal*12
	and e1.hiredate > all(
		select hiredate 
        from emp e 
        join dept d on e.deptno = d.deptno 
        where loc = 'NEW YORK'
	)
    and e2.ename like '%A%';



select
	e1.ename as employee,
    e2.ename as manager,
    e3.ename as manager_manager
from emp e1
join emp e2 on e1.mgr = e2.empno
join emp e3 on e2.mgr = e3.empno
where 
	e1.sal > e2.sal
    and e1.hiredate > (select hiredate from emp where ename = 'BLAKE')
    and e3.deptno in (10 , 30)
    and (e1.ename like '%A%' or e1.ename like '%S%')
    and (e2.ename like '%A%' or e2.ename like '%S%')
    and (e3.ename like '%A%' or e3.ename like '%S%');
    
    
    
SELECT
	e1.ename as employee,
    d1.dname as emp_dept,
    e2.ename as manager,
    d2.dname as mgr_dept,
    e3.ename as manager_manager,
    d3.dname as mgr_mg_dept
FROM emp e1
JOIN emp e2 on e1.mgr = e2.empno
JOIN emp e3 on e2.mgr = e3.empno
JOIN dept d1 on e1.deptno = d1.deptno
JOIN dept d2 on e2.deptno = d2.deptno
JOIN dept d3 on e3.deptno = d3.deptno;


select 
	e1.ename as emp_name,
    e1.hiredate as emp_date,
    e1.ename as mgr_name,
    e2.hiredate as mgr_hiredate
from emp e1
join emp e2 on e1.mgr = e2.empno
join emp e3 on e2.mgr = e3.empno
where e1.hiredate < e2.hiredate
	and e2.hiredate > (select hiredate from emp where ename = 'ADAMS')
    and e3.sal > all(select sal from emp where job = 'CLERK')
    and e1.deptno = (select deptno from dept where dname = 'RESEARCH')
    and e2.deptno = (select loc from dept where loc = 'CHICAGO')
    and e3.deptno = 20;




/*
Outer join
it is used to obtain unmatched records

types of outer join
1. left outer
2. right outer
3. full outer

1. left Outer
it is used to obtain unmathced record only from left table

2. right outer


*/

-- query to display details of employee & their departments even if employee doesn't work in any department
select e1.ename, e1.job, d.deptno, d.dname
from emp e1
left join dept d on d.deptno = e1.deptno;

select e1.ename, e1.job, d.deptno, d.dname
from emp e1
right join dept d on d.deptno = e1.deptno;
























