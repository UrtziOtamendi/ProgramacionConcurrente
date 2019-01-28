package Ariketa_4;


class Botea {
	private int i;
	private Pantaila pantaila;
	private Boolean okup;
	public final int MAX;

	//BOTEA = BOTEA[0][0],

	//BOTEA [i:BR][okup:Bool]
	public Botea( Pantaila pant, int max){
		pantaila=pant;
		MAX=max;
		i=0;
		okup=false;

	}

	//when (okup==False) 	p[PR].begiratu[i] 		->  BOTEA[i][True]	
	synchronized int begiratu(int pisukide, String zertara) throws InterruptedException {
		pantaila.zerbaitetara(pisukide,zertara);
		while (!(okup==false)) wait();
		okup=true;
		pantaila.begiratzera(pisukide);
		notify();
		return i;
	}

	//p[PR].askatu			->	BOTEA[i][False]
	synchronized void askatu(int pisukide) throws InterruptedException {

		okup= false;
		pantaila.askatu(pisukide);
		notify();


	}

	//when (i>0 && okup==True)  	 			p[PR].hartu[b:1..i]		-> 	BOTEA[i-b][okup] 
	synchronized void hartu(int b, int zenbat) throws InterruptedException {
		while (!(i>0 && okup==true) ) wait();
		i= i -zenbat;
		pantaila.hartu(b, zenbat, i);
		notify();

	}
	//when (i<BK && okup==True) 		p[PR].bota[b:1..BK-i] 	-> 	BOTEA[i+b][okup] 
	synchronized void bota(int b, int zenbat) throws InterruptedException {
		while (!(i<MAX && okup==true) ) wait();
		i=i + zenbat;
		pantaila.bete(b, zenbat,i);
		notify();
	}

}