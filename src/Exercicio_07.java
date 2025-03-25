/*Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto
e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.*/
public class Exercicio_07 {
    public static void main(String[] args) {
        //Valor inicial produto
        double precoOriginal = 10.0;
        //Desconto em %
        double percentualDesconto = 10;
        //Calculando o valor inicial com o desconto
        double precoComDesconto = (10 - ((10 * 10) /100));
        //Valor após aplicação desconto
        System.out.printf("O novo valor após aplicação do desconto é de: R$%.2f", precoComDesconto);



    }
}
