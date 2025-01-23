create database employeemanagement;
use employeemanagement;
select * from login;
create table login(username varchar(20), password varchar(20));
select * from login;
insert into login values('gautamsachdev', '287852');
insert into login values('atulkumar', 'ojha@2004');
insert into login values('nitishkumar', 'Yadavji');
insert into login values('vikashkumar', 'Vikash@123');

create table employees(
name varchar(40), 
fname varchar(40), 
dob varchar(40), 
address varchar(40), 
salary varchar(40), 
phone int(11), 
email varchar(40), 
education varchar(40), 
aadhar varchar(40), 
empId varchar(40), 
designation varchar(40)
);
select * from employees;
drop table employees;
create table employees(
name varchar(40), 
fname varchar(40), 
dob varchar(40), 
salary varchar(40),
address varchar(40), 
phone varchar(40), 
email varchar(40), 
education varchar(40), 
designation varchar(40),
aadhar varchar(40), 
empId varchar(40) 
);
DELETE from employees where empId = "214931";