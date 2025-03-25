//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Calculo da média
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse = """
                Filme: Top Gun: Maverick
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);
        //Casting "Conversão de valores"
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}

