create table hobby(id int(10), name varchar(45), primary key(id));
create table employee(id int(10), first_name varchar(20), last_name varchar(20), age tinyint(3), mobile_number varchar(17), address varchar(70), primary key(id));
create table employee_salary(id int(10), salary decimal(15,2), date date, fk_employee_id int(10), foreign key(fk_employee_id) references employee(id), primary key(id));
create table employee_hobby(id int(10), fk_employee_id int(10), fk_hobby_id int(10), foreign key(fk_employee_id) references employee(id), foreign key(fk_hobby_id) references hobby(id), primary key(id));

select * from hobby;
select * from employee;
select * from employee_salary;
select * from employee_hobby;

insert into hobby(id, name) values (101, 'sport');
insert into hobby(id, name) values (102, 'singing');
insert into hobby(id, name) values (103, 'travelling');
insert into hobby(id, name) values (104, 'reading');
insert into hobby(id, name) values (105, 'sport');

insert into employee(id , first_name, last_name, age, mobile_number, address) values (101, 'Ramesh', 'Patel', 25, 7202001555, '1,Shivlekha society,naroda,Ahmedabad.');
insert into employee(id , first_name, last_name, age, mobile_number, address) values (102, 'Suresh', 'Shah', 21, 9875263410, '55,Krishna Recidency,naroda,Ahmedabad.');
insert into employee(id , first_name, last_name, age, mobile_number, address) values (103, 'Mahesh', 'Patel', 24, 7202001555, '14,Skycity apratment,nikol,Ahmedabad.');
insert into employee(id , first_name, last_name, age, mobile_number, address) values (104, 'Vishal', 'Verma', 22, 9789634150, '5,Krishnakunj Recidency,nikol,Ahmedabad.');
insert into employee(id , first_name, last_name, age, mobile_number, address) values (105, 'Parth', 'Sharma', 26, 7769846125, '77,maruti bunglows,nikol,Ahmedabad.');

insert into employee_salary(id, salary, date) values (101, 20000.00, '2022-01-05');
insert into employee_salary(id, salary, date) values (102, 22000.00, '2022-01-11');
insert into employee_salary(id, salary, date) values (103, 18000.00, '2022-01-26');
insert into employee_salary(id, salary, date) values (104, 12000.00, '2022-01-01');
insert into employee_salary(id, salary, date) values (105, 26000.00, '2022-01-21');

insert into employee_hobby(id) values (101);
insert into employee_hobby(id) values (102);
insert into employee_hobby(id) values (103);
insert into employee_hobby(id) values (104);
insert into employee_hobby(id) values (105);

delete from hobby where id = 101;
delete from hobby where id = 105;

delete from employee where id = 101;
delete from employee where id = 105;

delete from employee_salary where id = 101;
delete from employee_salary where id = 105;

delete from employee_hobby where id=101;
delete from employee_hobby where id=105;

truncate table employee_salary;
truncate table employee_hobby;
truncate table hobby;
truncate table employee;


