public class ConversaoParaReais {
    public static void main(String[] args) {
        // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 5.00;
        double cotacaoDoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDoDolar;


        System.out.printf("U$%.2f equivale a R$%.2f\n", valorEmDolares, valorEmReais);

    }
}
