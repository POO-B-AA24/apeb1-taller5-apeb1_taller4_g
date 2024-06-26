package Modelo;

public class Departamento {
    private String nombre;
    private int numeroEmpleados;
    private double produccionAnual;
    private String categoria;

    public Departamento(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
        this.categoria = categorizar();
    }

    public Departamento(String nombreDepartamento, int numeroEm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public double getProduccionAnual() {
        return produccionAnual;
    }

    public void setProduccionAnual(double produccionAnual) {
        this.produccionAnual = produccionAnual;
    }

    public String getCategoria() {
        return categoria;
    }

    private String categorizar() {
        if (numeroEmpleados > 20 && produccionAnual > 1000000) {
            return "A";
        } else if (numeroEmpleados >= 20 && produccionAnual >= 1000000) {
            return "B";
        } else if (numeroEmpleados >= 10 && produccionAnual >= 500000) {
            return "C";
        } else {
            return "Sin Categoría";
        }
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                ", produccionAnual=" + produccionAnual +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

