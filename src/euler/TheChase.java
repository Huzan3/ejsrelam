package euler;

public class TheChase {

    public static void main(String[] args) {
    int personas = 100;
    double[][] E = new double[personas][personas];

    // Repetir hasta que converja
    for (int iter = 0; iter < 100000; iter++) {
        double[][] E2 = new double[personas][personas];
        double maxDif = 0;

        // Para cada posición de los dos dados
        for (int i = 0; i < personas; i++) {
            for (int j = 0; j < personas; j++) {

                // Si están en el mismo sitio, el juego acabó
                if (i == j) {
                    E2[i][j] = 0;
                    continue;
                }

                // Sumar los valores para todos los lanzamientos posibles
                double suma = 0;
                for (int dado1 = 1; dado1 <= 6; dado1++) {
                    for (int dado2 = 1; dado2 <= 6; dado2++) {

                        // Calcular nueva posición dado 1
                        int ni = i;
                        if (dado1 == 1) ni = (i - 1 + personas) % personas;  // Izquierda
                        if (dado1 == 6) ni = (i + 1) % personas;      // Derecha

                        // Calcular nueva posición dado 2
                        int nj = j;
                        if (dado2 == 1) nj = (j - 1 + personas) % personas;  // Izquierda
                        if (dado2 == 6) nj = (j + 1) % personas;      // Derecha

                        // Sumar el valor esperado
                        suma = suma + E[ni][nj];
                    }
                }

                // Calcular valor esperado: 1 turno + promedio de próximos estados
                E2[i][j] = 1 + suma / 36.0;

                // Calcular diferencia con iteración anterior
                double diferencia = Math.abs(E2[i][j] - E[i][j]);
                if (diferencia > maxDif) {
                    maxDif = diferencia;
                }
            }
        }

        // Actualizar matriz
        E = E2;

        // Si ya convergió, mostrar resultado
        if (maxDif < 0.000000000001) {
            System.out.printf("Respuesta: %.10g\n", E[0][50]);
            break;
        }
    }
}
}
