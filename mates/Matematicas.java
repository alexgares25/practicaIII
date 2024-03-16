package mates;
import java.util.Random;

/**
 * Clase que proporciona métodos matemáticos para la aproximación del número pi.
 */
public class Matematicas {
	
	/**
	* Aproxima el valor de pi utilizando el método de Montecarlo.
	*
	* @param numIntentos El número de intentos o puntos generados para la aproximación.
	* @return Una aproximación del valor de pi.
	*/
	
	public static double aproximarPI(long numIntentos) {
		Random random = new Random();
		long puntosAcierto = 0;

		for (long i = 0;i<numIntentos; i++) {
			double x = random.nextDouble();
			double y = random.nextDouble();
			if ( x * x + y * y <=1){
				puntosAcierto++;
			}
		}



		return 4.0 * puntosAcierto/numIntentos;
	}
}
