select empid,empname,job,salary,e.deptname,location,manpower,manager,Year(dt_of_joining) as jnYear from emps as e right join dept as d on e.deptname=d.deptname; 
