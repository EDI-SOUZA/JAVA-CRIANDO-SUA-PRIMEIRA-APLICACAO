/*
Crie um programa que solicite ao usuário a entrada de um número inteiro.
Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
 */

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro = ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0 ){
            System.out.println("O número informado é par");
        }else {
            System.out.println("O número informado é ímpar");
        }

    }
}
