package Ariketak_8;

class Pantaila {
	private int kideak;
	public int kont;
	
	public Pantaila(int kid) {
		kideak=kid;


		for (int i=1; i<=kideak; i++){
			System.out.print("p["+i+"]\t\t");
		}
		System.out.println("AGENDA");

	}
	
	synchronized public void hartu(int k, int[] zenb, int[] zenbakiak) {	
		String tab="";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Hartu["+zenb[0]+"]["+zenb[1]+"]\t";
		System.out.print(tab);
		margotuZenbakiak(k,zenbakiak);
		
	}
	
	
	synchronized public void sartu(int k, int a, int[] zenbakiak) {
		String tab="";
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Sartu["+a+"]\t";
		System.out.print(tab);
		margotuZenbakiak(k,zenbakiak);
	}
	
	
	synchronized public void amaitu( int a) {
		
		System.out.print("** BATURA: "+a+" **");
	}

	synchronized public void margotuZenbakiak(int k, int[] zenbakiak) {
		String tab="";
		for (int i=1; i<=(kideak-(k)); i++){
			tab= tab+ "\t\t";
		}
		System.out.print(tab);
		for (int i=0; i<(zenbakiak.length); ++i) {
			System.out.print("|");
			if(zenbakiak[i]==-1){

				System.out.print("  "); 
			}
			else{
				if(zenbakiak[i]>9){
					System.out.print(zenbakiak[i]); 
				}else{

					System.out.print(" "+zenbakiak[i]); 
				}
			}
		}
		System.out.println("|");

	}
}