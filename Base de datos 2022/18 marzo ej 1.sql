
SELECT id_pedido, descripcion, id_cliente, fecha_compra, descuento FROM pedidos WHERE  fecha_entrega BETWEEN "2017-07-01" AND "2017-07-31" ORDER BY fecha_compra DESC;

SELECT codigo_producto, productos.producto FROM detallespedidos INNER JOIN productos ON productos.codigo = detallespedidos.codigo_producto;

SELECT id_pedido, descuento FROM pedidos WHERE descuento > 10;

SELECT codigo_producto, cantidad FROM detallespedidos;

UPDATE clientes SET telefono = 45224556, email ='juan@gmail.com' WHERE id_cliente = 1;

SELECT pedidos.id_pedido, cantidad FROM pedidos INNER JOIN detallespedidos ON pedidos.id_pedido = detallespedidos.id_pedido WHERE cantidad > 3;

SELECT id_pedido, id_cliente FROM pedidos WHERE descuento = 5 OR  descuento = 10 OR descuento = 15;

DELETE FROM clientes WHERE fecha_alta = "1999-01-23";

INSERT INTO clientes (nombre,apellido,direccion,telefono,email,fecha_alta) VALUES
("JUAN JOSE", "REALE", "Av. Santarata 819", 1283892, "juanjo@gmail.com", "2000-03-22");

SELECT SUM(precio_venta) FROM detallespedidos WHERE id_pedido = 1;