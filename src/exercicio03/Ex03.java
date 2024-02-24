package exercicio03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            System.out.print("Digite o 1º valor: ");
            double a = sc.nextDouble();
            System.out.print("Digite o 2º valor: ");
            double b = sc.nextDouble();
            System.out.print("Digite o 3º valor: ");
            double  c = sc.nextDouble();

            double med = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

            System.out.printf("Média: %.1f\n", med);
        }
    }
}
