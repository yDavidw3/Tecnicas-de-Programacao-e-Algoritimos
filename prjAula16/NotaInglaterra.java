package prjAula16;

import java.util.Scanner;

public class NotaInglaterra {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int notaNumerica;
		
		System.out.println("Digite a sua nota numérca para converter em conceito:");
		notaNumerica = ler.nextInt();
		
		if (notaNumerica==0) {
			System.out.println("Nota E.");
		}
		else if (notaNumerica<36) {
			System.out.println("Nota D.");
		}
		else if (notaNumerica<61) {
			System.out.println("Nota C.");
		}
		else if (notaNumerica<86) {
			System.out.println("Nota B.");
		}
		else {
			System.out.println("Nota A.");
		}
	}

}

