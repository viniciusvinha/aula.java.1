package javarepeticao;

import java.util.Scanner;

public class ex3repeticao {

	public static void main(String[] args) {
		
		int idade,cont21=0;
		int cont50=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite a idade: ");
		idade = ler.nextInt();
		
		while(idade != -99) 
		{
			if (idade < 21)
				cont21++;
			if (idade < 50)
				cont50++;
			
			System.out.println("\nCaso queira, digite -99 para encerrar o programa, ou siga inserindo novas idades.");
			idade = ler.nextInt();
			
		}
		System.out.println("\n O total de pessoa(s) com menos de 21 anos é: " + cont21);
		System.out.println("\n O total de pessoa(s) com mais de 50 anos é: " + cont50);
		
		
		
	}
}
