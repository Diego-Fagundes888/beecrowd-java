package iniciante.problema1005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner q = new Scanner(System.in);

        double nota1 = q.nextDouble();
        double nota2 = q.nextDouble();

        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
