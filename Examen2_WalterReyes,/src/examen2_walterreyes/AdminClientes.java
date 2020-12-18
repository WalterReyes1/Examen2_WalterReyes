package examen2_walterreyes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AdminClientes {

    private ArrayList<Clientes> clientes = new ArrayList();
    File archivo = null;
    Date día;

    public AdminClientes(String path) {
        archivo = new File(path);

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

    public void setClientes(Clientes c) {
        clientes.add(c);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Clientes t : clientes) {
                for (int i = 0; i < t.getHistorial().size(); i++) {
                    bw.write("Popeyes" + ";");
                    bw.newLine();

                    //bw.write("Fecha : "+día.getDay()+"/"+día.getMonth()+"/"+día.getYear()+";");
                    // bw.write("Hora: "+día.getTime()+";");
                    bw.write("Nombre del cliente: " + t.getNombre() + ";");
                    bw.newLine();

                    bw.write("Código de orden: " + t.getHistorial().get(i).getNum_orden() + ";");
                    bw.newLine();

                    bw.write("Piezas de pollo: " + t.getHistorial().get(i).getPiezas() + ";");
                    bw.newLine();

                    bw.write("Biscuits: " + t.getHistorial().get(i).getBiscuits() + ";");
                    bw.newLine();

                    bw.write("Papas: " + t.getHistorial().get(i).getPapas() + ";");
                    bw.newLine();

                    bw.write("Puré: " + t.getHistorial().get(i).getPuré() + ";");
                    bw.newLine();

                    bw.write("Frescos: " + t.getHistorial().get(i).getRefrescos() + ";");
                    bw.newLine();

                    bw.write("Total: " + t.getHistorial().get(i).getTotal() + ";");
                    bw.newLine();

                    bw.newLine();

                }
                bw.newLine();

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        clientes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    clientes.add(new Clientes(sc.next(), sc.nextInt())
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF

    }

}
