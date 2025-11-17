package prjAula15;

import java.util.Scanner;

public class FatorialVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 15;
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        int i, j, f;

        for(i = 0; i < TAM; i++){
            System.out.print("Insira um número: ");
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++){
            f = 1;
            for(j = 1; j <= a[i]; j++){
                f = f * j;
            }
            b[i] = f;
        }

        for(i = 0; i < TAM; i++){
            System.out.println(b[i]);
        }

        ler.close();
    }
}
