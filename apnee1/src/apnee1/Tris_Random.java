package apnee1;

import java.util.*;


class Tris_Random {
	public static void main(String [] args) {

		 Scanner scan = new Scanner(System.in); 
		 System.out.println("taille tu tableau ?");
		 int i;
		 int [] tab;
		 int N = scan.nextInt();
		 
		 tab = new int[N];
		 Random r = new Random();
		 for(i=0;i<tab.length;i++) {
		 	tab[i] = r.nextInt(1000);		 	
		 }
		 insertSort(tab);
		 
		 for(i=0;i<tab.length;i++) {
		 	System.out.println(i + " " + tab[i]);
		 }
		 
	}

	static void insertSort(int[] A){
	  for(int i = 1; i < A.length; i++){
		int value = A[i];
		int j = i - 1;
		while(j >= 0 && A[j] > value){
		  A[j + 1] = A[j];
		  j = j - 1;
		}
		A[j + 1] = value;
	  }
	}
}