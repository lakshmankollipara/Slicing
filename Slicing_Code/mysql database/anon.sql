mysql -u root -p
123456

drop database anon;
create database anon;
use anon;

create table users(userId varchar(255) NOT NULL,password text,name text,address text,country text,zip text,email varchar(255),salary varchar(255),sex text,language text,about text,status text,PRIMARY KEY(userId),unique(email));

insert into users values ('admin','admin','admin','####','country','zip','admin@admin.com','100000','Female','en','administrator','yes');

