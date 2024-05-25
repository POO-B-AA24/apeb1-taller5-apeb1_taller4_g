package principal;
import model.Estudiante;
import model.Materia;
import controlador.ControladorEstudiante;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nombre,nombreMateria;
        double acd,ape,aa;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        edad = sc.nextInt();
        sc.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad);
        ControladorEstudiante controlador = new ControladorEstudiante(estudiante);
        
        System.out.print("Ingrese nombre de la materia: ");
        nombreMateria = sc.nextLine();
        System.out.print("Ingrese la calificación ACD (sobre 3.5): ");
        acd = sc.nextDouble();
        System.out.print("Ingrese la calificación APE (sobre 3.5): ");
        ape = sc.nextDouble();
        System.out.print("Ingrese la calificación AA (sobre 3): ");
        aa = sc.nextDouble();
        Materia materia = new Materia(nombreMateria, acd, ape, aa);
        controlador.agregarMateria(materia);
        controlador.verificarAprobacion();
    }
}
