
package lab7_paulinaeuceda;

import java.util.ArrayList;

public class Banda extends Artista{
    private String genero;
    private ArrayList<Cancion> listaCanciones = new ArrayList();
    private int integrantes;

    public Banda() {
    }

    public Banda(String genero, int integrantes, String usuario, String contrasena, String nombre) {
        super(usuario, contrasena, nombre);
        this.genero = genero;
        this.integrantes = integrantes;
    }

    

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
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
    
    

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    

    
    
    
}
