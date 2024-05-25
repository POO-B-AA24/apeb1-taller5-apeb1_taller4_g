import java.util.Scanner;
public class Problema1 {   
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese la longitud del vector: ");
            int n = sc.nextInt();

            int[] vector = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                vector[i] = sc.nextInt();
            }
            int cantidadPares = contarPares(vector);
            System.out.println("La cantidad de elementos pares en el vector es: " + cantidadPares);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese valores enteros válidos.");
        }
    }


    public static int contarPares(int[] vector) {
        int pares = 0;
        for (int numero : vector) {
            if (numero % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
    
}