
package examen2_walterreyes;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Hilo extends Thread {
 private JProgressBar barra;
 private boolean avanzar;
 private boolean vive;
 private JTable tabla;
 private Clientes cliente;
 private int cont = 0;
 
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

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Hilo() {
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
     @Override
 public void run(){
    while(vive){
        if(avanzar){
        
             barra.setValue(barra.getValue()+1);
            barra.setString(Integer.toString(barra.getValue())+"%");
            
                        
            }
        
                if( barra.getValue()==100){
                    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                        Object[] newRow = {
                        cliente.getNombre()+"",
                        cliente.getHistorial().get(0).getNum_orden()+"",
                        cliente.getHistorial().get(0).getTotal()+" Lps",
                };
          modelo.addRow(newRow); 
            
                }
                
           
        }
        try{
         Thread.sleep(500);

        } catch (InterruptedException ex) {
            }
    } 
 }


