public class Main {
    public static void main(String[] args) {
        Midia midia = new DoacaoMidia().pegarMidiaAleatoria();
        System.out.println(midia.toString());
        midia.darPlay();
    }
}

