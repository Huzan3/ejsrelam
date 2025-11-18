package ejerciciosrelampago;

import java.util.Scanner;

public class PrimerosNFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números de Fibonacci quieres? ");
        int cantidad = sc.nextInt();

        if (cantidad <= 0) {
            System.out.println("Debe ser un número positivo.");
            return;
        }

        System.out.println("Los primeros " + cantidad + " números de Fibonacci:");

        int a = 0, b = 1;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
        sc.close();
    }
}