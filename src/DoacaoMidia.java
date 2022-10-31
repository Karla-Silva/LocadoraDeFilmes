package GIT.FinalProject.src;

import java.util.Random;
public class DoacaoMidia {
    public Midia pegarMidiaAleatoria() {
        Random gerador = new Random();

        Midia midia1 = new Cd("1",58.41,"1989","Taylor Swift", 19);
        Midia midia2 = new Dvd("2", 58.90, "Sing 2", "Inglês", false, "Inglês");
        Midia midia3 = new Cd("3",39.90,"Nevermind","Nirvana", 12);
        Midia midia4 = new Dvd("4", 22.95, "Ratatouille", "Inglês", true, "Português");

        int midiaAleatória = gerador.nextInt(4);

        switch (midiaAleatória) {
            case 0:
                return midia1;
            case 1:
                return midia2;
            case 2:
                return midia3;
            default:
                return midia4;
        }
    }
    public void assistirFilme(Dvd dvd) {
        // chamar os dois métodos de legenda
    }
}
