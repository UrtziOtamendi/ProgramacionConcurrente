package Zebrabidea;


class BidezkoZebrabide  {




	//ZEBRABIDEA = ZEBRABIDEA[0][0][0][0][Oinezko][0],
		//	ZEBRABIDEA[kp:T][op:T][kz:T][oz:T][t:TR][kont:KR]
					
	public static int Oinezko=0;
	public static int Kotxe=1;

	private int kp = 0;   //kotxe kopurua zebrabidean;
	private int op = 0;   //oinezko kopurua zebrabidean;
	private int kz = 0;   //kotxe kopurua  zain;
	private int oz = 0; //oinezko kopurua  zain;
	private int t=Oinezko; // txanda zenek duen;
	private int kont=0; //kont kontagailua.
	private int M=0; //maximoa 
	private int KontMax=0;
	private Pantaila pantaila;

	public BidezkoZebrabide(int max, int kmax, Pantaila p) {
		M=max;
		KontMax=kmax;
		pantaila=p;
	}


	//	oinezkoa[IDP].iritsi      -> 	ZEBRABIDEA[kp][op][kz][oz+1][t][kont]
	synchronized void iritsiO(int zenbakia) throws InterruptedException {
		oz++;


		pantaila.mugituOinezkoa(zenbakia,1,oz,kz,op,kp,kont, t);

		notifyAll();
	}


	//	|			  				  kotxea[IDK].iritsi        ->	 ZEBRABIDEA[kp][op][kz+1][oz][t][kont]
	synchronized void iritsiK(int zenbakia) throws InterruptedException {
		kz++;

		pantaila.mugituKotxea(zenbakia,1,oz,kz,op,kp,kont, t);
		notifyAll();
	}


	//|when (kp==0 && ((t==Oinezko && kz<M && kont<KontMax ) ||(kont==KontMax && t==Kotxe) )) 						oinezkoa[IDP].sartu 	  -> 	if ( t==Oinezko  ) then ZEBRABIDEA[kp][op+1][kz][oz-1][t][kont+1]
																													//	else ZEBRABIDEA[kp][op+1][kz][oz-1][Kotxe][0]
	synchronized void sartuO(int zenbakia)  throws InterruptedException {
		while (!(kp==0 && ((t==Oinezko && kz<M && kont<KontMax ) ||(kont==KontMax && t==Kotxe) )) ) wait();

		oz--;
		op++;
		

		pantaila.mugituOinezkoa(zenbakia,2,oz,kz,op,kp,kont, t);
		if(t==Oinezko ) {
			 kont++;	 
		}else {
			kont=0;
			t=Kotxe;
		}


		notifyAll();
	}

	//|when (op==0 &&  ((kont<KontMax && t==Kotxe) || (t==Oinezko && (oz==0 || kont==KontMax || kz>=M)))) 	kotxea[IDK].sartu		  ->	 if((kont<KontMax && t==Kotxe)) then  ZEBRABIDEA[kp+1][op][kz-1][oz][t][kont+1]
	//																																									else  ZEBRABIDEA[kp+1][op][kz-1][oz][Kotxe][0]
	synchronized void sartuK(int zenbakia)  throws InterruptedException {
		while (!(op==0 &&  ((kont<KontMax && t==Kotxe) || (t==Oinezko && (oz==0 || kont==KontMax || kz>=M))))) wait();
		kz--;
		kp++;

		
		pantaila.mugituKotxea(zenbakia,2,oz,kz,op,kp,kont, t);
		if(kont<KontMax && t==Kotxe) {
			kont++;
		}else {
			kont=0;
			t=Oinezko;
		}
		
		notifyAll();
	}

	//							|								oinezkoa[IDP].irten 	  -> 	ZEBRABIDEA[kp][op-1][kz][oz][t][kont]
	synchronized void irtenO(int zenbakia)  throws InterruptedException {
		op--;

		pantaila.mugituOinezkoa(zenbakia,3,oz,kz,op,kp,kont, t);

		notifyAll();
	}

	//				|		   					 kotxea[IDK].irten 	    -> 	ZEBRABIDEA[kp-1][op][kz][oz][t][kont]
	synchronized void irtenK(int zenbakia)  throws InterruptedException {
		kp--;
		pantaila.mugituKotxea(zenbakia,3,oz,kz,op,kp, kont, t);

		notifyAll();
	}


}