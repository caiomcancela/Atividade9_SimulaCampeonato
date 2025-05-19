import java.util.Random;

public class Jogador {
    private String nome;
    private Integer idade;
    private Float salario;
    private String posicao;
    private TimeEsportivo timeAtual;

    public Jogador(String nome,TimeEsportivo time) {
        this.nome = nome;
        this.timeAtual = time;
    }

    public String getNome() {
        return nome;
    }



    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }


    public String exibirJogador(){
        return "Nome: " + this.nome + "\n" +
                "Idade: " + this.idade + "\n" +
                "Time atual: " + this.timeAtual.getNome() + "\n" +
                "Posição: " + this.posicao + "\n";
    }

    public String jogarPartida(){
        return "O jogador " + this.nome + " esta jogando a partida" + "\n";
    }

    public String treinar(){
        String tipoDeTreino[] = {"Chute","Defesa","Passe","Drible","Fisico(Academia)","Coletivo(Partida)"};
        Random rand = new Random();

        return "O jogador " + this.nome + " esta treinando " + tipoDeTreino[rand.nextInt(5)] + "\n";
    }
}