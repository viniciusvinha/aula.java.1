package listaJavaOperadores;
import java.util.Scanner;
import java.math.*;

public class ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		float a,b,c,d,g,f,x,y;
				
		System.out.println("Digite o valor de a: ");
		a = ler.nextFloat();
		
		System.out.println("Digite o valor de b: ");
		b = ler.nextFloat();
		
		System.out.println("Digite o valor de c: ");
		c = ler.nextFloat();
		
		System.out.println("Digite o valor de d: ");
		d = ler.nextFloat();
		
		System.out.println("Digite ovalor de e: ");
		g = ler.nextFloat();
		
		System.out.println("Digite o valor de f: ");
		f = ler.nextFloat();
		
		x = (c * g - b * f) / (a * g - b * d);
		y = (a * f - c * d) / (a * g - b * d);
		
		System.out.printf("O valor de x é:" +  x);
		System.out.printf("O valor de y é:" +  y);
		
	}
}