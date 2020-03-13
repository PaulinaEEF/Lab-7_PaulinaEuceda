package lab7_paulinaeuceda;

import java.util.ArrayList;

public class Artista {
    private String usuario, contrasena, nombre;
    private String genero;
    private ArrayList<Cancion> listaCanciones = new ArrayList();

    public Artista() {
    }

    public Artista(String usuario, String contrasena, String nombre, String genero) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.genero = genero;
    }

    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Artista{" + "usuario=" + usuario + ", contrasena=" + contrasena + ", nombre=" + nombre + ", genero=" + genero + ", listaCanciones=" + listaCanciones + '}';
    }
    
    
   
    
    
}
