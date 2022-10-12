
package Negocio;

import java.util.Date;

/**
 *
 * @author USRVI-LC2
 */
public class Abarrote extends Producto{
    
    private Date fechaVencimiento;

    public Abarrote() {
    }

       
    public Abarrote(Date fechaVencimiento, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString() + " Abarrote{" + "fechaVencimiento=" + fechaVencimiento + '}';
    }
    
    
    
}
