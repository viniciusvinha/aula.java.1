package vetor.matriz;

public class ex1 {
	public static void main(String[] args) {
		
		int [] A = new int [] {1,0,5,-2,-5,7};
		int soma,x;
		
		soma = A[0] + A[1] + A[5];
		System.out.println("\nSoma das posições (0,1,5): " + soma);
		
		A[4] = 100;
		
		for(x = 0; x<6; x++)
			System.out.println("\n" + A[x]);
		
		
		
		
	}
}
