package listaJavaOperadores;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		float n1,n2,n3,media;
		
		System.out.println("Entre com a primeira nota: ");
		n1 = ler.nextFloat();
		
		System.out.println("Entre com a segunda nota: ");
		n2 = ler.nextFloat();
		
		System.out.println("Entre com a terceira nota: ");
		n3 = ler.nextFloat();
		
		media = (n1*2+n2*3+n3*5) / 10;
		
		System.out.println("Sua média foi de: " + media);
	
		
	}
}