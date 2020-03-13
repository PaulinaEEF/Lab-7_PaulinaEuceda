
package lab7_paulinaeuceda;

import java.util.ArrayList;

public class Banda extends Artista{
    private int integrantes;

    public Banda() {
    }

    public Banda(int integrantes, String usuario, String contrasena, String nombre, String genero) {
        super(usuario, contrasena, nombre, genero);
        this.integrantes = integrantes;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Banda{" + "integrantes=" + integrantes + '}';
    }
    
    
}
