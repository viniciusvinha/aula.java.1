package javagen;

import java.util.Scanner;

public class ex3condicional {

	public static void main(String[] args) {
		
		int idade;
				
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade e descubra a sua categoria:");
		idade = ler.nextInt();
		
		if(idade >= 5 && idade <=7) {
			System.out.println("\nVocê faz parte do grupo: Infatil A");
		}
		else if(idade >=8 && idade <=10) {
			System.out.println("\nVocê faz parte do grupo: Infantil B");
		}
		else if(idade >= 11 && idade <= 13) {
			System.out.println("\nVocê faz parte do grupo: Juvenil A");
		}
		else if(idade >= 14 && idade <=17) {
			System.out.println("\nVocê faz parte do grupo: Juvenil B");
		}
		else if(idade >= 18) {
			System.out.println("\nVocê faz parte do grupo: Adulto");
		}
		else {
			System.out.println("\nA idade que inseriu não faz parte dos grupose categorias da nossa instituição");
		}
		
	}
		
		
}
