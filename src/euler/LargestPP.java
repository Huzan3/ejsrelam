package euler;

public class LargestPP {
        public static void main(String[] args) {
            int mayor = 0;
            for (int i = 999; i >= 100; i--) {
                for (int j = i; j >= 100; j--) {
                    int producto = i * j;
                    if (producto <= mayor) break;
                    if (esPalindromo(producto)) mayor = producto;
                }
            }
            System.out.println("El mayor polindromo encontrado es: " + mayor);
        }

        private static boolean esPalindromo(int n) {
            String s = String.valueOf(n);
            return s.equals(new StringBuilder(s).reverse().toString());
        }
}
