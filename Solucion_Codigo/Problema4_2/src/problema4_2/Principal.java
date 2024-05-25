package problema4_2;

import Modelo.ControladorFiscalia;
import Modelo.CasoCorrupcion;
import Modelo.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControladorFiscalia fiscalia = new ControladorFiscalia();
        String nombreCaso,detalles,nombreP,ocupacion,nivel;
        int edad,cant;
        System.out.print("Ingrese el nombre del caso: ");
        nombreCaso = sc.nextLine();
        System.out.print("Ingrese la fecha de inicio del caso (yyyy-MM-dd): ");
        LocalDate fechaInicio = LocalDate.parse(sc.nextLine());
        System.out.print("Ingrese los detalles del caso: ");
        detalles = sc.nextLine();
        CasoCorrupcion caso = new CasoCorrupcion(nombreCaso, fechaInicio, detalles);
        fiscalia.agregarCaso(caso);
        System.out.print("Ingrese la cantidad de personas implicadas: ");
        cant = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombreP = sc.nextLine();
            System.out.print("Edad: ");
            edad = sc.nextInt();
            System.out.print("Ocupación: ");
            sc.nextLine();
            ocupacion = sc.nextLine();
            System.out.print("Nivel de implicación (acusado, testigo, víctima, etc.): ");
            nivel = sc.nextLine();

            Persona persona = new Persona(nombreP, edad, ocupacion, nivel);
            fiscalia.agregarPersonaACaso(nombreCaso, persona);
        }

        fiscalia.actualizarEstados();
        System.out.println("\nInformación de los casos:");
        fiscalia.mostrarCasos();
    }
}

