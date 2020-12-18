
package examen2_walterreyes;


public class Ordenes {
 private int piezas;
 private int biscuits;
 private int puré;
 private int papas;
 private int refrescos;
 private int pie;
 private float total;
 private int num_orden;
    public Ordenes() {
    }

    public Ordenes(int piezas, int biscuits, int puré, int papas, int refrescos, int pie, float total, int num_orden) {
        this.piezas = piezas;
        this.biscuits = biscuits;
        this.puré = puré;
        this.papas = papas;
        this.refrescos = refrescos;
        this.pie = pie;
        this.total = total;
        this.num_orden = num_orden;
    }

    

    public int getPiezas() {
        return piezas;
    }

    public int getNum_orden() {
        return num_orden;
    }

    public void setNum_orden(int num_orden) {
        this.num_orden = num_orden;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public int getBiscuits() {
        return biscuits;
    }

    public void setBiscuits(int biscuits) {
        this.biscuits = biscuits;
    }

    public int getPuré() {
        return puré;
    }

    public void setPuré(int puré) {
        this.puré = puré;
    }

    public int getPapas() {
        return papas;
    }

    public void setPapas(int papas) {
        this.papas = papas;
    }

    public int getRefrescos() {
        return refrescos;
    }

    public void setRefrescos(int refrescos) {
        this.refrescos = refrescos;
    }

    public int getPie() {
        return pie;
    }

    public void setPie(int pie) {
        this.pie = pie;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Ordenes{" + "piezas=" + piezas + ", biscuits=" + biscuits + ", pur\u00e9=" + puré + ", papas=" + papas + ", refrescos=" + refrescos + ", pie=" + pie + ", total=" + total + '}';
    }
 
 
}
