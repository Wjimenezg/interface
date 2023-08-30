package ventadeverduras;

public class VentaDeVerduras {

    public static void main(String[] args) {
        
        factura f=new factura();
        Inventario i=new Inventario();
        
        f.codigoProducto();
        f.cantidad();
        f.precio();
        f.total();
        
        i.codigoProducto();
        i.cantidad();
        i.precio();
        i.total();
        
    }
    
}
