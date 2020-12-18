
package examen2_walterreyes;

import javax.swing.JProgressBar;
import javax.swing.JTable;


public class Hilo extends Thread {
 private JProgressBar barra;
 private boolean avanzar;
 private boolean vive;
 private JTable tabla;
 private Clientes cliente;
 
 public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }
 
    public Hilo(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive =true;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    
}
