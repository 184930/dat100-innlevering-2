package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)



	// c)
	public static int summer(int[] tabell) {
	    int sum = 0;
	    for (int i = 0; i < tabell.length; i++) {
	        sum = sum + tabell[i];
	    }
	    return sum;
	}
	public class TabellOperasjoner {

	    public static int summer(int[] tabell) {
	        int sum = 0;
	        for (int i = 0; i < tabell.length; i++) {
	            sum = sum + tabell[i];
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        int[] tall = {1, 2, 3, 4, 5};
	        int resultat = summer(tall);
	        
	        System.out.println("Summen av tallene i tabellen er: " + resultat); 
	    }
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
