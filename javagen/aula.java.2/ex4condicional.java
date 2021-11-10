package javagen;

import java.util.Scanner;

public class ex4condicional {
	public static void main(String[] args) {
		
		int num;
		double resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nInsira o número: ");
		num = ler.nextInt();
		
		if (num % 2 == 0) 
		{
			resultado = Math.sqrt(num);
		}
		else 
		{
			resultado = Math.pow(num,2);
		}
		System.out.println("\nResultado = " + resultado);
	}
}
