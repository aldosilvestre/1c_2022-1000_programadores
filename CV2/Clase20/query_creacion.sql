-- Si existe la BD 'clase20' la borra
DROP DATABASE IF EXISTS clase20;

-- Crea la base de datos
create database clase20;

-- Se le dice que usaremos la base de datos clase20 que acabamos de crear
use clase20;

-- Borramos la tabla ALUMNOS si existe
DROP TABLE IF EXISTS ALUMNO;


-- Borramos la tabla CARRERA si existe
DROP TABLE IF EXISTS CARRERA;

-- Creamos las tablas que usaremos
create table CARRERA(
	id int auto_increment primary key,
    nombre varchar(255) not null,
	cant_materias int not null default 0
);

create table ALUMNO(
	id int auto_increment primary key,
    nombre varchar(255) not null,
	apellido varchar(255) not null,
    carrera int,
	foreign key (carrera) references CARRERA(id)
);

-- Muesta las tablas creadas
show tables;

-- Insertamos la informacion de las carreras
INSERT INTO CARRERA(nombre, cant_materias) 
VALUES("Tecnicatura en Higiene y Seguridad", 20),
	  ("Licenciatura en Recursos Naturales", 26),
      ("Arquitectura", 30),
      ("Ingenieria Civil", 42), 
      ("Ingenieria Mecanica", 45), 
      ("Ingenieria Informatica", 43),
      ("Ingenieria Textil", 40),
      ("Ingenieria Electronica", 43);

-- Insertamos registros de alumnos
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Gabriel", "Benitez", 2);
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("David", "Perez", 5);
INSERT INTO ALUMNO(nombre, apellido) VALUE("Maria", "Villaroel");
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Monica", "Hurtado", 2);
INSERT INTO ALUMNO(nombre, apellido) VALUE("Damian", "Hurtado");
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Aldo", "Silvestre", 6);
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Gaston", "Gomez", 7);
INSERT INTO ALUMNO(nombre, apellido) VALUE("Enrique", "Silveira");
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Jose", "Santos", 4);
INSERT INTO ALUMNO(nombre, apellido, carrera) VALUE("Lucia", "Alvares", 3);
