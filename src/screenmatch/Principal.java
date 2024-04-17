package screenmatch;

public class Principal {
    public static void main(String[] args) {

        Filme meuFavorito = new Filme();

        meuFavorito.nome = "Sr. e Sra. Smith";
        meuFavorito.anoDeLancamento = 2005;
        meuFavorito.duracaoEmMinutos = 120;
        meuFavorito.incluidoNoPlano = true;

        meuFavorito.avalia(8.5);
        meuFavorito.avalia(9.0);
        meuFavorito.avalia(9.5);
        meuFavorito.avalia(10.0);

        meuFavorito.pegaMedia();
        meuFavorito.exibeFichaTecnica();

    }
}