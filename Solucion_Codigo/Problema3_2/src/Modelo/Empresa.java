package Modelo;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private List<Departamento> departamentos;

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    /**
     *
     * @param departamento
     */
    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa: ").append(nombre).append("\n");
        sb.append("RUC: ").append(ruc).append("\n");
        sb.append("Dirección: ").append(direccion).append("\n");
        sb.append("Departamentos:\n");
        for (Departamento d : departamentos) {
            sb.append(d.toString()).append("\n");
        }
        return sb.toString();
    }
}