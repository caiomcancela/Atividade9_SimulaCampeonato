import java.util.ArrayList;

public class EstatisticasCampeonato {
    private Campeonato campeonato;
    private ArrayList<Integer> vitorias;
    private ArrayList<Integer> empates;
    private ArrayList<Integer> derrotas;
    private ArrayList<Integer> golsMarcados;
    private ArrayList<Integer> golsSofridos;
    private Integer totalDeRodadas;

    public EstatisticasCampeonato(Campeonato campeonatoAtual) {

        this.campeonato = campeonatoAtual;
//        this.vitorias = new ArrayList<>();
//        this.empates = new ArrayList<>();
//        this.derrotas = new ArrayList<>();
//        this.golsMarcados = new ArrayList<>();
//        this.golsSofridos = new ArrayList<>();


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

    public Integer getDerrotas(Integer indice) {
        return derrotas.get(indice);
    }

    public Integer getGolsmarcados(Integer indice) {
        return golsMarcados.get(indice);
    }

    public Integer getGolsSofridos(Integer indice) {
        return golsSofridos.get(indice);
    }

    public void setVitorias(Integer indice, Integer valor) {
        vitorias.set(indice, getVitorias(indice) + 1);
    }

    public void setEmpates(Integer indice, Integer valor) {
        empates.set(indice, empates.get(indice) + 1);
    }

    public void setDerrotas(Integer indice, Integer valor) {
        derrotas.set(indice, derrotas.get(indice) + 1);
    }

    public void setGolsmarcados(Integer indice, Integer valor) {
        golsMarcados.set(indice, golsMarcados.get(indice) + valor);
    }

    public void setGolsSofridos(Integer indice, Integer valor) {
        golsSofridos.set(indice, golsSofridos.get(indice) + valor);
    }

    public Integer getTotalDeRodadas() {
        return totalDeRodadas;
    }

    public void novaRodada() {
        this.totalDeRodadas += 1;
    }

    public void orderarTabelas() {
        // nesse metodo sera ultilizado para implementar a organização(bubble sort) dos ArrayList: golsSofridos,golsMarcados,vitorias,empates,derrotas.
        // com a classe times deve ser organizada tambem, mesmo estando na classe campeonato.
        //golsSofridos


        for (int i = 0; i < vitorias.size() - 1; i++) {
            for (int j = 0; j < vitorias.size() - 1; j++) {
                if (getVitorias(j) < getVitorias(j + 1)) {
                    int aux = getVitorias(j + 1);
                    setVitorias(j + 1, getVitorias(j));
                    setVitorias(j, aux);

                }
            }

        }

        for (int i = 0; i < empates.size() - 1; i++) {
            for (int j = 0; j < empates.size() - 1; j++) {
                if (getEmpates(j) < getEmpates(j + 1)) {
                    int aux = getEmpates(j + 1);
                    setEmpates(j + 1, getEmpates(j));
                    setEmpates(j, aux);

                }
            }

        }

        for (int i = 0; i < derrotas.size() - 1; i++) {
            for (int j = 0; j < derrotas.size() - 1; j++) {
                if (getDerrotas(j) < getDerrotas(j + 1)) {
                    int aux = getVitorias(j + 1);
                    setDerrotas(j + 1, getDerrotas(j));
                    setDerrotas(j, aux);

                }
            }

        }

    }
}
