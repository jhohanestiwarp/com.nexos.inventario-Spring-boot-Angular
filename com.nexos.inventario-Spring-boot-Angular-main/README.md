# com.nexos.inventario-Spring-boot-Angular
sistema de inventario para el sector  automotriz donde se controle la mercancía que ingresa y la que sale
# com.nexos.inventario-Spring-boot-Angular
Sistema de gestión de mercancia.(Logica de negocio CRUD), implementando servicio apirest.



PRUEBA TECNICA:

Empresa: nexos-software.com.co 


INTRODUCCIÓN : Este repositorio consiste en mostrar las habilidades técnicas (Springbook-Java) a travéz de la resolución de los problemas planteados .

TECNOLOGÍA Y PATRONES DE DISEÑO EMPLEADO.

.Patron de diseño -> Inyección de dependencia.

.Rest con el framework -> springbook

.Mapeo objeto-relacional -> Hibernate

.Repositorios de git

.Angular



PLAN DE TRABAJO : El repositorio se realizó en 2 días y para ello se propuso dividir el proyecto en una serie de etapas que se detallarán a continuación :

ETAPA 1 : Plantear la lógica inicial de los problemas.

ETAPA 2 : Creacion y normalizacion de bases de datos .

ETAPA 3 : Plasmar la lógica en código(Api Rest) .

ETAPA 3 : Consumir Api Rest (CLIENTE)

ETAPA 4 : Versión final README.



ARCHIVOS IMPORTANTES El proyecto presenta los siguientes archivos para uso del usuario: README.md con descripción del repositorio, imagenes del mismo y organización. src: Todo el codigo fuente. controllers: Definimos las rutas. service: Toda la logica relacionada con la base de datos modelo: Nombres de la entidades (estrutura). : Frontend (consumidor de Api Rest).

CONFIGURACIÓN Y EJECUCIÓN. Para compilar el proyecto api utilice maven. Puede utilizar el intellij idea, IDE eclipse o Spring Tool Suit para compilar o ejecutar. Este levantará el servicio por el puerto 8080. Este proyecto conectará a una base de datos postgresql. Para compilar el proyecto cliente utilice Angular.



Script para crear la Base de dato y las tablas en postgresql.

Nombre de la base de datos: inventario 
![bd postgreSQL](https://user-images.githubusercontent.com/89054795/154570325-fc0e321d-5e5c-4583-b11d-8f37f1a415d6.png)




--Tabla producto
CREATE TABLE producto (
	id serial PRIMARY KEY,
	nombre varchar(50) not null unique
);



--Tabla cargo

CREATE TABLE cargo (
	id serial PRIMARY KEY,
	nombre varchar(50) not null unique
);



---Tabla usuario

CREATE TABLE usuario (
	id serial PRIMARY KEY,
	nombre varchar(50) not null,
    edad integer not null,
	cargo_id integer not null,
	fecha_ingreso date not null,
	FOREIGN KEY (cargo_id) REFERENCES cargo(id)
);



---Tabla mercancia
CREATE TABLE mercancia (
	id serial PRIMARY KEY,
	nombre varchar(50) not null unique,
    producto_id integer not null,
	cantidad integer not null,
	fecha_ingreso date not null,
	usuario_id integer not null,
	FOREIGN KEY (producto_id) REFERENCES producto(id),
	FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);



---Tabla historial
CREATE TABLE historial (
	id serial PRIMARY KEY,
	usuario_id integer not null,
	mercancia_id integer not null,
	FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    FOREIGN KEY (mercancia_id) REFERENCES mercancia(id)
);
