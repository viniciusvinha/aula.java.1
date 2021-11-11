package javarepeticao;

import java.util.Scanner;

public class ex4repeticao {

	public static void main(String[] args) {
		
		int idade,genero,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,x=1; //fp = fator psicológico
		
		Scanner ler = new Scanner(System.in);
		
		while(x<=5)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = ler.nextInt();
			
			while(idade<=0 || idade>=125)
			{
				System.out.println("\nEntre com uma idade válida: ");
				idade = ler.nextInt();
			}
			System.out.println("\nEntre com o seu genêro: \n1 - Feminino\n2 - Masculino\n3 - Outros" );
			genero = ler.nextInt();
			
			while(genero < 1 || genero > 3)
			{
				System.out.println("\nEntre com o seu genêro: \n1 - Feminino\n2 - Masculino\n3 - Outros -" );
				genero = ler.nextInt();
			}
			System.out.println("\nEntre com o seu fator psicológico:\n1 - Calme\n2 - Nervose\n3 - Agressivo ");
			fp = ler.nextInt();
			while(fp < 1 || fp > 3)
			{
				System.out.println("\nEntre com o seu genêro: \n1 - Feminino\n2 - Masculino\n3 - Outros -" );
				fp = ler.nextInt();
			}
			
			if(fp==1)
			{
				contpc++;
			}
			
			if(genero==1 && fp==2)
			{
				contmn++;
			}
			
			if(genero==2 && fp==3)
			{
				contha++;
			}
			
			if(genero==3 && fp==1)
			{
				contoc++;
			}
			
			if(fp==2 && idade>40)
			{
				contpn40++;
			}
			
			if(fp==1 && idade<18)
			{
				contpc18++;
			}
			
			x++;
		}
		
		System.out.println("\nPessoas calmas: " + contpc);
		System.out.println("\nMulheres nervosas: " + contmn);
		System.out.println("\nHomens agressivos: " + contha);
		System.out.println("\nOutros calmas: " + contoc);
		System.out.println("\nPessoas nervosas coim mais de 40 anos: " + contpn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: " + contpc18);
	
	}	
}
