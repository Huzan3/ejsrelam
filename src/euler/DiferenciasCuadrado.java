package euler;

public class DiferenciasCuadrado {
    public static void main(String[] args) {
        long sumaCuadrados = 0;
        long suma = 0;
        for (int i = 1; i <= 100; i++) {
            sumaCuadrados += (long) i * i;
            suma += i;
        }
        long cuadradoSuma = suma * suma;
        System.out.println(cuadradoSuma - sumaCuadrados);
    }
}
