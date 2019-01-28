package Ariketa_2;


class Lapikoa {
	private int p;
	private int razioak;
	private Pantaila pantaila;
	
	
	Lapikoa(int pl, Pantaila pant){
		razioak=pl; 
		pantaila=pant;
		p=0;
		
	}
//(when(p>0) 		b[BR].hartu	->LAPIKOA[p-1]
	synchronized void hartu(int b) throws InterruptedException {
		while (!(p>0)) wait();
			p--;
			
			pantaila.hartu(b, p);
			notify();
		
	}
	//|when((PK-p)>2) 	s.bete		->LAPIKOA[p+3]
	synchronized void bete() throws InterruptedException {
		while (!((razioak-p)>2)) wait();
			p=p+3;
			pantaila.bete(p);
			notify();
		}
	
}