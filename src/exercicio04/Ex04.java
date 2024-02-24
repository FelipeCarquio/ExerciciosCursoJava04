package exercicio04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, dividendo, divisor;
        double res;
        System.out.print("Digite a quantidade de operações: ");
        n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print("Digite o dividendo: ");
            dividendo = sc.nextInt();
            System.out.print("Digite o divisor: ");
            divisor = sc.nextInt();
            if (divisor == 0) {
                System.out.println("Impossivel Dividir.");
            } else {
                res = (double) dividendo / divisor;
                System.out.printf("%.1f\n", res);
            }
        }
    }
}
