package exercicios;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu peso e sua altura abaixo");
        double altura = leitor.nextDouble();
        System.out.println("Você tem " + altura + "m de altura.");

        double peso = leitor.nextDouble();
        System.out.println("Você tem " + peso + "KG. /n");

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é de: %.2f%n", imc);
        if(imc >= 18.5 && imc <= 25) {
            System.out.println("Você está com o peso ideal");
        } else {
            System.out.println("Você está fora do peso ideal.");
        }

        leitor.close();
    }
}

/*
O programa deve receber dois valores: altura e peso.
O resultado do IMC é
calculado através da expressão: peso / (altura * altura);
Caso o imc esteja entre 18.5 e 25, informe que
o peso é ideal, caso contrário,
informe que está fora do peso normal.
 */