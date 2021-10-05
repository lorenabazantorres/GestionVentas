
package com.ceep.dominio;


public class Producto {
    //DECLARAMOS LOS ATRIBUTOS
    private final int id_producto; //No varía
    private String nombre;
    private double precio;
    private static int contadorProductos; //No varía
    
    //CONSTRUCTORES
    public Producto() {
       //Al crear un nuevo producto 
       this.id_producto=++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        //Tenemos que meter el constructor vacio dentro del lleno para que vaya sumando el id
        this(); //Referencia al vacio
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //G&S
    public int getId_producto() {
        return this.id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getContadorProductos() {
        return this.contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return "\n- Nombre : " + nombre + "\n- Precio : " + precio;
    }
    
    
    
}
