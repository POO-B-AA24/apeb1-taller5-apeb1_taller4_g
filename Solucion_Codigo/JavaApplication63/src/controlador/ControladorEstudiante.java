package controlador;

import model.Estudiante;
import model.Materia;

public class ControladorEstudiante {
    private Estudiante estudiante;

    public ControladorEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void agregarMateria(Materia materia) {
        estudiante.setMateria(materia);
    }

    public void verificarAprobacion() {
        if (estudiante.haAprobado()) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ha aprobado la materia " + estudiante.getMateria().getNombre() + ".");
        } else {
            System.out.println("El estudiante " + estudiante.getNombre() + " no ha aprobado la materia " + estudiante.getMateria().getNombre() + ". Deberá rendir un examen de recuperación.");
        }
    }
}
