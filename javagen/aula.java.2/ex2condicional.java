package javagen;

import java.util.Scanner;

public class ex2condicional {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("\nEntre com o primeiro número:");
		a = ler.nextInt();
		
		System.out.println("\nEntre com o segundo número:");
		b = ler.nextInt();
		
		System.out.println("\nEntre com o terceiro número:");
		c = ler.nextInt();
		
		if(a <b) {
			if(b<c) {
				System.out.println(a+" < "+b+" < "+c);
			}
			else if(a < c) {
				System.out.println(a+" < "+c+" < "+b);
			} else {
				System.out.println(c+" < "+a+" < "+b);
			}
		}
		else if(b < c) {
			if(a < c) {
				System.out.println(b+" < "+a+" < "+c);
			} else {
				System.out.println(b+" < "+c+" < "+a);
			}
		} else {
			System.out.println(a+" < "+b+" < "+c);
		}		
	}
}
