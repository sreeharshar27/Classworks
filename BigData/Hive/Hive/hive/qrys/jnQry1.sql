select empid,empname,job,salary,e.deptname,location,manpower,manager,Year(dt_of_joining) as jnYear from emps as e join dept as d on e.deptname=d.deptname; 
