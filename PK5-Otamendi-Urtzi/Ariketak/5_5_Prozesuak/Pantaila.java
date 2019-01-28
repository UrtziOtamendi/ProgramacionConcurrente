package Ariketa_5;

class Pantaila {
	private int prozesuak;
	public Pantaila(int p) {
		prozesuak = p;


		for (int i=1; i<=prozesuak; i++){
			System.out.print("p["+i+"]\t\t");
		}
		System.out.println("");

		for(int i=1; i<=(p);i++){
			System.out.print("--------------");

		}
		System.out.println("");


	}
	
	synchronized public void iritsi(int k) {
		String tab="";
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Iritsi";
		System.out.println(tab);
	}


	synchronized public void egin(int k) {
		String tab="";
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Egin";
		System.out.println(tab);
	}

	synchronized public void irten(int k) {
		String tab="";
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Irten";
		System.out.println(tab);
	}
	
	


}