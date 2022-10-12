
package Presentacion;

import Datos.Coleccion;
import Negocio.*;
import java.util.Date;

/**
 *
 * @author USRVI-LC2
 */
public class TestCompra {
    
    public static void main(String[] args) {
        Date fechaHoy = new Date();
        Producto fecha = new Abarrote(fechaHoy, 10, 1000, 1, "SOPA MAGGI");
        Producto paño = new Aseo("aseo",20, 2000, 3, "CLORO");
        Producto helado = new Congelado(-18, 30, 2500, 1, "CRAZY");
        Producto cerveza = new Liquido(7, 40, 1500, 1, "Corona");
        Oferta aaa = new Oferta(10, 50, 1000, 1, "SOPA");
        
        Coleccion col = new Coleccion();
        
        col.agregarProducto(fecha);
        col.agregarProducto(paño);
        col.agregarProducto(helado);
        col.agregarProducto(cerveza);
        col.agregarProducto(aaa);
        
        col.listaCompra(aaa);
        col.comentarioCompra("Gracias por su preferencia, lo esperamos...");
        
    }
    
}
