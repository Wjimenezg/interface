package ventadeverduras;

import java.util.*;


/*En esta clase se tomaran los datos para facturar la compra del cliente
por lo que calculara la cantidad de productos y el precio*/
public class factura {
    Scanner entrada=new Scanner (System.in);
    String codigoProducto="";
    int cantidad=0;
    double precio=0;
    double total=0;
    
    public factura(){
        
    }

    public void codigoProducto(){
        System.out.println("Ingrese el codigo");
        codigoProducto=entrada.nextLine();
        
    }
    
    public void cantidad(){
        System.out.println("Ingrese la cantidad");
        cantidad=entrada.nextInt();
        
    }
    
    public void precio(){
        System.out.println("Ingrese el precio");
        precio=entrada.nextDouble();
    }
    
    public void total(){
        total= cantidad*precio;
        System.out.println("La total a pagar es de: "+ total);
        
    }
}
