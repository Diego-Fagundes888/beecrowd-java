package iniciante.problema1006;

import java.util.Scanner;

public class Main {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double a, b, c, formula;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        formula = ((a * 2) + (b * 3) + (c * 5)) / 10;
        System.out.printf("MEDIA = %.1f\n", formula);
    }
}
