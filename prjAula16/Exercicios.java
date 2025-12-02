package prjAula16;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Scanner ler  = new Scanner(System.in);
		double valor1, valor2, valor3, media, peso;
		
		System.out.println("Digite o primeiro valor:");
		valor1 = ler.nextInt()*2;
		
		System.out.println("Digite o segundo valor:");
		valor2 = ler.nextInt()*3;
		
		System.out.println("Digite o terceiro valor:");
		valor3 = ler.nextInt()*5;
		
		peso=(2+3+5);
		media=(valor1+valor2+valor3)/peso;
		
		System.out.println("MEDIA = "+media);
	}

}

