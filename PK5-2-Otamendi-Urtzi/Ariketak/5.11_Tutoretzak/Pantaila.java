package Ariketa_11;

class Pantaila {
	private int kideak;
	public Pantaila(int kid) {
		
		kideak=kid;
		
		System.out.print("Irakaslea   |\t\t");

		for (int i=1; i<=kideak; i++){
			System.out.print("Ikasle["+i+"]\t");
		}
		System.out.print("ik \t\t");
		System.out.print("ig \t\t");
		System.out.print("irp\t\t");
		System.out.println("ire \t\t");
		System.out.print("====================");
		for (int i=0; i<=kideak; i++){

			System.out.print("====================");
		}
		System.out.println("====================");
	}
	
	synchronized public void heldu(int k) {
		String tab="\t\t\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		
		tab= tab +"Heldu";
		System.out.println(tab);
	}
	
	
	
	synchronized public void sartu(int k, int ik, Boolean ig, Boolean irp, Boolean ire) {
		String tab="\t\t\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		
		tab= tab +"Sartu";
		System.out.print(tab);
		balioak(k, ik, ig, irp, ire);
	}
	
	

	synchronized public void atera(int k, int ik, Boolean ig, Boolean irp, Boolean ire) {
		String tab="\t\t\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		
		tab= tab +"Atera";
		System.out.print(tab);
		balioak(k, ik, ig, irp, ire);
	}
	

	synchronized public void galdetu(int k, int ik, Boolean ig, Boolean irp, Boolean ire) {
		String tab="\t\t\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		
		tab= tab +"Galdetu";
		System.out.print(tab);
		balioak(k, ik, ig, irp, ire);
	}
	
	
	synchronized public void galderaPentsatzen() {
		String tab="Pentsatzen";
		
		System.out.println(tab);
	}
	synchronized public void galderaErantzun(int ik, Boolean ig, Boolean irp, Boolean ire) {
		String tab="Erantzun";
		
		System.out.print(tab);
		balioak(0, ik, ig, irp, ire);
	}

	synchronized public void galderaEntzun(int ik, Boolean ig, Boolean irp, Boolean ire) {
		String tab="Entzun";
		
		System.out.print(tab+"\t");
		balioak(0, ik, ig, irp, ire);
		
		
	}

	public void erantzunaEntzun(int k, int ik, Boolean ig, Boolean irp, Boolean ire) {
		String tab="\t\t\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		
		tab= tab +"Entzun";
		System.out.print(tab);
		balioak(k, ik, ig, irp, ire);
		
	}
	
	public void balioak(int k,int ik, Boolean ig, Boolean irp, Boolean ire) {
		String tab = "\t\t";
		for (int i=0; i<(kideak-k); i++){
			tab= tab+ "\t\t";
		}
		
		System.out.print(tab);
		System.out.print(ik);
		System.out.print("\t\t");
		System.out.print(ig);
		System.out.print("\t\t");
		System.out.print(irp);
		System.out.print("\t\t");
		System.out.print(ire);
		System.out.println("");
		
		
	}
	
	
}