create database busresv;
use busresv;
create table bus(
busno int  primary key,
ac boolean,
capacity int
);
insert into bus values(1,1,2);
insert into bus values(2,1,48);
insert into bus values(3,0,52);
select * from bus;
create table booking(
pasname varchar(30),
bus_no int,
trav_date date);
select * from booking;
select capacity from bus where busno=3;
show tables;
describe booking;