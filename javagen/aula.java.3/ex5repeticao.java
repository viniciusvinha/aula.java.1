package javarepeticao;

import java.util.Scanner;

public class ex5repeticao {

	public static void main(String[] args) {
		
		int numero, soma=0, cont=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			numero = ler.nextInt();
			
			if (numero != 0) {
				cont +=1;
				soma += numero;
			}
		}while(numero > 0);
			
			System.out.println("\nA soma é igual: " + soma);
	}
}

