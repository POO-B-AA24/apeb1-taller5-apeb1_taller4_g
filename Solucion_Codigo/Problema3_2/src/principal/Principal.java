package principal;

import Modelo.Departamento;
import Modelo.Empresa;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre,ruc,direccion;
        
        System.out.print("Ingrese el nombre de la empresa: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el RUC de la empresa: ");
        ruc = sc.nextLine();
        System.out.print("Ingrese la dirección de la empresa: ");
        direccion = sc.nextLine();
        Empresa empresa = new Empresa(nombre, ruc, direccion);

        System.out.print("Ingrese la cantidad de departamentos: ");
        int cantidadDepartamentos = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < cantidadDepartamentos; i++) {
            System.out.println("Ingrese los datos del departamento " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombreDepartamento = sc.nextLine();
            System.out.print("Número de empleados: ");
            int numeroEm = sc.nextInt();
            System.out.print("Producción anual: ");
            double produccionAnual = sc.nextDouble();
            sc.nextLine(); // Limpiar el buffer
            Departamento departamento = new Departamento(nombreDepartamento, numeroEm, produccionAnual);
            empresa.agregarDepartamento(departamento);
        }
        System.out.println("\nInformación de la empresa y sus departamentos:");
        System.out.println(empresa);
    }
}
