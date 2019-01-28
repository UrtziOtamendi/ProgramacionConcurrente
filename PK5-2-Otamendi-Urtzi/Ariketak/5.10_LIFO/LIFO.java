package Ariketa_10;



//LIFO= LIFO[0],
//LIFO[s:KR] =(	
//					| 				
//						



class LIFO {
	private int s;
	private Pantaila pantaila;
	private int[]	prozesuak;
	public final int MAX;


	public LIFO( Pantaila pant, int max){
		pantaila=pant;
		MAX=max;
		s=0;
		prozesuak = new int[MAX];
		
		for(int i=0; i<prozesuak.length ; i ++){
			prozesuak[i]=-1;
		}
	}

	//  	when(s<KopuruMax)		p[PR].sartu[(s)]			->	 LIFO[(s+1)]
	
	synchronized int sartu(int prozesu) throws InterruptedException {
		while (!(s<MAX)) wait();	 //when(s<KopuruMax)
		int sartu= s;
		prozesuak[s]=prozesu; //Prozesua sartu
		pantaila.sartu(prozesu, s);
		s++;				  //LIFO[(s+1)]
		
		return sartu;	

	}

// 	p[PR].atera[s-1]		->	 LIFO[(s-1)] 
	synchronized void atera(int prozesu, int a) throws InterruptedException {
		while (!(prozesuak[(s-1)]==prozesu)) wait();	
		pantaila.atera(prozesu, s-1);
		prozesuak[s-1]=-1; //Libratu
		s--; // Balio minimoa 0 izan daiteke
		notifyAll();

	}



}