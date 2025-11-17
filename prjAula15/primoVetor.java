package prjAula15;

import java.util.Scanner;

public class primoVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] a = new int[TAM];
        int i, j, n, c;

        for(i = 0; i < TAM; i++){
            System.out.print("Insira um número: ");
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++){
            n = a[i];
            c = 0;
            for(j = 1; j <= n; j++){
                if(n % j == 0){
                    c++;
                }
            }

            if(c == 2){
                System.out.println(n + " é primo");
            } else {
                System.out.println(n + " não é primo");
            }
        }

        ler.close();
    }
}
