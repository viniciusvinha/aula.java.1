package listaJavaOperadores;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		int ano,mes,dia,total;
		
		System.out.println("Escreva o total de dias: ");
		
		System.out.println("Digite os anos: ");
		ano = entrada.nextInt();
		
		System.out.println("Digite os meses: ");
		mes = entrada.nextInt();
		
		System.out.println("Digite os dias: ");
		dia = entrada.nextInt();
		
		total = ano * 365 + mes * 30 + dia;
		System.out.println("A idade total em dias é de: " + total + " dias");
		
	}
}
