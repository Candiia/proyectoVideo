package calculadora;

/**
 * Esta clase añadimos los métodos necesarios para hacer funcionar nuestra calculadora.
 * @author Cándida Alcantarilla Calado
 * @version 1.0
 * @since 1.1
 */

public class Calculadora {

	/**
	 * Este método suma dos números reales.
	 * @param numerador Es el primer número que pedimos desde el main, y hacemos el calculo deseado.
	 * @param denomidor Es el segundo número que pedimos desde el main, y hacemos el calculo deseado.
	 * @return Nos devuelve la suma de ambos numeros.
	 */
	
	public double suma(double numerador, double denomidor) {
		return numerador+denomidor;
	}
	
	
	/**
	 * Este método nos sirve para restar dos números reales. 
	 * @param numerador Es el primer número que llamamos en el main, y con el que realizaremos el calculo desedo.
	 * @param denomidor Es el segundo número que llamamos en el main, y con el que realizaremos el calculo desedo.
	 * @return Devuelve el valor de la resta de ambos números.
	 */
	public double resta (double numerador, double denomidor) {
		return numerador-denomidor;
	}

	
	/**
	 * Este método nos sirve para multiplicar dos números reales.
	 * @param numerador Este el número que llamamos en el main para que sea multiplicado.
	 * @param denomidor  Este el número que llamamos en el main para que sea el que multiplica a dicho número.
	 * @return Nos devuelve el resultado de la multiplicación de ambos números.
	 */
	public double multiplicacion(double numerador, double denomidor) {
		return numerador*denomidor;
	}
	
	
	/**
	 * Este método nos sirve para divir dos números reales.
	 * @param numerador Este es el número que vamos a divir.
	 * @param denomidor Este es el número por el cuál vamos a estar diviendo dicho número.
	 * @return Nos devuelve el resultado de la división de ambos números
	 */
	public double division(double numerador, double denomidor) {
		return numerador/denomidor;
	}
	
}
