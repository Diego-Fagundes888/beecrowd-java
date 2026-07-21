package iniciante.problema1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int money, money100, money50, money10, money5, money2, money1, qtd;
        money = sc.nextInt();
        qtd = 0;
        money100 = 0;
        money50 = 0;
        int money20 = 0;
        money10 = 0;
        money5 = 0;
        money2 = 0;
        money1 = 0;

        while(qtd != money)
        {
            if (qtd + 100 <= money)
            {
                qtd += 100;
                money100 += 1;
            } else if (qtd + 50 <= money)
            {
                qtd += 50;
                money50 += 1;
            }
            else if (qtd + 20 <= money)
            {
                qtd += 20;
                money20 += 1;
            }
            else if (qtd + 10 <= money)
            {
                qtd += 10;
                money10 += 1;
            }
            else if (qtd + 5 <= money)
            {
                qtd += 5;
                money5 += 1;
            }
            else if (qtd + 2 <= money)
            {
                qtd += 2;
                money2 += 1;
            }
            else if (qtd + 1 <= money)
            {
                qtd += 1;
                money1 += 1;
            }
        }
        System.out.printf("%d\n", money);
        System.out.printf("%d nota(s) de R$ 100,00\n", money100);
        System.out.printf("%d nota(s) de R$ 50,00\n", money50);
        System.out.printf("%d nota(s) de R$ 20,00\n", money20);
        System.out.printf("%d nota(s) de R$ 10,00\n", money10);
        System.out.printf("%d nota(s) de R$ 5,00\n", money5);
        System.out.printf("%d nota(s) de R$ 2,00\n", money2);
        System.out.printf("%d nota(s) de R$ 1,00\n", money1);

    }
}
