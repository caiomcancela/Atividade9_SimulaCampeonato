import java.util.ArrayList;

public class Treinador {
    private String nome;
    private Integer idade;
    private String EstiloDeJogo;
    private TimeEsportivo Time;

    public Treinador() {
        this.nome = "";
        this.idade = 0;
        this.EstiloDeJogo = "";

    }

    public void addTime(TimeEsportivo time){
        Time = time;
    }

    public String treinarTime(TimeEsportivo time){
        return "Nome do time: " + time.getNome() +
                "Escalacao:   " + time.listarJogadores() +
                "Estilo de jogo:" + EstiloDeJogo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEstiloDeJogo() {
        return EstiloDeJogo;
    }

    public void setEstiloDeJogo(String estiloDeJogo) {
        EstiloDeJogo = estiloDeJogo;
    }
    public String treinarTime(){
        return "treinador " + this.nome + "esta treinando o time " + Time.getNome() + "...\n";
    }

}


