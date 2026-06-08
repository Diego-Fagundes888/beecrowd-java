package iniciante.problema1004;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int b = q.nextInt();

        int prod = a * b;

        System.out.printf("PROD = %d\n", prod);
    }
}
