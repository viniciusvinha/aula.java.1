package javagen;

import java.util.Scanner;

public class ex1condicional {
	
	public static void main(String[] args) {
		int x1,x2,x3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		x1 = ler.nextInt();
		
		System.out.println("\nEntre com o segundo número: ");
		x2 = ler.nextInt();
		
		System.out.println("\nEntre com o terceiro número: ");
		x3 = ler.nextInt();
		
		if (x1 > x2 && x1 > x3) 
		{
			System.out.println("\nO maior valor é:" + x1);
		}
		else if (x2 > x1 && x2 >x3) 
		{
			System.out.println("\nO maior valor é: " + x2);
		}
		else
		{
			System.out.println("\nO maior valor é de: " + x3);
		}
	
	}
}
