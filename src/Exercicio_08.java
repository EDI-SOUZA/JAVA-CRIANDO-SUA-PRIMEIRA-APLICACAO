import java.util.Scanner;

/*
Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo",
caso contrário, exiba "Número negativo".
 */
public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro = ");
        int numero = scanner.nextInt();
        if (numero >= 0) {
            System.out.println("Número positivo");
        }else {
            System.out.println("Número negativo");
        }

    }
}
