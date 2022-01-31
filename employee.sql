-- Create a tables(hobby, employee,employee_salary, employee_hobby)
create table hobby(id int(10), name varchar(45), primary key(id));
create table employee(id int(10), first_name varchar(20), last_name varchar(20), age tinyint(3), mobile_number varchar(17), address varchar(70), primary key(id));
create table employee_salary(id int(10), salary decimal(15,2), date date, fk_employee_id int(10), foreign key(fk_employee_id) references employee(id), primary key(id));
create table employee_hobby(id int(10), fk_employee_id int(10), fk_hobby_id int(10), foreign key(fk_employee_id) references employee(id), foreign key(fk_hobby_id) references hobby(id), primary key(id));

-- Separate select query to get a hobby, employee, employee_salary,employee_hobby
select * from hobby;
select * from employee;
select * from employee_salary;
select * from employee_hobby;

-- Insert data into hobby table
insert into hobby(id, name) values (1, 'sport');
insert into hobby(id, name) values (2, 'singing');
insert into hobby(id, name) values (3, 'travelling');
insert into hobby(id, name) values (4, 'writing');
insert into hobby(id, name) values (5, 'photography');

-- Insert data into employee table
insert into employee(id , first_name, last_name, age, mobile_number, address) values (101, 'Ramesh', 'Patel', 25, 7202001555, '1,Shivlekha society,naroda,Ahmedabad.');
insert into employee(id , first_name, last_name, age, mobile_number, address) values (102, 'Suresh', 'Shah', 21, 9875263410, '55,Krishna Recidency,naroda,Ahmedabad.');
insert into employee(id , first_name, last_name, age, mobile_number, address) values (103, 'Mahesh', 'Patel', 24, 7202001555, '14,Skycity apratment,nikol,Ahmedabad.');
insert into employee(id , first_name, last_name, age, mobile_number, address) values (104, 'Vishal', 'Verma', 22, 9789634150, '5,Krishnakunj Recidency,nikol,Ahmedabad.');
insert into employee(id , first_name, last_name, age, mobile_number, address) values (105, 'Parth', 'Sharma', 26, 7769846125, '77,maruti bunglows,nikol,Ahmedabad.');

-- Insert data into employee_salary table
insert into employee_salary(id, salary, date, fk_employee_id) values (101, 20000.00, '2022-01-05', 101);
insert into employee_salary(id, salary, date, fk_employee_id) values (102, 22000.00, '2022-01-11', 102);
insert into employee_salary(id, salary, date, fk_employee_id) values (103, 18000.00, '2022-01-26', 103);
insert into employee_salary(id, salary, date, fk_employee_id) values (104, 12000.00, '2022-01-01', 104);
insert into employee_salary(id, salary, date, fk_employee_id) values (105, 26000.00, '2022-01-21', 105);

-- Insert data into employee_hobby table
insert into employee_hobby(id, fk_employee_id, fk_hobby_id) values (101, 101, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id) values (102, 102, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id) values (103, 103, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id) values (104, 104, 4);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id) values (105, 105, 5);

-- update data into employee table
update employee set mobile_number = 9874563691 where id = 102;
update employee set address = '21,gopichand vila,krishnanagar road,Ahmedabad.' where id = 101;

-- update data into employee_salary table
update employee_salary set salary = 21000 where id = 103;
update employee_salary set salary = 25000 where id = 102;

-- delete records from employee_salary table
delete from employee_salary where id = 101;
delete from employee_salary where id = 105;

-- delete records from employee_hobby table
delete from employee_hobby where id=101;
delete from employee_hobby where id=105;

-- delete records from hobby table
delete from hobby where id = 1;
delete from hobby where id = 5;

-- delete records from employee table
delete from employee where id = 101;
delete from employee where id = 105;

-- Truncate all the tables
truncate table employee_salary;
truncate table employee_hobby;

set foreign_key_checks = 0;
truncate table hobby;
set foreign_key_checks = 0;

set foreign_key_checks = 0;
truncate table employee;
set foreign_key_checks = 0;

-- Select single query to get all employee name, hobby_name in single column
select first_name from employee union select name from hobby;

-- Select query to get employee name, his/her employee_salary
select concat(e.first_name, ' ',e.last_name) as full_name,es.salary from employee as e inner join employee_salary as es on e.id = es.fk_employee_id;

