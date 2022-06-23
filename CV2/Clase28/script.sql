create database clase28;

use clase28;

create table USUARIO (
	id bigint primary key auto_increment,
	nombre varchar(100) not null,
    apellido varchar(100) not null,
    email varchar(255) not null,
    username varchar(50) not null unique,
    password varchar(50) not null,
    is_admin bit default 0 -- 0 == false ; 1 == true
);


