package screenmatch;

public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDasAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração (min): " + duracaoEmMinutos);
        System.out.println("Avaliação: " + pegaMedia());
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }
}
