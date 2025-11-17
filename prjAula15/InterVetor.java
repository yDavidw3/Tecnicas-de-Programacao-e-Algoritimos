package prjAula15;

import java.util.Scanner;

public class InterVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        int[] c = new int[TAM];
        int i, j, k;
        k = 0;

        System.out.println("Insira 10 valores para A:");
        for (i = 0; i < TAM; i++) {
            a[i] = ler.nextInt();
        }

        System.out.println("Insira 10 valores para B:");
        for (i = 0; i < TAM; i++) {
            b[i] = ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                }
            }
        }

        System.out.println("Interseção dos vetores (C):");
        for (i = 0; i < k; i++) {
            System.out.println(c[i]);
        }

        ler.close();
    }
}