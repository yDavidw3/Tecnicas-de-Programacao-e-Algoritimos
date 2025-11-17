package prjAula15;

import java.util.Scanner;

public class VetorImparPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 20;
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        int i, p, q;
        p = 0;
        q = TAM - 1;

        for(i = 0; i < TAM; i++){
            System.out.print("Insira um número: ");
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++){
            if(a[i] % 2 == 0){
                b[p] = a[i];
                p++;
            } else {
                b[q] = a[i];
                q--;
            }
        }

        for(i = 0; i < TAM; i++){
            System.out.println(b[i]);
        }

        ler.close();
    }
}
