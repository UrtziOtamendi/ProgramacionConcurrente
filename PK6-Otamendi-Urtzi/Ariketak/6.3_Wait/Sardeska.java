package Ariketa_3;

class Sardeska {
	private boolean h=false;
	private int zenbakia;
	private Pantaila pant;
	
	
//	SARD = SARD[0],
//	SARD[h:Bool] =

	
	Sardeska(int zenb, Pantaila p){
		zenbakia = zenb;
		pant=p;
		
	}
	
	
	
//	| 				put	->	SARD[0]).
	public synchronized void put() {
		h=false;
		pant.idatzi(-1,zenbakia+" utzia ");
		notify();
	}
	



	// (when (h==0) 	  get	->	SARD[1]
	synchronized boolean get() throws java.lang.InterruptedException {

		while (h) {

			wait(100);

			if (h) return false;

		}

		h=true;
		pant.idatzi(-1,zenbakia+" hartua");

		return true; 
	}
}