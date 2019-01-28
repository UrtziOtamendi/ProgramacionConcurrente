package LIFO_A_1;



//LIFO= LIFO[0],
//LIFO[s:KR] =(	
//					| 				
//						



class LIFO {
	private int sartu;
	private Pantaila pantaila;
	private int[]	prozesuak;
	public final int MAX;


	public LIFO( Pantaila pant, int max){
		pantaila=pant;
		MAX=max;
		sartu=0;
		prozesuak = new int[MAX];
		
		for(int i=0; i<prozesuak.length ; i ++){
			prozesuak[i]=-1;
		}
	}

	//  	when(s<KopuruMax)		p[PR].sartu[(s)]			->	 LIFO[(s+1)]
	
	synchronized int sartu(int prozesu) throws InterruptedException {
		while (!(sartu<MAX)) wait();	 //when(s<KopuruMax)
		
		prozesuak[sartu]=prozesu; //Prozesua sartu
		pantaila.sartu(prozesu, sartu);
		sartu++;				  //LIFO[(s+1)]
		
		return sartu;	

	}

// 	p[PR].atera[s-1]		->	 LIFO[(s-1)] 
	synchronized void atera(int prozesu, int a) throws InterruptedException {
		while (prozesuak[(sartu-1)]!=prozesu) wait();	
		pantaila.atera(prozesu, sartu-1);
		prozesuak[sartu-1]=-1; //Libratu
		sartu--; // Balio minimoa 0 izan daiteke
		notifyAll();

	}



}