package controller;

import java.util.Scanner;

public class Util {
	String pregunta;

	static void escribir(String string) {
		System.out.println(string);
	}

	static int leerInt(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		int respuesta;

		escribir(pregunta);
		respuesta = Integer.parseInt(teclado.nextLine());

		return respuesta;
	}

	static double leerDouble(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		double respuesta;

		escribir(pregunta);
		respuesta = Double.parseDouble(teclado.nextLine());

		return respuesta;
	}

	static String leerString(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;

		escribir(pregunta);
		respuesta = teclado.next();

		return respuesta;
	}
	
	static int mayorDe2Num(int number1, int number2) {
		int n;
		
		if (number1 < number2) {
			n = number2;
		} else {
			n = number1;
		}
		
		return n;
	}
	
	static int menorDe2Num(int number1, int number2) {
		int n;
		
		if (number1 > number2) {
			n = number2;
		} else {
			n = number1;
		}
		
		return n;
	}
	
	static int mayorDe3Num(int number1, int number2, int number3) {
		int m;
		
		if (number1 < number2 && number3 < number2) {
			m = number2;
		} else {
			if (number1 < number3 && number2 < number3) {
				m = number3;
			} else {
				if (number2 < number1 && number3 < number1) {
					m = number1;
				} else {
					m = 0;
				}
			}
		}
		
		return m;
	}
	
	static int menorDe3Num(int number1, int number2, int number3) {
		int m;
		
		if (number1 > number2 && number3 > number2) {
			m = number2;
		} else {
			if (number1 > number3 && number2 > number3) {
				m = number3;
			} else {
				if (number2 > number1 && number3 > number1) {
					m = number1;
				} else {
					m = 0;
				}
			}
		}
		
		return m;
	}
}
