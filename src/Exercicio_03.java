/*Declare uma variável do tipo double e uma variável do tipo int.
Faça o casting da variável double para int e imprima o resultado. */
public class Exercicio_03 {
    public static void main(String[] args) {
        double peso = 20.5;
        int idade = 19;
        int pesoCasting = (int) (peso);
        System.out.printf("O peso é de: " + pesoCasting + " kg.");
    }
}