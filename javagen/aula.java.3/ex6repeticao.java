package javarepeticao;

import java.util.Scanner;

public class ex6repeticao {

	public static void main(String[] args) {
		
		int numero,soma=0;
		float media=0,cont=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		numero = ler.nextInt();
		
		if (numero % 3 == 0 && numero != 0)
		{
			soma +=numero;
			cont++;
		}
		while(numero != 0)
		{
			System.out.println("\nDigite um número: ");
			numero = ler.nextInt();
			
			if (numero % 3 == 0 && numero != 0)
			{
				soma +=numero;
				cont++;
			}}
		media = soma/cont;
		System.out.println("\nA media dos números é: " + media);
	}
}