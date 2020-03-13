
package lab7_paulinaeuceda;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminBanda {
    private ArrayList<Banda> listaBandas = new ArrayList();
    private File archivo = null;
    
    public adminBanda(String path) {
        archivo = new File(path);
    }

    public ArrayList<Banda> getListaBandas() {
        return listaBandas;
    }

    public void setListaBandas(ArrayList<Banda> listaBandas) {
        this.listaBandas = listaBandas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setBanda(Banda a){
        listaBandas.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaBandas = new ArrayList();
            Banda temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Banda) objeto.readObject()) != null) {
                        listaBandas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Banda t : listaBandas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
