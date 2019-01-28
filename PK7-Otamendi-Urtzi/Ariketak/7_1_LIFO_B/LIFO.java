package LIFO_B_1;



//LIFO= LIFO[0][SartuMax],
//LIFO[s:KR][k:SR] =(
//							
//						



class LIFO {
	private int s;
	private Pantaila pantaila;
	private int[]	prozesuak;
	public final int KopuruMax;
	
	public int k;


	public LIFO( Pantaila pant, int max, int sartuMax){
		pantaila=pant;
		KopuruMax=max;
		s=0;
		k=sartuMax;
		prozesuak = new int[KopuruMax];
		
		for(int i=0; i<prozesuak.length ; i ++){
			prozesuak[i]=-1;
		}
	}

	//when(s<KopuruMax && k>0)		p[PR].sartu[s]		->	  LIFO[(s+1)][k-1]
	
	synchronized int sartu(int prozesu) throws InterruptedException {
		while (!(s<KopuruMax &&  k>0)) wait();	 //when(s<KopuruMax)
		
		prozesuak[s]=prozesu; //Prozesua sartu
		pantaila.sartu(prozesu, s, k);
		k--;
		s++;				  //LIFO[(s+1)]
		
		return s;	

	}

//	|when(s>0 )  					p[PR].atera[s-1]	->	 if( s == 1) then LIFO[(s-1)][SartuMax] else LIFO[(s-1)][k] 
	synchronized void atera(int prozesu, int a) throws InterruptedException {
		while (prozesuak[(s-1)]!=prozesu) wait();	
		pantaila.atera(prozesu, s-1, k);
		prozesuak[s-1]=-1; //Libratu
		if(s==1) k=LIFOApp.sartuMax;
		s--; // Balio minimoa 0 izan daiteke
		notifyAll();

	}



}