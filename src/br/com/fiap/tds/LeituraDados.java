package br.com.fiap.tds;
import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        System.out.println(idade + " anos");

        leitor.close();
    }
}
