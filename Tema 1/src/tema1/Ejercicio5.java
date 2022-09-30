package tema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int x;
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un valor para a: ");
		a = sc.nextInt();
		System.out.print("Introduzca un valor para b: ");
		b = sc.nextInt();
		System.out.print("Introduzca un valor para c: ");
		c = sc.nextInt();
		System.out.print("Introduzca un valor para x: ");
		x = sc.nextInt();
		
		y = (((a*(x^2))+(b*x))+c);
		
		System.out.println(y);

	}

}
