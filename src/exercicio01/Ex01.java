package exercicio01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
