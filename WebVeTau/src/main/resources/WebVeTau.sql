create database vetau
go
use vetau
go
create table [role](
id varchar(20) primary key,
role_name nvarchar(20)
);
go
create table account(
id int identity(1,1) primary key,
name nvarchar(20),
gender bit,
birthday date,
cmnd char(9),
phone char(10),
[address] nvarchar(50),
email varchar(50)
);
go