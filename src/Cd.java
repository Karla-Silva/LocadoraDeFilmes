package GIT.FinalProject.src;

public class Cd extends Midia {
    /*
    Atributos:
    artista : String
    quantidadeFaixas : int

    Métodos:
    sobrescrever darPlay(): exibir a mensagem "Primeira faixa tocando"
    construtor(todos os argumentos)
    get() e set()
     */
    private String artista;
    private int quantidadeFaixas;

    public Cd(String codigo, Double preco, String nome, String artista, int quantidadeFaixas) {
        super(codigo, preco, nome);
        this.artista = artista;
        this.quantidadeFaixas = quantidadeFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQuantidadeFaixas() {
        return quantidadeFaixas;
    }

    public void setQuantidadeFaixas(int quantidadeFaixas) {
        this.quantidadeFaixas = quantidadeFaixas;
    }

    @Override
    public void darPlay(){
        System.out.println("Primeira faixa tocando");
    }

    @Override
    public String toString() {
        return "Cd {" +
                "codigo='" + getCodigo() + '\'' +
                ", preco=" + getPreco() +
                ", nome='" + getNome() + '\'' +
                ", artista='" + artista + '\'' +
                ", quantidadeFaixas=" + quantidadeFaixas +
                '}';
    }
}
