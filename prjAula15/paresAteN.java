package prjAula15;

import java.util.Scanner;

public class paresAteN {
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
            System.out.println("Pares até " + a[i] + ":");
            for(j = 0; j <= a[i]; j++){
                if(j % 2 == 0){
                    System.out.println(j);
                }
            }
        }

        ler.close();
    }
}
