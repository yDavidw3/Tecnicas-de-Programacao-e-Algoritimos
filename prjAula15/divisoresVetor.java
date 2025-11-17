package prjAula15;

import java.util.Scanner;

public class divisoresVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] a = new int[TAM];
        int i, j;

        for(i = 0; i < TAM; i++){
            System.out.print("Insira um número: ");
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++){
            System.out.println("Divisores de " + a[i] + ":");
            for(j = 1; j <= a[i]; j++){
                if(a[i] % j == 0){
                    System.out.println(j);
                }
            }
        }

        ler.close();
    }
}
