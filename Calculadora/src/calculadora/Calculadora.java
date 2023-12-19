package calculadora;

/**
 * Clase que implementa una calculadora básica de números enteros 
 * @author Cándida Alcantarilla Calado
 * @since 1.0
 * @version 1.1
 * 
 */

public class Calculadora {

	/** 
	 * Este método suma dos números reales
	 * @since 1.0 
	 * @see "Libro gordo de petete, donde vas a encontrar como se suma"
	 * @see <a href= "http://google.es">Ver aqui</a>
	 * @param a primer número entero 
	 * @param b segundo número entero
	 * @return Suma de ambos números
	 */
	
	public double suma (double a, double b) {
		return a+b;	
	}
	
	
	/**
	 * Suma de dos números enteros
	 * @deprecated
	 * @param a primer número entero 
	 * @param b segundo número entero
	 * @return Suma de ambos números
	 */
	
	public int sumar(int a, int b) {
			
			return a+b;
		}
	
	/**
	 * Este método resta dos númeres reales 
	 * @param c primer número entero
	 * @param d segundo número entero
	 * @return Resta de ambos números
	 */
	
	public double resta (double c, double d) {
		return c-d;
	}
	
	
	/**
	 * Este método multiplica dos números reales
	 * @param e Primer número que es multiplicado
	 * @param f Segundo número que multiplica.
	 * @return Multiplicación de ambos números
	 */
	
	public double multiplicacion(double e, double f) {
		return e*f;
	}
	
	
}
