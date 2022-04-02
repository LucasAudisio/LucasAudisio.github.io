use pedidos;
/* Ej 1: Listar para el cliente nro. 1 todos los pedidos realizados, indicando: el id, descripción, 
 fecha de compra y fecha de entrega del pedido y los códigos de productos incluidos en el pedido.*/
select * from pedidos, detallepedido where id_cliente in 
    (select id_cliente from clientes where id_cliente = 1);

/*  Ej 2: Listar todos los pedidos de todos los clientes, indicando id cliente, nombre y apellido, 
	id pedido y descripción de pedido. */
    
select clientes.id_cliente, nombre, apellido, id_pedido, descripcion from clientes, pedidos;

/*  Ej 3: Listar el detalle de los pedidos de los clientes. Incluir los siguientes datos en el listado: 
Del cliente: id, nombre, apellido. Del pedido: id, descripción Detalle del pedido: código de producto y cantidad.*/
    
	select clientes.id_cliente,nombre,apellido, pedidos.id_pedido, descripcion, codigo_producto, cantidad from clientes, pedidos, detallepedido;
    
    /*Ej 4/5: Listar los clientes que aún no hayan realizado pedidos*/
    
    select * from clientes where id_cliente not in (select id_cliente from pedidos);
    
/* Ej 6: Listar el detalle de los pedidos cuyo descuento haya sido del 5%*/

	select * from detallespedidos where id_pedido in (select id_pedido from pedidos where descuento = 5);
    
/* Ej 7: Listar el/los pedidos con mayor descuento realizado */

	select * from pedidos where descuento in (select max(descuento) from pedidos);
    
/* Ej 8: Listar el/los pedidos con menor descuento realizado */

	select * from pedidos where descuento in (select min(descuento) from pedidos);
    
/* Ej 9: Listar los clientes que hayan realizado pedidos */

	select * from clientes where id_cliente in (select id_cliente from pedidos);
    
/* Ej 10: Listar cuantos tipos de articulos se realizan por pedido */

	select id_pedido, count(codigo_producto) from detallespedidos group by id_pedido order by id_pedido;
    
/* Ej 11: Listar los pedidos que que tengan mas de 3 articulos por pedido */

	select id_pedido, count(codigo_producto) from detallespedidos 
		group by id_pedido having count(codigo_producto) > 3  order by id_pedido;
        
/* Ej 12: Listar la cantidad de días desde la fecha de compra hasta la fecha
	de entrega por c/u de los pedidos */
    
    select *, datediff(fecha_entrega, fecha_compra), "Drakul no lo hizo" from pedidos;
    
/* Ej 13: Listar los clientes con mas de 10 años de antigüedad */

	select *, "Drakul no lo hizo" from clientes having year(datediff(fecha_alta, curdate())) > 10;
    
/* Ej 14: Listar para cada pedido el valor total de la compra */

	select id_pedido, sum(precio_venta) from detallespedidos group by id_pedido;
    
/* Ej 15: Listar los pedidos cuyo monto supere los $ 3500 */

	select id_pedido, sum(precio_venta) from detallespedidos group by id_pedido having sum(precio_venta) > 3500;
    
/* Ej 16: Listar la cantidad de productos vendidos por codigo de producto */

	select codigo_producto, sum(cantidad), count(codigo_producto) from detallespedidos group by codigo_producto;
    
/* Ej 17: Listar el/los codigos de producto de mayor valor */

	select codigo_producto from detallespedidos 
    where (select max(precio_venta) from detallespedidos) = precio_venta;
    
/* Ej 18a: En una muestre la máxima, minima y promedio de unidades incluidas en un pedido. */

	select id_pedido, max(cantidad), min(cantidad), avg(cantidad) from detallespedidos 
    group by id_pedido;
    
/*  Ej 18b: En el otro la cantidad máxima, minima y promedio de tipos de producto diferentes
	incluidos en un pedido. No se hace :(este si lo hizo drakul) */
    
/* Ej 19: Liste los nombres de los clientes que hayan realizado
	una compra por un valor total mayor a $3.000 */
    select nombre from clientes 
	where id_cliente in (select id_cliente from pedidos 
    where id_pedido in (select id_pedido from detallespedidos
    group by id_pedido having sum(precio_venta) > 3000));