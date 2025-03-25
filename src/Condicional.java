public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String planoCliente = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme recém lançado");
        } else {
            System.out.println("Filme antigo que vale a pena assistir");
        }
        if (incluidoNoPlano && (planoCliente.equals("plus"))) {
            System.out.println("Você pode assistir o filme sem pagar pela locação");
        } else {
            System.out.println("Você deve pagar a locação para assistir o filme");
        }
    }
}

