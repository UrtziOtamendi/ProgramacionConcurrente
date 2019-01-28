package Ariketa_3;


class Lapikoa {
	private int i;
	private int eg;
	private int razioak;
	private Pantaila pantaila;
	

	//LAPIKOA = LAPIKOA[0][0],

	//LAPIKOA [i:PR][eg:Egoera]
	public Lapikoa(int pl, Pantaila pant){
		razioak=pl; 
		pantaila=pant;
		i=0;
		eg=0;

	}


	//| when (eg==0) 				{s,b[BR]}.begiratu[i]   -> 	LAPIKOA[i][1]	
	synchronized int begiratu(int b) throws InterruptedException {
		while (!(eg==0)) wait();
		if(b==-1) {

			pantaila.begiratuSuk(i);
		}
		else {
			pantaila.begiratuBas(b,i);
		}
		eg=1;
		notify();
		return i;

	}

	//| when (i>0 && eg==1) 		b[BR].hartu[b:1..i] 	-> 	LAPIKOA[i-b][eg] 
	synchronized void hartu(int b, int zenbat) throws InterruptedException {
		while (!(i>0 && eg==1)) wait();
		i= i-zenbat;
		pantaila.hartu(b,zenbat, i);
		notify();

	}

	// ( when (i<PK && eg==1) 		s.bota[b:1..PK-i] 		-> 	LAPIKOA[i+b][eg] 
	synchronized void bete(int kant) throws InterruptedException {
		while (!(i<razioak && eg==1) ) wait();
		i=i + kant;
		pantaila.bete(kant, i);
		notify();
	}

	//| when (eg==1)				{s,b[BR]}.askatu		->	LAPIKOA[i][0]
	synchronized void  askatu() throws InterruptedException {
		while (!(eg==1)) wait();
	
		eg=0;
		notify();

	}
}