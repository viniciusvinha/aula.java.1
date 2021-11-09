package listaJavaOperadores;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		int ano,mes,dia,total;
		
		System.out.println("Digite a idade em dias:");
		total = entrada.nextInt();
		
		ano = total / 365;
		
		mes = (total % 365) / 30;
		
		dia = (total % 365) % 30;
		
		System.out.println("A sua idade em ano(s) é de: " + ano + " anos");
		System.out.println("A sua idide em mes(es) é de:" + mes + " mes(es)");
		System.out.println("A sua idade em dia(s) é de:" + dia + " dia(s)");
		
	}
}