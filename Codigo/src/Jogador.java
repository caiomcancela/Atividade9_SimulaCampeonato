import java.util.Random;

public class Jogador {
    private String nome;
    private Integer Idade;
    private Float salario;
    private String posicao;
    private TimeEsportivo timeAtual;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
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

    public void adicionarTime(TimeEsportivo time){
        timeAtual = time;
    }

    public  timeQueJogaAtualmente(){
        return "O jogador " + this.nome + " pertence ao " + timeAtual.getNome() +"\n";
    }

    public String jogarPartida(){
        return "O jogador " + this.nome + " esta jogando a partida" + "\n";
    }

    public String treinar(){
        String tipoDeTreino[] = {"Chute","Defesa","Passe","Drible","Fisico(Academia)","Coletivo(Partida)"};
        Random rand = new Random();

        return "O jogador " + this.nome + " esta treinando " + tipoDeTreino[rand.nextInt(5)] "\n";
    }
}