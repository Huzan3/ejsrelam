package ejerciciosrelampago;

import java.util.Scanner;

public class FibonacciHastaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        long n = sc.nextLong();   // usamos long para poder manejar números grandes

        if (n < 0) {
            System.out.println("Por favor, introduce un número positivo.");
            sc.close();
            return;
        }

        System.out.println("Serie de Fibonacci hasta " + n + ":");

        long a = 0, b = 1;

        // Caso especial si n = 0
        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        }

        // Imprimimos el primer término (0) si n >= 0
        System.out.print(a + " ");

        while (b <= n) {
            System.out.print(b + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }

        System.out.println();  // salto de línea final
        sc.close();
    }
}