package apnee1;

import java.util.*;
import java.io.PrintStream;
class Fiche {
	String nom;
	String prenom;
	int age;
	
	void lire(Scanner my_scanner){
        boolean erreur = true;
		//Fiche f = new Fiche();		
		try {
	    	my_scanner = new Scanner(System.in);
			System.out.println("Saisissez votre nom");
			nom = my_scanner.nextLine();
			System.out.println("Saisissez votre prenom");
			prenom = my_scanner.nextLine();
			// System.out.println("Vous avez l'entier : " + entier);
			while(erreur) {
		    	erreur = false;
				try {
					my_scanner = new Scanner(System.in);
					System.out.println("Saisissez votre age");
					age = my_scanner.nextInt();
				// System.out.println("Vous avez l'entier : " + entier);
				}
				catch(InputMismatchException e) {
					System.out.println("Pas un int");
					erreur = true;
				}
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("Aucune ligne trouvee");
			erreur = true;
		}
	}

	
	public void afficher(PrintStream sys) {
		sys.println("nom : " + nom);
		sys.println("prenom : " + prenom);
		sys.println("age : " + age);
	}
	
	public void afficher()
	{
		afficher(System.out);
	}
}