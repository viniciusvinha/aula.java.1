package listaJavaOperadores;
import java.util.Scanner;
import java.math.*;

public class ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		float x1,x2,y1,y2,d;
				
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextFloat();
		
		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextFloat();
		
		System.out.println("Digite ovalor de y1: ");
		y1 = ler.nextFloat();
		
		System.out.println("Digite ovalor de y2: ");
		y2 = ler.nextFloat();
		
		d = sqrt(pow((x2-x1),2) + pow((y2-y1),2));
		
		System.out.printf("O cálculo a partir dos números fornecidos é: " +  d);
		
	}
}