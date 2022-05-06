Delimiter //
	-- 1:
	create procedure productosPrecioMayor(
			out cant int
        )
		begin
			select * from products where buyprice > avg(buyprice);
            set cant = (select count(*) from products where buyprice > avg(buyprice));
        end // 

	-- 2:
	create procedure contarOrdenes (in orderNumber int, out cant int)
		begin
			set cant = (select count(*) from orders where orders.orderNumbre = rederNumber);
            
            if(cant > 0) then
				delete from orders where orders.orderNumber = orderNumber;
				delete from orderDetails where orderDetails.orderNumber = orderNumber;
			end if;
			select cant;
		end//
        
	-- 3:
    create procedure borrarLineaProductLines(in roductLine varchar(50), out respuesta varchar(50))
		begin
			if((select count(*) from products where products.roductLine = roductLine) = 0) then
				delete from product where product.productLine = productLine;
                set respuesta = "La linea de productos fue borrada";
			else
				set respuesta = "La linea de productos no pudo borrarse porque contiene productos asociados";
			end if;
            select respuesta;
        end//
    
    -- 4:
    create procedure cantOrdenesPorEstado()
		begin
			select status, count(*) from orders group by status;
        end//
    
    -- 5:
	create procedure cantOrdenesPorEstado(in fechaDesde datetime, in fechaHasta datetime)
		begin
			select status, count(*) from orders group by status having orderDate between fechaDesde and fechaHasta;
        end//
        
	-- 6:
    create procedure listarCantSubordinados()
		begin
			select employeeNumber, count(*) from employees group by reportsTo having count(*) > 0;
        end//
    
    -- 7:
    create procedure orderAndPrice()
		begin
			select orderNumber, sum(priceEach) from orderdetails group by orderNumber;
        end//
        
	-- 8:
    create procedure clienteYSusOrdenes()
    begin
		select customerNumber, customerName, orders.orderNumber, sum(priceEach) from 
			customers inner join orders on customer.customerNumber = orders.customerNumber
			inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
			group by orderNumber;
	end//
Delimiter ;