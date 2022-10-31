import java.util.Random;
import java.util.Scanner;

public class DoacaoMidia {
    public Midia pegarMidiaAleatoria() {
        Random gerador = new Random();

        Midia midia1 = new Cd("1",58.41,"1989","Taylor Swift", 19);
        Midia midia2 = new Dvd("2", 58.90, "Sing 2", "Inglês", false, "Inglês");
        Midia midia3 = new Cd("3",39.90,"Nevermind","Nirvana", 12);
        Midia midia4 = new Dvd("4", 22.95, "Ratatouille", "Inglês", true, "Português");

        int midiaAleatoria = gerador.nextInt(4);

        switch (midiaAleatoria) {
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
    public static void assistirFilme(Dvd dvd) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O filme possui legenda? true / false");
        boolean temLegenda = scanner.nextBoolean();
        System.out.println("Qual o idioma da legenda?");
        String qualLegenda = scanner.next();
        dvd.legenda(temLegenda, qualLegenda);
        if(dvd.getPossuiLegenda()){
            System.out.println("Gostaria de ligar a legenda? true / false");
            boolean ligarDesligar = scanner.nextBoolean();
            dvd.legenda(ligarDesligar);
        }
        scanner.close();
        System.out.println("Assistindo filme");
    }
}
