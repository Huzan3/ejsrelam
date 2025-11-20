package euler;

public class FibonacciNumbers {
        public static void main(String[] args) {
            long limit = 4_000_000L;
            long a = 1;
            long b = 2;
            long suma = 0;

            while (a <= limit) {
                if (a % 2 == 0) {
                    suma += a;
                }
                long next = a + b;
                a = b;
                b = next;
            }

            System.out.println("Suma de Fibonacci pares ≤ 4M: " + suma);
        }
    }