
package lab7_paulinaeuceda;

import java.util.ArrayList;

public class Solista extends Artista{
    private String genero;
    private ArrayList<Cancion> listaCanciones = new ArrayList();
    private int edad;

    public Solista() {
    }

    public Solista(String genero, int edad, String usuario, String contrasena, String nombre) {
        super(usuario, contrasena, nombre);
        this.genero = genero;
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }


    

    
    
    
}
