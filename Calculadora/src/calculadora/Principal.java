package calculadora;

import utilidades.Leer;

/**
 * Esta clase es una calculadora básica, que nos permite hcaer diferentes operaciones.
 * @author Cándida Alcantarilla Calado
 * @version 1.0
 * @since 1.1
 */

public class Principal {

	public static void main(String[] args) {

		Calculadora c = new Calculadora ();
		int opcion, cero=0;
		double numerador, denominador;
		
		
		System.out.println("-----------------------");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println("-----------------------");
		
		do {
			System.out.println("--------------------------");
			System.out.println("¿Qué desea hacer?");
			imprimirMenu();
			
			opcion=Leer.datoInt();
			
			System.out.println("--------------------------");
			switch(opcion) {
			
				case 1: 
					System.out.println("Indique el primer número");
					numerador=Leer.datoDouble();
					
					System.out.println("Indique el segundo número");
					denominador=Leer.datoDouble();
					
					System.out.printf("El resultado de la suma es: %.2f\n", c.suma(numerador, denominador));
					break;

					
				case 2: 
					System.out.println("Indique el primer número que desea restar");
					numerador=Leer.datoDouble();
					
					System.out.println("Indique el segundo número que desea restar");
					denominador=Leer.datoDouble();
					
					System.out.printf("El resultado de la resta es: %.2f\n", c.resta(numerador, denominador));
					break;
					
					
				case 3: 
					System.out.println("Indique número que desea multiplicar");
					numerador=Leer.datoDouble();
					
					System.out.println("Indique el número por el que desea ser multiplicado");
					denominador=Leer.datoDouble();
					
					System.out.printf("El resultado de la multiplicación es: %.2f\n", c.multiplicacion(numerador, denominador));
					break;
					
				case 4: 
					System.out.println("Indique el primer número que desea ser divido");
					numerador=Leer.datoDouble();
					
					System.out.println("Indique el número por el cuál quieres dividir");
					denominador=Leer.datoDouble();
					
					System.out.printf("El resultado de la división es: %.2f\n", c.division(numerador, denominador));
					break;
					
				case 0:
					System.out.println("Saliendo...");
					break;
			
				default:
					System.out.println("Opción no válida");
					break;
			}
			
		}while(opcion!=cero);
		

	}
	
	
	public static void imprimirMenu() {
		
		System.out.println("""
				0 - Salir
				1 - Sumar
				2 - Restar
				3 - Multiplicar
				4 - Dividir
				""");
		
		
	}

}
