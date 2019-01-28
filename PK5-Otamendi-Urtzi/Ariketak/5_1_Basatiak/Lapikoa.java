package Ariketa_1;


class Lapikoa {
	private int p;
	private int razioak;
	private Pantaila pantaila;
	
	//LAPIKOA = LAPIKOA[p:PR]
	//LAPIKOA = LAPIKOA[0]
	Lapikoa(int pl, Pantaila pant){
		razioak=pl; 
		pantaila=pant;
		p=0;
		
	}
	
	// (when(p>0) 		b[BR].hartu	->LAPIKOA[p-1]
	synchronized void hartu(int b) throws InterruptedException {
		while (!(p>0)) wait();
			p--;
			pantaila.hartu(b,p);
			notify();
		
	}
	
	//|when(p==0) 	s.bete		->LAPIKOA[PK]
	synchronized void bete() throws InterruptedException {
		while (!(p==0)) wait();
			p=razioak;
			pantaila.bete(p);
			notify();
		}
	
}