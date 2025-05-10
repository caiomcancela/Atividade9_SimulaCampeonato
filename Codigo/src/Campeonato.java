import java.sql.Time;
import java.util.ArrayList;

public class Campeonato {
    private String nome;
    private Integer premioDinheiro;
    private ArrayList<Time> times;

    public Campeonato(Time time) {
        times = new ArrayList<>();
        times.get(time);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPremioDinheiro() {
        return premioDinheiro;
    }

    public void setPremioDinheiro(Integer premioDinheiro) {
        this.premioDinheiro = premioDinheiro;
    }

    public void setTime(Time time) {
        times.add(time);
    }

    public void listarTimesParticipantes(){
        String adicionar = "";
        for (int i = 0; i < times.size(); i++) {
            adicionar += times.get(i).getNome() + "\n";
        }
        return adicionar;
    }

    public class
}