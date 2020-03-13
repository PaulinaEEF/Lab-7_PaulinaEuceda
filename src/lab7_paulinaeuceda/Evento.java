
package lab7_paulinaeuceda;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private Date fecha;
    private String ciudad, lugar;
    private int cantPersonas;
    private ArrayList<Cancion> listaCancion = new ArrayList();

    public Evento() {
    }

    public Evento(Date fecha, String ciudad, String lugar, int cantPersonas) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.cantPersonas = cantPersonas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public ArrayList<Cancion> getListaCancion() {
        return listaCancion;
    }

    public void setListaCancion(ArrayList<Cancion> listaCancion) {
        this.listaCancion = listaCancion;
    }

    @Override
    public String toString() {
        return "Evento{" + "fecha=" + fecha + ", ciudad=" + ciudad + ", lugar=" + lugar + ", cantPersonas=" + cantPersonas + ", listaCancion=" + listaCancion + '}';
    }
    
    
}
