package iniciante.problema1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int segundos, minuto, hora;
        segundos = sc.nextInt();
        hora = segundos / 3600;
        int rHoras = segundos % 3600;
        minuto = rHoras / 60;
        int rMinutos = rHoras % 60;
        segundos = rMinutos % 60;

        System.out.printf("%d:%d:%d\n", hora, minuto, segundos);
    }
}
