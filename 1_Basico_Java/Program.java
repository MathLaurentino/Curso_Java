// package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Informe os lados do triangulo X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Informe os lados do triangulo Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

        sc.close();

        boolean result1 = verificarTriangulo(xA, xB, xC);        
        boolean result2 = verificarTriangulo(yA, yB, yC);

        System.out.println("Triangulo 1 é " + result1);       
        System.out.println("Triangulo 2 é " + result2);
		
	}

    static boolean verificarTriangulo(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }
	
}
