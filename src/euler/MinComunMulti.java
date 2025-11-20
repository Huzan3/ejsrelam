package euler;

public class MinComunMulti {
    public static void main(String[] args) {
        long numero = 2520;
        while (true) {
            if (divisibleDel1al20(numero)) {
                System.out.println(numero);
                break;
            }
            numero += 2520;
        }
    }

    private static boolean divisibleDel1al20(long numero) {
        for (int i = 11; i <= 20; i++)
            if (numero % i != 0) return false;
        return true;
    }
}
