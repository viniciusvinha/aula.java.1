package javarepeticao;

import java.util.Scanner;

public class ex2repeticao {

	public static void main(String[] args) {
		
		int x,numero, contPar = 0, contImpar =0;
		
		Scanner ler = new Scanner(System.in);
		
		for(x = 1; x <=5; x++)
		{
			System.out.println("\nDigite o " + x + "º número: ");
			numero = ler.nextInt();
			
			if(numero % 2 == 0)
			{
				contPar++;
			}
			if (numero % 2 != 0) 
			{
				contImpar++;
			}
			
		}
		System.out.println("\nForam digitados " + contPar + " números pares");
		System.out.println("\nForam digitados " + contImpar + " números ímpares");
	}
}
