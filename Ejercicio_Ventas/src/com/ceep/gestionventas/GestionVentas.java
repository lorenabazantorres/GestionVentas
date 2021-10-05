package com.ceep.gestionventas;

//IMPORT DE LAS CLASES DEL OTRO PAQUETE
import com.ceep.dominio.*;

public class GestionVentas {

    public static void main(String[] args) {

        //CREAMOS LOS OBJETOS PRODUCTO 
        Producto prod1 = new Producto("Peras", 5.4);
        Producto prod2 = new Producto("Manzanas", 6.4);
        Producto prod3 = new Producto("Platanos", 7);

        //PEDIDO 1
        Order pedido1 = new Order();
        //Agregar productos al pedido 1
        pedido1.agregarProducto(prod1);
        pedido1.agregarProducto(prod2);
        pedido1.agregarProducto(prod3);
        //Mostrar pedido
        pedido1.mostrarOrder();
        
        System.out.println("\n");
        
        //PEDIDO 2
        Order pedido2 = new Order();
        //Agregar productos al pedido 2
        pedido2.agregarProducto(prod2);
        pedido2.agregarProducto(prod3);
        //Mostrar pedido
        pedido2.mostrarOrder();

    }
}
