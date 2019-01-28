package Ariketa_9;

class Pantaila {
	private int maxim;
	private int kideak;
	public int kont;
	public Pantaila(int kid, int max) {
		maxim=max;
		kideak=kid;
		kont=max;


		for (int i=1; i<=kideak; i++){
			System.out.print("b["+i+"]\t\t");
		}
		System.out.println("Botea");

	}
	
	
	synchronized public void sartu(int k, int non, int[] lineak) {
		String tab="";
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Sartu:"+non;
		System.out.print(tab);
		margotuLineak(k,lineak);
	}
	
	
	synchronized public void atera(int k, int nondik, int[] lineak) {	
		String tab="";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Atera:"+nondik;
		System.out.print(tab);
		margotuLineak(k,lineak);
		
	}
	

	synchronized public void margotuLineak(int k, int[] lineak) {
		String tab="\t\t";
		for (int i=1; i<=(kideak-(k)); i++){
			tab= tab+ "\t\t";
		}
		System.out.print(tab);
		System.out.print("[");
		for (int i=0; i<(lineak.length); ++i) {
			if(lineak[i]==0){

				System.out.print(" "); 
			}
			else{

				System.out.print("*"); 
			}
		}
		System.out.println("]");

	}
}