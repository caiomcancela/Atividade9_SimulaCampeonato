import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Campeonato {
    private String nome;
    private Integer premioDinheiro;
    public ArrayList<TimeEsportivo> times;
    private EstatisticasCampeonato estatisticas;

    public Campeonato() {
        times = new ArrayList<>();
        estatisticas = new EstatisticasCampeonato(this);
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

    public void setTime(TimeEsportivo time) {
        times.add(time);
    }

    public TimeEsportivo getTimesCampeonato(Integer indice){
        return times.get(indice);
    }

    public String listarTodosTimesParticipantes(){
        String adicionar = "";
        for (int i = 0; i < times.size(); i++) {
            adicionar += times.get(i).getNome() + "\n";
        }
        return adicionar;
    }


    public String simularJogos() {
        estatisticas.novaRodada();
        Random rand = new Random();
        ArrayList<Integer> indices = new ArrayList<>();
        String partidas = "Resultado da Rodada "+ estatisticas.getTotalDeRodadas() +":\n\n";

        for (int i = 0; i < times.size(); i++) {
            indices.add(i);
        }

        Collections.shuffle(indices);

        for (int i = 0; i < indices.size() - 1; i += 2) {
            int indiceTime1 = indices.get(i);
            int indiceTime2 = indices.get(i + 1);

            int golsTime1 = rand.nextInt(6);
            int golsTime2 = rand.nextInt(6);

            partidas += times.get(indiceTime1).getNome() + " (" + golsTime1 + ") x " +
                    times.get(indiceTime2).getNome() + " (" + golsTime2 + ")\n";

            // Aplica a pontuação
            if (golsTime1 > golsTime2) {
                estatisticas.setVitorias(indiceTime1);
                estatisticas.setDerotas(indiceTime2);

            } else if (golsTime1 < golsTime2) {
                estatisticas.setVitorias(indiceTime2);
                estatisticas.setDerotas(indiceTime1);
            } else {
                estatisticas.setEmpates(indiceTime1);
                estatisticas.setEmpates(indiceTime2);

            }
            estatisticas.setGolsmarcados(indiceTime1,golsTime1);
            estatisticas.setGolsmarcados(indiceTime2,golsTime2);
            estatisticas.setGolsSofridos(indiceTime1,golsTime2);
            estatisticas.setGolsSofridos(indiceTime2,golsTime2);
        }

        return partidas;
    }

    public String imprimirTabelaCampeonato(){
        // nessa parte ficara responsavel por terminar a parte de imprimir tabela, os campos saldo de gols sera
        // com as estatisticas da classe estatisticas.

    }

    public String timeCampeao() {
        return times.get(1).getNome();
    }


}