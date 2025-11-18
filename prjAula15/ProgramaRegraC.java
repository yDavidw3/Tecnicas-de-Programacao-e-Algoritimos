package prjAula15;

import java.util.Scanner;

public class ProgramaRegraC {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], c[], i;
		final int TAM=10;
		a= new int [TAM];
		b= new int [TAM];
		c= new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(1+i)+"° valor de vetor A:");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(1+i)+"° valor de vetor B:");
			b[i] = ler.nextInt();			
		}
		
		for (i=0; i<TAM; i++) {
			if (a[i]>b[i]) {
				c[i]= 1;
			}
			else if (a[i]==b[i]) {
				c[i]=0;
			}
			else if (a[i]<b[i]) {
				c[i]=-1;
			}
		}
		
		System.out.print("Vetor C: [");
		for (i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println("].");
		
		
	}

}
