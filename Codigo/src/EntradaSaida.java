import javax.swing.*;

public class EntradaSaida {

    public static int menu() {
        String[] opcoes = {"1 - Cadastrar Times", "2 - Simular Jogos", "3 - Sair"};
        return JOptionPane.showOptionDialog(
                null, "Selecione a opção desejada:", "Menu Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public static TimeEsportivo cadastrarTime() {
        TimeEsportivo time = new TimeEsportivo();
        String nome = lerString("Digite o nome do time:");
        String sede = lerString("Digite a sede do clube:");
        time.setNome(nome);
        time.setSedeClube(sede);

        exibirMensagem("Time cadastrado com sucesso:\nNome: " + nome + "\nSede: " + sede);
        return time;
    }

    public static int lerInteiro(String mensagem) {
        String valor = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(valor);
    }

    public static String lerString(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    public static double lerDouble(String mensagem) {
        String valor = JOptionPane.showInputDialog(mensagem);
        return Double.parseDouble(valor);
    }

    public static String exibir(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}