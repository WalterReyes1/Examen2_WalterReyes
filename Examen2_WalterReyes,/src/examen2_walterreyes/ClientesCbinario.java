
package examen2_walterreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ClientesCbinario {
    private ArrayList<Clientes> clientes;
     private File archivo = null; 

    public ClientesCbinario(String path) {
            archivo = new File(path);

    }

    public ClientesCbinario(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setClientes(Clientes c){
        clientes.add(c);
    }
    
    
     public void cargarArchivo() {
        try {
            clientes = new ArrayList();
            Clientes temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Clientes) objeto.readObject()) != null) {
                       clientes.add(temp);
                    }
                } catch (EOFException e) {
             //  e.printStackTrace();

                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
               //  ex.printStackTrace();
           
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Clientes t : clientes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (IOException ex) {
               //  ex.printStackTrace();
           
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                      //          ex.printStackTrace();

            }
        }
    }
    
}
