package domain;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamano;
    public static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

}
