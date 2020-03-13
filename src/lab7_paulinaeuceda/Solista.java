
package lab7_paulinaeuceda;

import java.util.ArrayList;

public class Solista extends Artista{
    private int edad;

    public Solista() {
    }

    public Solista(int edad, String usuario, String contrasena, String nombre, String genero) {
        super(usuario, contrasena, nombre, genero);
        this.edad = edad;
    }

    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Solista{" + "edad=" + edad + '}';
    }

    
    
    
}
