package prjAula15;

import java.util.Scanner;

public class buscaVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] a = new int[TAM];
        int i, x, f;
        f = 0;

        for(i = 0; i < TAM; i++){
            System.out.print("Insira um número: ");
            a[i] = ler.nextInt();
        }

        System.out.print("Insira o valor a buscar: ");
        x = ler.nextInt();

        for(i = 0; i < TAM; i++){
            if(a[i] == x){
                f = 1;
            }
        }

        if(f == 1){
            System.out.println("Valor encontrado.");
        } else {
            System.out.println("Valor não encontrado.");
        }

        ler.close();
    }
}
