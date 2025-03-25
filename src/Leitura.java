import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme favorito = ");
        String nomeDoFilme = leitura.nextLine();
        System.out.println("Digite o ano do lançamento do seu filme favorito = ");
        int anoLancamentoDoFilme = leitura.nextInt();
        System.out.println("Digite sua nota de 0 a 10 para o filme informado = ");
        double notaFilme = leitura.nextDouble();

        System.out.println(nomeDoFilme);
        System.out.println(anoLancamentoDoFilme);
        System.out.println(notaFilme);
    }
}





