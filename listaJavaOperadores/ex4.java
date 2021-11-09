package listaJavaOperadores;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		float a,b,c,d,r,s;
		
		System.out.println("Digite o valor de a: ");
		a = ler.nextFloat();
		
		System.out.println("Digite o valor de b: ");
		b = ler.nextFloat();
		
		System.out.println("Digite ovalor de c: ");
		c = ler.nextFloat();
		
		r = (a * a) + (b * b);
		s = (b * b) + (c * c);
		d = (r + s) / 2;
		
		System.out.printf("O cálculo a partir dos números fornecidos é: " +  d);
		
	}
}