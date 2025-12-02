package prjAula16;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor, n[], i;
		final int TAM=10;
		n = new int [TAM];
		
		System.out.println("Digite o "+1+"º valor do vetor:");
		valor = ler.nextInt();
		n[0] = valor;
		
		for (i=1; i<TAM; i++) {
			n[i]=n[i-1] * 2;
		}
		
		for (i=0; i<TAM; i++) {
			System.out.print(n[i]+" ");
		}
		ler.close();
	}

}

