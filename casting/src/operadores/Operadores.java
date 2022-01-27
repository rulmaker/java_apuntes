package operadores;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		//Operadores Aritm�ticos
		//+, -, /, *, %
		int a = 10;
		int b = 20;
		double c = 10.5;
		
		int suma = a + b;
		
		System.out.println(suma);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		
		//Resta
		System.out.println("El resultado de la resta: " + (b - a));
		
		//divisi�n
		int division = a / b;
		System.out.println("El resultado de la divisi�n es: " + division);
		
		//double division2 = (double)a / b;
		double division2 = c / b;
		//por lo menos uno de los datos debe se de tipo double para que nos represente 
		//los decimales correctamente
		//10.0 / 20 = 0.5
		System.out.println("El resultado de la divisi�n es: " + division2);
		
		//multiplicaci�n
		double multiplicacion = c * a;
		System.out.println("El resultado dela divisi�n es: " + multiplicacion);
		
		//modulo
		int modulo = a % b;
		System.out.println("El m�dulo de la operaci�n es: " + modulo);
		
		
		/*
		 *Operador de asignaci�n 
		 * =
		 */
		int d = 5, e;//inicializar las variables vacias
		e = 6;
		System.out.println(d + " - " +  e);
		
		//Operadores de declaraci�n compuesta
		//+=, -=, *=, /=, %=
		//una operaci�n simplificada
		
		int f = 0, g = 5;
		
		f += 5;
		//f = f + 5
		
		System.out.println(f);
		
		//Operadores relacionales
		/*<, >, <=, >=
		 * == igualdad 
		 * != diferencia 
		 * Resultado un valor de tipo boolean/booleano (true, false)
		 */
		
		int h = 15, i = 25;
		String j = "Hola";
		
		System.out.println(h > i);//false
		System.out.println(i != h);
		//System.out.println(h != j);//son valores distintos y no se pueden comparar
		
		//Operador unario
		/*++, --
		 * preasignaci�n  -- ++k Se le asigna un valor antes de usarse
		 * postasignaci�n -- k++ primero lee el valor y despues le suma 1
		 */
		
		int k =0, l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//Precedencia de operadores
		
		int operacion = (4 + 5) * 6 / 3;//14
		//5 * 6 = 30
		//30 / 3 = 10
		//4 + 10 = 14
		
		System.out.println(operacion);
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		// x = 1, Y = 0;
		System.out.println(operacion2);//1
		
		//Operador ternario
		//es un if..else abreviado
		//solo nos permite tomar una decisi�n
		int edad = 18;
		
		int valor = (edad<=18) ? 2:1;

		
		//int resultado = (edad <= 18) ? (valor1 = 2)  : (valor1 = 3) ;
		//String resultado = (edad <= 18) ? "Uno"  : "dos" ;
		//par�ntesis son opcionales
		//System.out.println(resultado);
		
		
		// Operadores l�gicos
		// And - &&
		// or - ||
		// Not !
		
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true || false);//true 
		System.out.println(true && !false);//true
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un n�mero: ");
		int num = sc.nextInt();
		System.out.println(num);
	}
}
