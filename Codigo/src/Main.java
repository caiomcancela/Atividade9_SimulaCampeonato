public class Main {
    public static void main(String[] args) {
        // Armazena no máximo 10 times
        TimeEsportivo[] times = new TimeEsportivo[10];
        int contadorTimes = 0;

        while (true) {
            int opcao = EntradaSaida.menu();

            switch (opcao) {
                case 0: // Cadastrar Times
                    if (contadorTimes < 10) {
                        TimeEsportivo time = EntradaSaida.cadastrarTime();
                        times[contadorTimes] = time;
                        contadorTimes++;
                    } else {
                        EntradaSaida.exibirMensagem("Limite de 10 times atingido!");
                    }
                    break;

                case 1: // Simular Jogos
                    EntradaSaida.exibirMensagem("Funcionalidade de simulação ainda não implementada.");
                    break;

                case 2: // Sair
                    EntradaSaida.exibirMensagem("Encerrando o programa...");
                    System.exit(0);
                    break;

                default:
                    EntradaSaida.exibirMensagem("Opção inválida.");
            }
        }
    }
}