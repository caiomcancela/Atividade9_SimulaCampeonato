import java.util.ArrayList;

public class EstatisticasCampeonato {
    private Campeonato campeonato;
    private ArrayList<Integer> vitorias;
    private ArrayList<Integer> empates;
    private ArrayList<Integer> derotas;
    private ArrayList<Integer> golsMarcados;
    private ArrayList<Integer> golsSofridos;
    private Integer totalDeRodadas;

    public EstatisticasCampeonato(Campeonato campeonatoAtual){
        campeonato = new Campeonato();
        this.campeonato = campeonatoAtual;
        for (int i = 0; i < 10; i++) {
            vitorias.add(0);
            empates.add(0);
            golsMarcados.add(0);
            golsSofridos.add(0);
        }
    }

    public Integer getVitorias(Integer indice) {
        return vitorias.get(indice);
    }

    public Integer getEmpates(Integer indice) {
        return empates.get(indice);
    }

    public Integer getDerotas(Integer indice) {
        return vitorias.get(indice);
    }

    public Integer getGolsmarcados(Integer indice) {
        return golsMarcados.get(indice);
    }

    public Integer  getGolsSofridos(Integer indice) {
        return golsSofridos.get(indice);
    }

    public void setVitorias(Integer indice) {
        vitorias.add(indice,vitorias.get(indice)+1);
    }

    public void setEmpates(Integer indice) {
        empates.add(indice,empates.get(indice)+1);
    }

    public void setDerotas(Integer indice) {
        derotas.add(indice,derotas.get(indice)+1);
    }

    public void setGolsmarcados(Integer indice,Integer valor) {
        golsMarcados.add(indice,golsMarcados.get(indice)+valor);
    }

    public void setGolsSofridos(Integer indice,Integer valor) {
        golsSofridos.add(indice,golsSofridos.get(indice)+valor);
    }

    public Integer getTotalDeRodadas() {
        return totalDeRodadas;
    }

    public void novaRodada() {
        this.totalDeRodadas += 1;
    }

    public void orderarTabelas(){
        // nesse metodo sera ultilizado para implementar a organização(bubble sort) dos ArrayList: golsSofridos,golsMarcados,vitorias,empates,derrotas.
        // com a classe times deve ser organizada tambem, mesmo estando na classe campeonato.
    }
}
