package euler;

public class SumaMultiplos {

    public static void main(String[] args) {
        int limite = 1000;
        int suma = 0;

        for (int i = 1; i < limite; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los múltiplos de 3 o 5 menores que 1000 es: " + suma);
    }
}
