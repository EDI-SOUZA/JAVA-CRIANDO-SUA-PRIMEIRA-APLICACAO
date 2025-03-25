import java.util.Scanner;

/*
Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando
se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
 */
public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número inteiro = ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Informe segundo número inteiro = ");
        int segundoNumero = scanner.nextInt();
        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números informados são iguais");
        } else if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro número informado é maior que o segundo número informado ");
            System.out.println("Os números informados são diferentes");
        } else {
            System.out.println("O segundo número informado é maior que o primeiro número informado ");
            System.out.println("Os números informados são diferentes");
        }
    }
}
