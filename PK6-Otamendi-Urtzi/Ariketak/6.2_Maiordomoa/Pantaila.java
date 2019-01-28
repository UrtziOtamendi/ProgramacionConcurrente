package Ariketa_2;


class Pantaila {
	private int maxim;
	private int lekuak;
	private int izarrak;
	public Pantaila(int max) {
		maxim=max;
		lekuak=5;
		izarrak=0;
		System.out.print("Sardeak |\t");

		for (int i=0; i<maxim; i++){
			System.out.print("Fil["+i+"]\t\t");
		}

		System.out.println("| Maiordomo");
		System.out.print("========|");

		for (int i=0; i<maxim; i++){
			System.out.print("================");
		}

		System.out.println("================");

	}





	synchronized public void idatzi(int zenb, String zer, int n) {
		if(zenb == -1){
			System.out.print(zer+"|\t");
		}else{
			System.out.print("\t|\t" );
			for(int i=0; i<zenb; i++){
				System.out.print("\t\t");
			}
			System.out.print(zer);
		}
		izarrak(zenb, n);
	}

	synchronized public void idatziM(int zenb, String zer, int zenbat) {
		System.out.print("\t|\t" );
		for(int i=0; i<zenb; i++){
			System.out.print("\t\t");
		}
		System.out.print(zer);
		
		izarrak=zenbat;
		izarrak(zenb,0);
	}
	
	synchronized public void izarrak(int zenb, int n ) {
		if(zenb==-1) zenb=0;
		if(n==1) System.out.print("\t");
		for(int i=(zenb+n); i<maxim; i++){
			System.out.print("\t\t");
		}
		
		System.out.print( "| [");
		
		for(int i=0; i<izarrak; i++){
			System.out.print("*");
		}
		for(int i=0; i<(lekuak-izarrak); i++){
			System.out.print(" ");
		}
		System.out.println("]");
		
	}
}


