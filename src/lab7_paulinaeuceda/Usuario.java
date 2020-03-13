package lab7_paulinaeuceda;

import java.util.ArrayList;

public class Usuario extends Artista{
    private int edad;
    private ArrayList<Evento> listaEventos = new ArrayList();
    private ArrayList<Artista> listaArtistas = new ArrayList();

    public Usuario() {
    }

    public Usuario(int edad, String usuario, String contrasena, String nombre) {
        super(usuario, contrasena, nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
}
