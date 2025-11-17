package prjAula15;

import java.util.Scanner;

public class tabuadaVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 5;
        int[] a = new int[TAM];
        int i, j;

        for(i = 0; i < TAM; i++){
            System.out.print("Insira um número: ");
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++){
            System.out.println("Tabuada de " + a[i] + ":");
            for(j = 0; j <= 10; j++){
                System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
            }
        }

        ler.close();
    }
}

