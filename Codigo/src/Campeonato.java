import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Campeonato {
    private String nome;
    private Integer premioDinheiro;
    private ArrayList<TimeEsportivo> times;

    public Campeonato(String nome,TimeEsportivo time) {
        this.nome = nome;
        times = new ArrayList<>();
        times.add(time);
    }

    public String getNome() {
        return nome;
    }

    public Integer getPremioDinheiro() {
        return premioDinheiro;
    }

    public void setPremioDinheiro(Integer premioDinheiro) {
        this.premioDinheiro = premioDinheiro;
    }

    public void setTime(TimeEsportivo time) {
        times.add(time);
    }

    public String listarTimesParticipantes(){
        String adicionar = "";
        for (int i = 0; i < times.size(); i++) {
            adicionar += times.get(i).getNome() + "\n";
        }
        return adicionar;
    }

    public String simularJogos() {
        Random rand = new Random();
        ArrayList<Integer> indices = new ArrayList<>();
        String partidas = "Resultado da Rodada: \n\n";

        for (int i = 0; i < times.size(); i++) {
            indices.add(i);
        }

        Collections.shuffle(indices);

        for (int i = 0; i < times.size(); i+=2) {
            partidas += times.get(indices.get(i)).getNome() + "(" + rand.nextInt(6) + ") x " +
                    times.get(indices.get(i+1)).getNome() + "(" + rand.nextInt(6) + ")" + "\n";
        }
        return partidas;
    }

    public String timeCampeao() {
        Random rand = new Random();
        TimeEsportivo timeCampeao = times.get(rand.nextInt(times.size());
        timeCampeao.setTitulos(this.nome);
    }
}