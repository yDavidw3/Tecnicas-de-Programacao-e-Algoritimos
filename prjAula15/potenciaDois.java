package prjAula15;

public class potenciaDois {
    public static void main(String[] args) {
        final int TAM = 11;
        int[] a = new int[TAM];
        int i;

        for(i = 0; i < TAM; i++){
            a[i] = (int) Math.pow(2, i);
        }

        for(i = 0; i < TAM; i++){
            System.out.println(a[i]);
        }
    }
}