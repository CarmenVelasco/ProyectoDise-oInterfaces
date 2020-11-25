create database if not exists proyecto_mecanica;

create table if not exists concesionario(
id_concesionario int primary key auto_increment,
cif varchar(50) unique not null,
nombre_concesionario varchar(100) not null,
provincia varchar(50),
direccion_concesionario varchar(250) not null,
descripcion_concesionario text
);

create table if not exists cliente(
id_cliente int primary key auto_increment,
nombre_cliente varchar(50) not null,
nif_cliente varchar(50) not null unique,
email_cliente varchar(250),
num_cuenta varchar(100)
);

create table if not exists especialidad(
id_especialidad int primary key auto_increment,
nombre_especialidad varchar(100),
descripcion_especialidad text
);

create table if not exists usuario(
id_usuario int  primary key auto_increment,
id_concesionario int,
nombre_usuario varchar(100) not null unique,
contrasenia varchar(50) not null,
antiguedad year,
sueldo decimal(7,2),
tipo_contrato varchar(250),
nif_usuario varchar(50) not null unique,
email_usuario varchar(100) not null,
estudios varchar(250),

constraint fk_usuario_concesionario foreign key(id_concesionario) references concesionario(id_concesionario)
);

create table if not exists mecanico(
id_mecanico int primary key auto_increment,
id_usuario int,
id_especialidad int,
id_jefemecanico int,

constraint fk_mecanico_usuario foreign key(id_usuario) references usuario(id_usuario),
constraint fk_mecanico_especialidad foreign key(id_especialidad) references especialidad(id_especialidad)
);

alter table mecanico
add constraint fk_mecanico_mecanico foreign key(id_jefemecanico) references mecanico(id_mecanico);

create table if not exists venta(
id_ventas int primary key auto_increment,
id_usuario int,
num_vendidos int,
fecha_venta datetime,

constraint fk_venta_usuario foreign key(id_usuario) references usuario(id_usuario)
);

create table if not exists jefe(
id_jefe int primary key auto_increment,
id_usuario int,

constraint fk_jefe_usuario foreign key(id_usuario) references usuario(id_usuario)
);

create table if not exists vehiculo(
id_vehiculo int primary key auto_increment,
id_concesionario int,
id_cliente int,
id_ventas int,
num_bastidor varchar(100) not null,
matricula varchar(10) default null,
marca varchar(50) not null,
modelo varchar(50) not null,
tipo_vehiculo enum('Nuevo', 'Segunda mano', 'Km 0'),
color varchar (50),
potencia varchar(10) not null,
anio year,
combustible enum('Electrico', 'Hibrido', 'Gasolina', 'Gasoil'),
precio decimal(11,2),
descripcion_vehiculo text,

constraint fk_vehiculo_concesionario foreign key(id_concesionario) references concesionario(id_concesionario),
constraint fk_vehiculo_cliente foreign key(id_cliente) references cliente(id_cliente),
constraint fk_vehiculo_venta foreign key(id_ventas) references venta(id_ventas)
);

create table if not exists coche(
id_coche int primary key auto_increment,
id_vehiculo int,
tipo_radio varchar(50),
tipo_freno varchar(50),
tipo_embrague varchar(50),
tipo_emision enum('O', 'B', 'C', 'ECO'),
numero_plaza enum('2','4','5','7','8','9'),

constraint fk_coche_vehiculo foreign key(id_vehiculo) references vehiculo(id_vehiculo)
);

create table if not exists motocicleta(
id_motocicleta int primary key auto_increment,
id_vehiculo int,
tipo_motocicleta varchar(50) not null,
tipo_freno varchar(50),
tipo_horquilla varchar(50),
numero_plaza enum('1','2','3'),

constraint fk_coche_motocicleta foreign key(id_vehiculo) references vehiculo(id_vehiculo)
);

create table if not exists ciclomotor(
id_ciclomotor int primary key auto_increment,
id_vehiculo int,
tipo_ciclomotor varchar(50) not null,

constraint fk_coche_ciclomotor foreign key(id_vehiculo) references vehiculo(id_vehiculo)
);

create table if not exists propuesta(
id_propuesta int primary key auto_increment,
id_ventas int,
id_cliente int,
id_vehiculo int,
precio_propuesta decimal(11,2),
fecha_propuesta datetime,
fecha_validez date,
descripcion_propuesta text,

constraint fk_propuesta_vehiculo foreign key(id_vehiculo) references vehiculo(id_vehiculo),
constraint fk_propuesta_ventas foreign key(id_ventas) references venta(id_ventas),
constraint fk_propuesta_cliente foreign key(id_cliente) references cliente(id_cliente)
);

create table if not exists repara(
id_repara int primary key auto_increment,
id_vehiculo int,
id_mecanico int,
inicio_reparacion datetime,
fin_reparacion datetime,
horas_reparacion decimal(5,3),
tipo_reparacion varchar(250) not null,
descripcion_reparacion text,

constraint fk_repara_vehiculo foreign key(id_vehiculo) references vehiculo(id_vehiculo),
constraint fk_repara_mecanico foreign key(id_mecanico) references mecanico(id_mecanico)
);