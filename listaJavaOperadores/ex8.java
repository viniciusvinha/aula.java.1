package listaJavaOperadores;
import java.util.Scanner;
import java.math.*;

public class ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		int PercDistrib,PercImposto;
		float CustoFabrica,ValorDistribuidor,ValorImposto,CustoConsumidor;
		
		PercDistrib = 29;
		PercImposto = 47;
				
		System.out.println("Infomre o valor de custo da fábrica: ");
		CustoFabrica = ler.nextFloat();
		
		ValorDistribuidor = CustoFabrica + (CustoFabrica * PercDistrib / 100);
		ValorImposto =  CustoFabrica + (CustoFabrica * PercImposto / 100);
		CustoConsumidor = CustoFabrica + ValorDistribuidor + ValorImposto;
		
		System.out.printf("O custo ao consumiudor é de: " +  CustoConsumidor);
		
	}
}