package Modelo;
public class Persona {
    private String nombre;
    private int edad;
    private String ocupacion;
    private String nivelImplicacion;

    public Persona(String nombre, int edad, String ocupacion, String nivelImplicacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNivelImplicacion() {
        return nivelImplicacion;
    }

    public void setNivelImplicacion(String nivelImplicacion) {
        this.nivelImplicacion = nivelImplicacion;
    }

    public boolean puedeAcogerseReduccionPena() {
        return nivelImplicacion.equalsIgnoreCase("acusado");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ocupacion='" + ocupacion + '\'' +
                ", nivelImplicacion='" + nivelImplicacion + '\'' +
                '}';
    }
}
