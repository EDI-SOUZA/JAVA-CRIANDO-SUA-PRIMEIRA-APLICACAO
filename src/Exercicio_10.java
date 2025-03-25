import java.util.Scanner;

/*
Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
*/
public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para calcular a área do quadrado e 2 Calcular área do círculo = ");
        int opcaoEscolhida = scanner.nextInt();

        if (opcaoEscolhida == 1){
            System.out.println("Informe o lado do quadrado = ");
            double ladoQuadrado = scanner.nextDouble();
            double areaQuadrado = ladoQuadrado * ladoQuadrado;
            System.out.println(areaQuadrado);
        } else if (opcaoEscolhida == 2) {
            System.out.println("Informe o raio do círculo = ");
            double raioDoCirculo = scanner.nextDouble();
            double areadoCirculo = 3.14 * (raioDoCirculo * raioDoCirculo);
            System.out.println(areadoCirculo);
        }else {
            System.out.println("Opção inválida");

        }

    }
}
