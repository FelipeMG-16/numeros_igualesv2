/* Escribir un programa que pida 2 numeros por consola de manera reiterada
		 * La ejecución del programa terminará cuando los numeros ingresados sean
		 * iguales.
		 * Nota: utilizar un ciclo while
		 * 
		 * 
		 * ESTE PROGRAMA SE EJECUTA INFINITAMENTE!!! 
		 */

import java.util.Scanner;
public class NumerosIgualesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println ("Por favor introduce el primer número:");
		Scanner numero1 = new Scanner (System.in);		
		int primer = numero1.nextInt();
		
		System.out.println ("Por favor introduce el segundo número:");
		Scanner numero2 = new Scanner (System.in);		
		int segundo = numero2.nextInt();
		
		
		while (primer != segundo) {
			System.out.println ("Los numeros son distintos, seguimos ejecutando");
		
		}
		System.out.println ("Los numeros son iguales, terminamos!");
		}
		
	}

