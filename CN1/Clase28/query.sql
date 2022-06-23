DROP database if exists clase28;

create database clase28;

use clase28;

create table USUARIO(
	id INT(11) primary key auto_increment,
	username VARCHAR(255) unique not null,
  password VARCHAR(255) not null,
	nombre VARCHAR(50) not null,
  apellido VARCHAR (50) not null,
  email VARCHAR(255) not null,
  is_admin BIT default 0
);
