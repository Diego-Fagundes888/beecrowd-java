package iniciante.problem1001;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args)
    {
        Scanner question = new Scanner(System.in);

        int a = question.nextInt();
        int b = question.nextInt();
        int soma = a + b;

        System.out.printf("X = %d\n", soma);

    }
}
