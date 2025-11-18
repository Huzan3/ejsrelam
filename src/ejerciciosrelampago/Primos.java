package ejerciciosrelampago;

public class Primos {
    public static void main(String[] args) {
        int suma = 0;

        System.out.println("Números primos entre 1 y 100:");

        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
                suma += i;
            }
        }

        System.out.println("\n\nSuma de los números primos: " + suma);
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;


        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
