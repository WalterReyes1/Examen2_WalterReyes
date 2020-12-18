
package examen2_walterreyes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Clientes implements Serializable {
    private static final long SerialVersionUID=777L;

    private String nombre;
    private ArrayList<Ordenes>Historial = new ArrayList() ;
    private int efectivo;
    public Clientes() {
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public Clientes(String nombre, int efectivo) {
        this.nombre = nombre;
        this.efectivo = efectivo;
    }

    public Clientes(String nombre, ArrayList<Ordenes> Historial) {
        this.nombre = nombre;
        this.Historial = Historial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ordenes> getHistorial() {
        return Historial;
    }

    public void setHistorial(ArrayList<Ordenes> Historial) {
        this.Historial = Historial;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
        
    
}
