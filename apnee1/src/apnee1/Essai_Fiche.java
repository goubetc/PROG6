package apnee1;

//import java.io.PrintStream;
import java.util.Scanner;

class Essai_Fiche {
    public static void main(String [] args) {
        Fiche ma_fiche = new Fiche();
        Scanner s = new Scanner(System.in);

        System.out.println("Saisissez une fiche");
        ma_fiche.lire(s);
        while (ma_fiche.age != 0) {
            System.out.println("Vous avez saisi la fiche :");
            ma_fiche.afficher(System.out);
            ma_fiche.lire(s);
        }
    }
}
