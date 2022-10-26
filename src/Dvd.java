public class Dvd extends Midia{
    /*

Atributos:
idioma : String
possuiLegenda : boolean
idiomaLegenda : String

Métodos:
sobrescrever darPlay(): exibir a mensagem "filme iniciado"
construtor(todos os argumentos)
get() e set()
legenda(boolean ligar, String idioma) : liga a legenda e atualiza o idioma da legenda
legenda(boolean ligarDesligar) : apenas atualiza a variável possuiLegenda
     */
    private String idioma;
    private boolean possuiLegenda;
    private String idiomaLegenda;

    public Dvd(String codigo, Double preco, String nome, String idioma, boolean possuiLegenda, String idiomaLegenda) {
        super(codigo, preco, nome);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
        this.idiomaLegenda = idiomaLegenda;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isPossuiLegenda() {
        return possuiLegenda;
    }

    public void setPossuiLegenda(boolean possuiLegenda) {
        this.possuiLegenda = possuiLegenda;
    }

    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }

    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    @Override
    public void darPlay(){
        System.out.println("Filme iniciado");
    }

    public void legenda(boolean ligar, String idioma){
        //liga a legenda e atualiza o idioma da legenda
    }

    public void legenda(boolean ligarDesligar){
        //apenas atualiza a variável possuiLegenda
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "codigo='" + getCodigo() + '\'' +
                ", preco=" + getPreco() +
                ", nome='" + getNome() + '\'' +
                ", idioma='" + idioma + '\'' +
                ", possuiLegenda=" + possuiLegenda +
                ", idiomaLegenda='" + idiomaLegenda + '\'' +
                '}';
    }
}
