package iniciante.problema1003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner q = new Scanner(System.in);

        int a = q.nextInt();
        int b = q.nextInt();

        int soma = a + b;

        System.out.printf("SOMA = %d\n", soma);
    }
}
