package iniciante.problema1017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int horas, km;
        double  distancia, litros;
        horas = sc.nextInt();
        km = sc.nextInt();
        distancia = horas * km;
        litros = distancia / 12;

        System.out.printf("%.3f\n", litros);
    }
}
