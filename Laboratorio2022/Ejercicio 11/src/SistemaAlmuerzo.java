import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.util.ArrayList;

public class SistemaAlmuerzo {
    private ArrayList<Pedido> pedidos;

    public SistemaAlmuerzo(){
        this.pedidos = new ArrayList<>();
    }

    public SistemaAlmuerzo(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public void modificarPedido(int indice, Pedido nuevoPedido){
        this.pedidos.set(indice, nuevoPedido);
    }

    public void eliminarPedido(int indice){
        this.pedidos.remove(indice);
    }

    public void imprimirInforme(LocalDate dia){
        for(Pedido pedidoActual:this.pedidos){
            if(pedidoActual.getFechaHoraCreacion().getYear() == dia.getYear() &&
               pedidoActual.getFechaHoraCreacion().getMonth() == dia.getMonth() &&
               pedidoActual.getFechaHoraCreacion().getDayOfMonth() == dia.getDayOfMonth()){
                System.out.println("Plato: " + pedidoActual.getPlatoPedido());
                System.out.println("Fecha Creacion: " + pedidoActual.getFechaHoraCreacion());
                System.out.println("Alumno: " + pedidoActual.getAlumnoPidio());
            }
        }
    }
}
