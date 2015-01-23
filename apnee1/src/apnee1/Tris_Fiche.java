package apnee1;

//import java.io.PrintStream;
import java.util.*;
//import java.io.PrintStream;


class Tris_Fiche {
	public static void main(String [] args) {
		 Scanner scan = new Scanner(System.in);  // warning resources
		 int i;
		 Fiche F = new Fiche();
		 F.age = 1;
		 ArrayList<Fiche> listefiche = new ArrayList<Fiche>();
		 
		 
		 // remplissage de la liste de fiche
		 while(F.age != 0) {
			F = new Fiche();
			F.lire(scan);
			if (F.age !=0)
				listefiche.add(F);
		 }
		 System.out.println("Liste de départ :");
		 for(i=0;i<listefiche.size();i++) {
			 listefiche.get(i).afficher();
			 System.out.println();
		 	
		 }
		 
		 
		 //tri par age croissant
		insertSort_age(listefiche); 
		
		System.out.println("Liste triée :");
		 for(i=0;i<listefiche.size();i++) {
			 listefiche.get(i).afficher();
			 System.out.println();
		 	
		 }
		 
		
		 
	}

	static void insertSort_age(ArrayList<Fiche> f){
	  for(int i = 1; i < f.size(); i++){
		Fiche value = f.get(i);
		int j = i - 1;
		while(j >= 0 && f.get(j).age > value.age){
		  f.set(j+1, f.get(j));
		  j = j - 1;
		}
		f.set(j+1, value);
	  }
	}
	
	static void insertSort_nom(ArrayList<Fiche> f){
		  for(int i = 1; i < f.size(); i++){
			Fiche value = f.get(i);
			int j = i - 1;
			while(j >= 0 && 0>=f.get(j).nom.compareTo(value.nom)){
			  f.set(j+1, f.get(j));
			  j = j - 1;
			}
			f.set(j+1, value);
		  }
		}
	
	
	
}