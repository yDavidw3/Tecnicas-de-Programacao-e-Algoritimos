package prjAula15;

import java.util.Scanner;

public class ParOuImparVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        int i;

        for(i = 0; i < TAM; i++){
            System.out.print("Insira um número: ");
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++){
            if(a[i] % 2 == 0){
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }

        for(i = 0; i < TAM; i++){
            System.out.println(b[i]);
        }

        ler.close();
    }
}
