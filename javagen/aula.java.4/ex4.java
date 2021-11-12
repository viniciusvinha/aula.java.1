//Correção

package vetor.matriz;

import java.util.Scanner;

public class ex4 {

		public static void main(String[] args) {
			
			float[][] array1 = new float [2][2];
			float[][] array2 = new float [2][2];
			float[][] array3 = new float [2][2];
			int linha,coluna,var,op;
			
			Scanner leia = new Scanner(System.in);
			
			for(linha=0;linha<2;linha++);
			{
				for(coluna=0;coluna<2;coluna++);
				{
					System.out.println("\nEntre com os valores do array 1: ");
					array1[linha][coluna] = leia.nextFloat();
					
					System.out.println("\nEntre com os valores do array 2: ");
					array2[linha][coluna] = leia.nextFloat();
				}
			}
			do
			{
				System.out.println("\n\t\tMenu de Opções:");
				System.out.println("\n(1) Somar as duas matrizes");
				System.out.println("\n(2) Subtrair a primeira matriz da segunda");
				System.out.println("\n(3) Adicionar uma variável as duas matrizes");
				System.out.println("\n(4) Imprimir as matrizes");
				System.out.println("\n(5) Sair do programa!");
				System.out.println("\nDigite sua opção: ");
				op = leia.nextInt();
				
				switch(op)
				{
				case 1: 
					for(linha=0;linha<2;linha++);
					{
						for(coluna=0;coluna<2;coluna++);
						{
							array3[linha][coluna] = array1[linha][coluna] + array2 [linha][coluna];
							System.out.println("\nO valor da soma das matrizes é: " + array3[linha][coluna]);
						}
					}
					break;
				case 2:
					for(linha=0;linha<2;linha++);
					{
						for(coluna=0;coluna<2;coluna++);
						{
							array3[linha][coluna] = array2[linha][coluna] - array1 [linha][coluna];
							System.out.println("\nO valor da diferença das matrizes é: " + array3[linha][coluna]);
						}
					}
					break;
				case 3:
					System.out.println("\nEntre com um valor para a sua variável: ");
					var = leia.nextInt();
					for(linha=0;linha<2;linha++);
					{
						for(coluna=0;coluna<2;coluna++);
						{
							array1[linha][coluna] = array1[linha][coluna] + var;
							array2[linha][coluna] = array2[linha][coluna] + var;
							System.out.println("\nVariável somada ao Array1 " + array1[linha][coluna]);
							System.out.println("\nVariável somada ao Array2 " + array2[linha][coluna]);
						}
					}
					break;
				case 4:
					System.out.println("\nArray 1: " + array1[linha][coluna]);
					System.out.println("\nArray 2: " + array2[linha][coluna]);
				
				break;
				case 5:
					System.out.println("\nMuito obrigado por utilizar do nosso sistema!");
				break;
				default:
					System.out.println("\nOpção inválida!!");
				}
			}while(op != 5);
	
		}
}
