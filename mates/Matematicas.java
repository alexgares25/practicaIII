package mates;
import java.util.Random;


public class Matematicas {

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
