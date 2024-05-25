package Modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CasoCorrupcion {
    private String nombreCaso;
    private LocalDate fechaInicio;
    private String estado;
    private String detalles;
    private List<Persona> personasImplicadas;

    public CasoCorrupcion(String nombreCaso, LocalDate fechaInicio, String detalles) {
        this.nombreCaso = nombreCaso;
        this.fechaInicio = fechaInicio;
        this.estado = "Iniciado";
        this.detalles = detalles;
        this.personasImplicadas = new ArrayList<>();
    }

    public String getNombreCaso() {
        return nombreCaso;
    }

    public void setNombreCaso(String nombreCaso) {
        this.nombreCaso = nombreCaso;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public List<Persona> getPersonasImplicadas() {
        return personasImplicadas;
    }

    public void agregarPersonaImplicada(Persona persona) {
        personasImplicadas.add(persona);
    }

    public void actualizarEstado() {
        long diasTranscurridos = ChronoUnit.DAYS.between(fechaInicio, LocalDate.now());
        if (diasTranscurridos > 14) {
            estado = "Urgente";
        } else if (diasTranscurridos > 7) {
            estado = "Alerta";
        } else {
            estado = "Iniciado";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caso de Corrupción: ").append(nombreCaso).append("\n");
        sb.append("Fecha de Inicio: ").append(fechaInicio).append("\n");
        sb.append("Estado: ").append(estado).append("\n");
        sb.append("Detalles: ").append(detalles).append("\n");
        sb.append("Personas Implicadas:\n");
        for (Persona p : personasImplicadas) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
