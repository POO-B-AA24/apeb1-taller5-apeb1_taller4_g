package Modelo;
import java.util.ArrayList;
import java.util.List;

public class ControladorFiscalia {
    private List<CasoCorrupcion> casos;

    public ControladorFiscalia() {
        this.casos = new ArrayList<>();
    }

    public void agregarCaso(CasoCorrupcion caso) {
        casos.add(caso);
    }

    public void agregarPersonaACaso(String nombreCaso, Persona persona) {
        for (CasoCorrupcion caso : casos) {
            if (caso.getNombreCaso().equalsIgnoreCase(nombreCaso)) {
                caso.agregarPersonaImplicada(persona);
                break;
            }
        }
    }

    public void actualizarEstados() {
        for (CasoCorrupcion caso : casos) {
            caso.actualizarEstado();
        }
    }

    public void mostrarCasos() {
        for (CasoCorrupcion caso : casos) {
            System.out.println(caso);
        }
    }
}
