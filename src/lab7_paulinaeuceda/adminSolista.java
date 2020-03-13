
package lab7_paulinaeuceda;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminSolista {
    private ArrayList<Solista> listaSolistas = new ArrayList();
    private File archivo = null;
    
    public adminSolista(String path) {
        archivo = new File(path);
    }

    public ArrayList<Solista> getListaSolista() {
        return listaSolistas;
    }

    public void setListaSolista(ArrayList<Solista> listaSolistas) {
        this.listaSolistas = listaSolistas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setSolista(Solista a){
        listaSolistas.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaSolistas = new ArrayList();
            Solista temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Solista) objeto.readObject()) != null) {
                        listaSolistas.add(temp);
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
            for (Solista t : listaSolistas) {
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
