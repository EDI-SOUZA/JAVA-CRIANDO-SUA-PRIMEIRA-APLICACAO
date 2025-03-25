/*Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
Utilize variáveis para representar os valores das temperaturas e imprima no console
o valor convertido de Celsius para Fahrenheit.
Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.
Depois de finalizar, testar e conferir que seu programa foi executado com sucesso,
crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.
 Lembre-se que provavelmente você precisará fazer um casting de valores. */
public class Exercicio_01 {
    public static void main(String[] args) {
        double temperatura = 40;
        double conversaoParaFahrenheit = (temperatura * 1.8) + 32;
        System.out.printf("A temperatura de %.0fºC Celsius convertido para Fahrenheit é de %.0fºF.", temperatura, conversaoParaFahrenheit);
    }

    }
