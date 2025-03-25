import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }

    public static long calcularFatorial(int num) {
        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
