package iniciante.problem1002;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner q = new Scanner(System.in);

        double radius = q.nextDouble();

        double area = 3.14159 * (radius * radius);

        System.out.printf("A=%.4f\n", area);
    }

}
