
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Congelado extends Producto{
    
    private int temperatura;

    public Congelado() {
    }

    public Congelado(int temperatura, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString()+ " Congelado{" + "temperatura=" + temperatura + '}';
    }
    
    
    
    
}
