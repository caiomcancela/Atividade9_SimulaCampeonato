public class Main {
    public static void main(String[] args) {

        EntradaSaida.menu();

        int num = EntradaSaida.lerInteiro("Digite um numero");
        System.out.println(num);

        String nome =  EntradaSaida.lerString("Digite o nome do time:");
        System.out.println(nome);

        double valor = EntradaSaida.lerDouble("Digite um valor");
        System.out.println(valor);

        String msg = EntradaSaida.exibir("Digite uma mensagem");
        System.out.println(msg);
    }
}