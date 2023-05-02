create database college;
use college;
create table students(id int, first_name varchar(10), last_name varchar(10), marks int);
insert into students values (1, "Samatha", "Anthireddy", 93), (2, "Vinay", "Teegela", 95), (3, "Vidya", "T", 97);
update students SET last_name = "Reddy" where id = 3;
select * from students;
delete from students where id = 3;
select * from students;