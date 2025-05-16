public class Jogador {
    private String nome;
    private Integer Idade;
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
        return "O jogador " + this.nome + "pertence ao time " + timeAtual.getNome() +"\n";
    }

    public String jogar(){
        return "O jogador " + this.nome + "esta jogando" + "\n";
    }
}