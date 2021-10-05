package com.ceep.dominio;

public class Order {

    private final int id_orden; //No altera el valor dentro de la clase
    Producto arrayprod[]; //Array de objetos
    private static int contadorOrdenes;
    private final static int max_productos = 10;
    //Nuevo contador
    private static int contadorProductos;

    //CONSTRUCTORES
    public Order() {
        //Inicializo el array de productos que puede tener cada pedido
        arrayprod = new Producto[Order.max_productos];
        this.id_orden = ++Order.contadorOrdenes;
        //Reiniciar el contador de productos de cada pedido
        Order.contadorProductos=0;
    }

    //METODOS
    public void agregarProducto(Producto producto) {
        /*
        A este metodo le vamos pasando los productos, cuando se lo agregue, hay que meterlo en 
        un array hasta un maximo de 10 productos (0-9).
        Productos es un atributo (array) de la clase Order, si quiero agregar un producto, 
        necesito un contador nuevo para ir contando estos productos hasta 10 para no salirme del maximo.
         */
        if (Order.contadorProductos < max_productos) {
            //Añadir
            //Productos[1] | Productos[2] ...
            arrayprod[Order.contadorProductos++] = producto;
        } else {
            System.out.println("Ha alcanzado el maximo de productos por order");
        }
    }

    public double calcularTotal() {
        var res = 0.0; //Acumulador de precios
        //Rercorrer el array de productos
        for (int i = 0; i < Order.contadorProductos; i++) {
            //Precio del producto en la posicion i
            res += arrayprod[i].getPrecio();
        }
        return res;
    }

    public void mostrarOrder() {
        System.out.println("Id_Orden: " + this.id_orden);
        for (int i = 0; i < Order.contadorProductos; i++) {
            System.out.println("- Nombre del producto " + i + " es: " + arrayprod[i].getNombre());
            System.out.println("- Precio del producto " + i + " es: " + arrayprod[i].getPrecio());
        }
        System.out.println("- Total: " + this.calcularTotal());
    }
}
