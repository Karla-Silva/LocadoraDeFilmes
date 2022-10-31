package GIT.FinalProject.src;

public class Dvd extends Midia {
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

    public boolean getPossuiLegenda() {
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
    public void darPlay() {
        System.out.println("Filme iniciado");
    }

    public void legenda(boolean ligar, String idioma) {
        setPossuiLegenda(ligar);
        setIdiomaLegenda(idioma);
    }

    public void legenda(boolean ligarDesligar) {
       setPossuiLegenda(ligarDesligar);
    }

    @Override
    public String toString() {
        return "Dvd {" +
                "codigo='" + getCodigo() + '\'' +
                ", preco=" + getPreco() +
                ", nome='" + getNome() + '\'' +
                ", idioma='" + idioma + '\'' +
                ", possuiLegenda=" + possuiLegenda +
                ", idiomaLegenda='" + idiomaLegenda + '\'' +
                '}';
    }

}
