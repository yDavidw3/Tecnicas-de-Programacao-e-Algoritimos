package prj1;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, r, i;
		
		System.out.println("Digite um número para ver a tabuada dele:");
		numero = ler.nextInt();
		
		System.out.println("A tabuada de "+numero+" é:");
		for (i=1; i<11; i++) {
			r = numero*i;
			System.out.println(numero+" x "+i+" = "+r);
		}
		
		
	}

}
