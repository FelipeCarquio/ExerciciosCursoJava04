package exercicio02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um valor: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            } else {
                out++;
            }
        }
        System.out.println();
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
