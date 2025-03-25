/*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
Considere que o valor de 1 dólar é equivalente a 4.94 reais.
Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/
public class Exercicio_06 {
    public static void main(String[] args) {

        double valorEmDolares = 15.5;
        double valorDolaresEmReais = 4.94 * valorEmDolares;
        System.out.printf("O valor de US$15.5 em reais é de R$%.2f", valorDolaresEmReais);


    }
}
