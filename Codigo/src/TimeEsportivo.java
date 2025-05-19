import java.util.ArrayList;

public class TimeEsportivo {
    private String nome;
    private String sedeClube;
    private ArrayList<Jogador> jogadores;

    public TimeEsportivo() {
        this.nome = "";
        this.sedeClube = "";
        this.jogadores = new ArrayList<>();

    }

    public void addJogadores(Jogador jogador) {
        jogadores.add(jogador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSedeClube() {
        return sedeClube;
    }

    public void setSedeClube(String sedeClube) {
        this.sedeClube = sedeClube;
    }

    public String listarJogadores(){
        String lista = "";
        for (int i = 0; i < jogadores.size(); i++) {
            lista = jogadores.get(i).getNome() + "\n";

        }
        return "Listagem de jogadores \n" + lista;
    }
}
