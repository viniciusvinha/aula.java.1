package javagen;

import java.util.Scanner;

public class ex1condicional {
	
	public static void main(String[] args) {
		int x1,x2,x3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		x1 = ler.nextInt();
		
		System.out.println("\nEntre com o segundo n�mero: ");
		x2 = ler.nextInt();
		
		System.out.println("\nEntre com o terceiro n�mero: ");
		x3 = ler.nextInt();
		
		if (x1 > x2 && x1 > x3) 
		{
			System.out.println("\nO maior valor �:" + x1);
		}
		else if (x2 > x1 && x2 >x3) 
		{
			System.out.println("\nO maior valor �: " + x2);
		}
		else
		{
			System.out.println("\nO maior valor � de: " + x3);
		}
	
	}
}
