package Ariketa_5;


class procesSync {
	
	public  int iri =0;
	public  int eg = 0;
	public  int irt = 0;

	private Pantaila pantaila;
	
	//EKINTZA = EKINTZA[0][0][0],

	//EKINTZA [iri:PrE][eg:PrE][irt:PrE]
	
	public procesSync( Pantaila pant, int p){
		pantaila=pant;
		
		
	}
	

	//when (eg==0 && irt==0)	 		p[PR].iritsi	-> 	EKINTZA[iri+1][eg][irt]
	synchronized void iritsi(int prozesua) throws InterruptedException {
		while (! (eg==0 && irt==0)) wait();
		iri++;
		pantaila.iritsi(prozesua);
		notify();
		
	}


//when (iri==PK && irt==0) 		p[PR].egin		-> 	EKINTZA[iri][eg+1][irt]
	synchronized void egin(int prozesua) throws InterruptedException {
		while (! (iri==SyncroApp.Kideak && irt==0) ) wait();
		
		eg++;
		pantaila.egin(prozesua);
		notify();
		
	}
//	when (eg==PK && iri==PK) 		p[PR].irten		-> 	if((irt+1)==PK) then EKINTZA[0][0][0]
	//	else EKINTZA[iri][eg][irt+1]				

	synchronized void irten(int prozesua) throws InterruptedException {
		while (!(eg==SyncroApp.Kideak && iri==SyncroApp.Kideak) ) wait();
		
		irt++;
		pantaila.irten(prozesua);
		if(irt==SyncroApp.Kideak) {
			iri=0;
			irt=0;
			eg=0;
		}
		
		notify();
	
	}
}