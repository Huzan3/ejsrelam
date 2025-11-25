package euler;

public class SumaCuadradosImpares {

    public static void main(String[] args) {

        int n = 136000; // cantidad de números cuadrados
        int cantidadImpares = n / 2; // cantidad de bases impares: 1,3,5,...,113999

        long suma = sumarCuadradosImpares(cantidadImpares);

        System.out.println("La suma de todos los cuadrados impares entre los primeros "
                + n + " cuadrados es:");
        System.out.println(suma);
    }

    // Suma de (2k - 1)^2 para k = 1..m usando fórmula cerrada
    private static long sumarCuadradosImpares(int m) {

        // Fórmulas:
        // sum j^2 = m(m+1)(2m+1)/6
        // sum j   = m(m+1)/2
        // sum (2j-1)^2 = 4 sum j^2 - 4 sum j + m

        long mLong = m;

        long sumJ2 = mLong * (mLong + 1) * (2 * mLong + 1) / 6;
        long sumJ  = mLong * (mLong + 1) / 2;

        return 4 * sumJ2 - 4 * sumJ + mLong;
    }
}
