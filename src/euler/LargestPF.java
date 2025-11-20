package euler;

public class LargestPF {
    public static void main(String[] args) {
        long numero = 600851475143L;
        long mayorFactor = 0;

        // Quitar todos los 2
        while (numero % 2 == 0) {
            mayorFactor = 2;
            numero /= 2;
        }

        // Probar números impares
        for (long i = 3; i * i <= numero; i += 2) {
            while (numero % i == 0) {
                mayorFactor = i;
                numero /= i;
            }
        }
        if (numero > 1) mayorFactor = numero;

        System.out.println("El factor mas largo para este numero es: " + mayorFactor);
    }
}

