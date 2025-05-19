import javax.swing.*;

public class EntradaSaida {

    public static void menu() {
        String[] opcoes = {"1 - Cadastrar Times", "2 - Simular Jogos", "3 - Sair"};
        int escolha = JOptionPane.showOptionDialog(
                null, "Selecione a opção desejada:", "Menu Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                String nomeTime = lerString("Digite o nome do time:");
                JOptionPane.showMessageDialog(null, "Time cadastrado: " + nomeTime);
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Saindo do programa...");
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção válida foi selecionada.");
        }
    }

    public static int lerInteiro(String mensagem) {
        String valor = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(valor);
    }

    public static String lerString(String mensagem) {
        String nome = JOptionPane.showInputDialog(mensagem);
        return nome;
    }

    public static double lerDouble(String mensagem) {
        String valor2 = JOptionPane.showInputDialog(mensagem);
        return Double.parseDouble(valor2);
    }

    public static String exibir(String mensagem) {
        String msg = JOptionPane.showInputDialog(mensagem);
        return msg;
    }
}