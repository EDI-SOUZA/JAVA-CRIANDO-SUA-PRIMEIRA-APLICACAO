import java.util.Scanner;

/*
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
*/
public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número = ");
        int numero = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numero + i);





        }
    }
}
