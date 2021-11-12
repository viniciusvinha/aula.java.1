package vetor.matriz;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		int linha,coluna,cont=0;
		
		for ( linha=0; linha <3; linha++ )
		{
			for (coluna=0; coluna<3; coluna++)
			{
				System.out.println("\nDigite o valor de: " + linha+1 + coluna+1);
				matriz [linha] [coluna] = leia.nextInt();
				if (matriz[linha][coluna] > 10)
					cont++;
			}
		}
		System.out.println("\nA matriz possui " + cont + " números maior que 10.");
	}
}
