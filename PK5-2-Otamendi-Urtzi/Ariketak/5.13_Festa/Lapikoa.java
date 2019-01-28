package Ariketa_13;


class Lapikoa {
	private int l=0;
	private int egL=0;
	private int egH=0;
	private int h=0;
	private int razioak;
	private Pantaila pantaila;
	

	//LAPIKOA = LAPIKOA[0][0][0][0],

	//LAPIKOA [h:HR][egH:Egoera][l:PR][egL:Egoera] 
	public Lapikoa(int pl, Pantaila pant){
		razioak=pl; 
		pantaila=pant;
		

	}

	//							s.hil					->  LAPIKOA[h][egH][l][egL]
	synchronized void hil()  throws InterruptedException{
		pantaila.hil(h,egH,l,egL);
		notifyAll();
	}
	
	//|when (egH==0)				s.begiratuHozk[h]		->	LAPIKOA[h][1][l][egL]

	synchronized int begiratuHozk() throws InterruptedException {
		while (!(egH==0)) wait();
		
		egH=1;
		notifyAll();
		pantaila.begiratuHoz(h,egH,l,egL);
		return h;

	}
	
	//|							s.zatitu[z:0..HK-h]		->  LAPIKOA[h][egH][l][egL]
	//|when (h<HK && egH==1)		s.gorde[z:0..HK-h]		-> 	LAPIKOA[h+z][egH][l][egL]
	synchronized void gorde(int z) throws InterruptedException {
		while (!(h<BasatiakApp.HK && egH==1)) wait();
		h=h+z;
		pantaila.gorde(z,h,egH,l,egL);
		notifyAll();

	}
	
	//|when (egH==1)				s.askatuHozk			->  LAPIKOA[h][0][l][egL]
	synchronized void askatuHozk() throws InterruptedException {
		while (!( egH==1)) wait();
		egH=0;
		pantaila.askatuHozk(h,egH,l,egL);
		notifyAll();

	}
	
	//|when (egL==0)	 			s.begiratuLap[l]   		-> 	LAPIKOA[h][egH][l][1]
	synchronized int begiratuLap() throws InterruptedException {
		while (!( egL==0)) wait();
		egL=1;
		pantaila.begiratuLap(h,egH,l,egL);
		notifyAll();
		return l;

	}
	
	//|when (h>0 && egH==1) 		s.hartu[r:0..PK-l]		->	LAPIKOA[h-r][egH][l][egL]
	synchronized void hartuHozk(int r) throws InterruptedException {
		while (! (h>0 && egH==1)) wait();
		h=h-r;
		pantaila.hartuHozk(r,h,egH,l,egL);
		notifyAll();

	}
	//|when (l<PK && egL==1) 		s.bota[r:1..PK-l] 		-> 	LAPIKOA[h][egH][l+r][egL]
	synchronized void bota(int r) throws InterruptedException {
		while (!  (l<razioak && egL==1)) wait();
		l=l+r;
		pantaila.bota(r,h,egH,l,egL);
		notifyAll();

	}
	//|when (egH==1 && egL==1)    s.askatu				->	LAPIKOA[h][0][l][0]
	synchronized void askatu() throws InterruptedException {
		while (! (egH==1 && egL==1)) wait();
		egH=0;
		egL=0;
		pantaila.askatuSuk(h,egH,l,egL);
		notifyAll();

	}
	
	//| when (l>0 && egL==1) 		b[BR].hartu[b:1..l] 	-> 	LAPIKOA[h][egH][l-b][egL]
	synchronized void hartu(int b, int z) throws InterruptedException {
		while (!(l>0 && egL==1)) wait();
		l= l-z;
		pantaila.hartu(b,z,h,egH,l,egL);
		notify();

	}
	
	//| when (egL==0) 			b[BR].begiratu[l]   	-> 	LAPIKOA[h][egH][l][1]
	synchronized int begiratu(int b) throws InterruptedException {
		while (!(egL==0)) wait();
	
		egL=1;
		notify();
		pantaila.begiratu(b,h,egH,l,egL);
		return l;

	}
	//| when (egL==1)				b[BR].askatu			->	LAPIKOA[h][egH][l][0]
	synchronized void askatu(int b) throws InterruptedException {
		while (! ( egL==1)) wait();
		
		egL=0;
		pantaila.askatu(b,h,egH,l,egL);
		notifyAll();

	}
	
	synchronized void jan(int b) throws InterruptedException {
		pantaila.jan(b,h,egH,l,egL);
		notifyAll();

	}
	
	synchronized void lo(int b) throws InterruptedException {
		pantaila.lo(b,h,egH,l,egL);
		notifyAll();

	}

	
	
}