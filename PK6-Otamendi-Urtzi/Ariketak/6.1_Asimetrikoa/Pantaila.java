package Ariketa_1;


class Pantaila {
	private int maxim;

	public Pantaila(int max) {
		maxim=max;
		System.out.print("Sardeak |\t");

		for (int i=0; i<maxim; i++){
			System.out.print("Fil["+i+"]\t\t");
		}

		System.out.println("");
		System.out.print("========|");

		for (int i=0; i<maxim; i++){
			System.out.print("================");
		}

		System.out.println("");

	}





	synchronized public void idatzi(int zenb, String zer) {
		if(zenb == -1){
			System.out.println(zer+"|\t");
		}else{
			System.out.print("\t|\t" );
			for(int i=0; i<zenb; i++){
				System.out.print("\t\t");
			}
			System.out.println(zer);
		}
	}






}