package ventadeverduras;

import java.util.*;

/*En esta clase unicamente llevara el inventario y orden de la cantidad de productos que tiene en stock la tienda*/
public class Inventario implements Total {
    Scanner entrada=new Scanner (System.in);
    String codigoProducto="";
    int cantidad=0;
    double precio=0;
    double total=0;
    
    
    public Inventario(){
        
    }
    public void codigoProducto(){
        System.out.println("Ingrese el codigo");
        codigoProducto=entrada.nextLine();
        
    }
    
    public void cantidad(){
        System.out.println("Ingrese la cantidada");
        cantidad=entrada.nextInt();
        
    }
    
    public void precio(){
        System.out.println("Ingrese el precio");
        precio=entrada.nextDouble();
    }
    
    public void total(){
        cantidad= +cantidad;
        System.out.println("El total de productos en la tienda es de:"+cantidad);
        
    }
}
