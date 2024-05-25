package model;

public class Materia {
    private String nombre;
    private double acd; // Clase Diaria
    private double ape; // Práctica Evaluativa
    private double aa;  // Académica

    public Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAcd() {
        return acd;
    }

    public void setAcd(double acd) {
        this.acd = acd;
    }

    public double getApe() {
        return ape;
    }

    public void setApe(double ape) {
        this.ape = ape;
    }

    public double getAa() {
        return aa;
    }

    public void setAa(double aa) {
        this.aa = aa;
    }

    public boolean calcularResultado() {
        double total = acd + ape + aa;
        if (total >= 7) {
            return true;
        } else {
            double acumulado = (acd + ape + aa) * 0.6;
            double examenRecuperacion = 3.5;
            return (acumulado + examenRecuperacion) >= 7;
        }
    }
}
