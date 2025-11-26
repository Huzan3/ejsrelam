package euler;
import java.util.*;

public class TheChase {

    public static void main(String[] args) {
        Random random = new Random();
        int[] posiciones = new int[5];
        int lanzamientos = 0;

        while (true) {
            int dado = random.nextInt(6) + 1;
            int persona = lanzamientos % 5;

            if (dado % 2 == 0) {
                posiciones[persona]++;
            } else {
                posiciones[persona]--;
            }

            lanzamientos++;


            if (lanzamientos > 5) { // min 1 tirada por persona
                for (int i = 0; i < 5; i++) {
                    if (posiciones[i] == 0) {
                        System.out.println("Persona " + i + " regresó a posición inicial en lanzamiento " + lanzamientos);
                        System.out.println("Total de lanzamientos necesarios: " + lanzamientos);
                        return;
                    }
                }
            }
        }
    }
}
