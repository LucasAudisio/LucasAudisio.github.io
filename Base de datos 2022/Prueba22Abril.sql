create database prueba22Abril;
use prueba22Abril;

create table Dueños(
	idDueño int primary key,
    idMascota int,
    nombre varchar(50)
);

create table Mascotas(
	idMascota int primary key,
    edad int,
    peso int,
    idVet int
);

create table Veterinarios(
	idVet int primary key,
	telefono int    
);

-- 1:
select * from Mascotas group by edad;

-- 2:
select * from Mascotas group by peso;

-- 3:
select edad, count(idMascota) from Mascotas group by edad;
 
-- 4:
select peso, count(idMascota) from Mascotas group by peso;
 
-- 5:
select sum(peso) from Mascotas where edad between 5 and 10;
 
-- 6:
select avg(peso) from Mascotas;

DELIMITER $$
	-- 7:
	create procedure cantidadMascotas(in idDueño int)
    begin
		select count(idMascota) from Dueños where Dueños.idDueño = idDueño;
    end$$
    
    -- 8:
    create procedure pesaMasDe15kg(in idMascota int)
    begin
		declare respuesta varchar(50);
		if((select peso from Mascotas where Mascotas.idMascota = idMascota) > 15) then
			set respuesta = "pesa mas de 15kg";
		else
			set respuesta = "no pesa mas de 15kg";
		end if;
        select respuesta;
    end$$
    
    -- 9:
    create procedure imprimirDatosVet(in idVet int)
    begin
		select * from Veterinarios where Veterinarios.idVet = idVet;
    end$$
    
    -- 10:
	create procedure imprimiDatosMascotaSegunPeso(in peso int)
    begin
		select * from Mascotas where Mascotas.peso >= peso;
    end$$
DELIMITER ;
call imprimiDatosMascotaSegunPeso(6);
