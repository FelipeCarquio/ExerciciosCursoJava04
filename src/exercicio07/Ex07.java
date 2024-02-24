package exercicio07;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de linhas: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int qua = i * i;
            int cub = i * i * i;
            System.out.println("Linha " + i + ": " + qua + " " + cub);
        }
    }
}
