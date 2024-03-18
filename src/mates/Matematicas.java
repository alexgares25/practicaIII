package mates;

import java.util.Random;
import java.util.stream.LongStream;

public class Matematicas {

    /**
     * Aproxima el valor de pi utilizando el método de Montecarlo y expresiones lambda.
     *
     * @param numIntentos El número de intentos o puntos generados para la aproximación.
     * @return Una aproximación del valor de pi.
     */
    public static double aproximarPILambda(long numIntentos) {
        Random random = new Random();

        // Contar cuántos puntos aleatorios caen dentro del círculo
        long puntosAcierto = LongStream.range(0, numIntentos)
                .filter(i -> {
                    double x = random.nextDouble();
                    double y = random.nextDouble();
                    return x * x + y * y <= 1;
                })
                .count();

        return 4.0 * puntosAcierto / numIntentos;
    }
}
