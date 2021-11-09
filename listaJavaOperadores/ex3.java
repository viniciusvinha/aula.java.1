package listaJavaOperadores;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		double segundos,minutos,horas,totalSegundos,sobraHoras;
		
		System.out.println("Qual o tempo de durração do evento: ");
		totalSegundos = entrada.nextInt();
		
		horas = totalSegundos / 3600;
		sobraHoras = totalSegundos - (horas * 3600);
		minutos = sobraHoras / 60;
		segundos = sobraHoras - (minutos * 60);
		
		System.out.println("A duração do evento foi de: " + horas + " horas " + minutos + " minutos" + segundos + " segundos");
		}
}
