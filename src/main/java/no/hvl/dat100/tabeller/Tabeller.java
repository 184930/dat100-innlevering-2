package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
	    if (tabell == null || tabell.length == 0) {
	        System.out.println("Tabellen er tom.");
	        return; // Stopper metoden hvis tabellen er tom eller 0
	    }

	    System.out.print("[ "); // Starter med å skrive ut en åpning parentese
	    for (int i = 0; i < tabell.length; i++) {
	        System.out.print(tabell[i]); // Skriv ut elementet
	        if (i < tabell.length - 1) {
	            System.out.print(", "); // Skriv ut en komma og mellomrom hvis det ikke er det siste elementet
	        }
	    }
	    System.out.print(" ]"); // Avslutter med en lukking parentes
	    System.out.println(); // Ny linje etter utskrift
	}



	// b)
	public static String tilStreng(int[] tabell) {
	    String streng = "[";
	    int i = 0;

	    // Loop gjennom tabellen
	    while (i < tabell.length) {
	        streng += tabell[i]; // Legg til elementet
	        i++;

	        // Hvis vi ikke er på slutten av tabellen, legg til komma
	        if (i != tabell.length) {
	            streng += ",";
	        }
	    }

	    streng += "]"; // Legg til slutten av strengen
	    return streng;
	}

	public static void main(String[] args) {
	    int[] tabell = {42, 67, 89};
	    String resultat = tilStreng(tabell);
	    System.out.println(resultat); // Skal skrive ut "[42,67,89]"
	}


	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0;i<tabell.length;i++) {
			sum = sum + tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean sannhet = false;
		int i = 0;
		while (i < tabell.length) {
			if (tall == tabell[i]) {
				sannhet = true;
			} i++;
		}
		return sannhet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;
		for (int i = 0; i<tabell.length; i++) {
			if (tall == tabell[i]) {
				pos = i;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] tab = {};
		int j = 0;
		for(int i = tabell.length - 1; i>=0; i--) {
			tab[j] = tabell[i];
			j++;
		}
		return tab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sannhet = true;
		for (int i = 0; i<tabell.length;i++) {
			if (tabell[i] > tabell[i+1]) {
				sannhet = false;
			}
		}
		return sannhet;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] tab;
		tab = new int[tabell1.length+tabell2.length];
		int a = 0;
		for(int i = 0; i<tabell1.length;i++) {
			tab[a] = tabell1[i];
			a++;
		}
		for(int j = 0; j<tabell2.length;j++) {
			tab[a] = tabell2[j];
			a++;
		}
		return tab;
	}
}
