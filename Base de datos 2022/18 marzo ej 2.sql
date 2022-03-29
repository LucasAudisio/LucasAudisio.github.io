-- Escritor:
-- id_escritor PK.

-- Libros: 
-- id_libros PK.

-- Poema:
-- id_poema PK.
-- id_escritor FK.

-- Poema_libro: Ambas FK.

INSERT INTO escritor (nombre, apellido, direccion)
VALUES ("Horacio", "Rodriguez Larreta", "Av Cochabamba 312");

UPDATE poema SET titulo = "Mis mejores poemas", descripcion = "Una seleccion de los mejores poemas del autor" WHERE id_poema = 1;

DELETE FROM libros WHERE id_libro = 10;

SELECT MAX(precio) FROM libros;

SELECT MIN(precio), AVG(precio) FROM libros;

SELECT id_libro FROM poema_libro GROUP BY id_poema HAVING COUNT(id_libro) > 10;

SELECT id_libro, COUNT(id_poema) FROM poema_libro GROUP BY id_libro;

SELECT nombre, apellido, descripcion, titulo FROM escritor INNER JOIN poema ON escritor.id_escritor = poema.id_escritor;

SELECT libros.titulo, poema.titulo, descripcion FROM poema
inner join poema_libro 
on poema_libro.id_poema = poema.id_poema
inner join libros
on poema_libro.id_libro = libros.id_libro;
