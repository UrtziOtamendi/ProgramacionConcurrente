package Ariketa_9;


class FIFO {
	private int s;
	private int a;
	private int k;
	private Pantaila pantaila;
	private int[]	prozesuak;
	public final int MAX;


	// s zein posiziotan sartu behar den
	// a zein posiziotik atera
	// k prozesuak martxan

	//FIFO= FIFO[0][0][0],
	//FIFO[s:PKR][a:PKR][k:KR]

	public FIFO( Pantaila pant, int max){
		pantaila=pant;
		MAX=max; 	
		s=0; //Non sartu behar
		a=0; //Nondik atera behar
		k=0;
		prozesuak = new int[MAX]; //range PKR= 0..(KopuruMax-1)

		for(int i=0; i<prozesuak.length ; i ++){ //range KR = 0..KopuruMax

			prozesuak[i]=0;
		}
	}

	//(when(k<KopuruMax)	p[PR].sartu[s]		->		print[s]	->	 FIFO[(s+1)%KopuruMax][a][k+1]
	synchronized int sartu(int prozesu) throws InterruptedException {
		while (!(k<MAX)) wait(); 

		int sartu=s;
		prozesuak[s]=1; //Prozesua okupatu

		pantaila.sartu(prozesu, s, prozesuak);
		s=((s+1)%MAX);
		k++;

		notifyAll();
		return sartu;	

	}

	//p[PR].atera[a]		->		print[a]	->	 FIFO[s][(a+1)%KopuruMax][k-1]
	synchronized void atera(int prozesu, int atera) throws InterruptedException {
		while (!(atera==a)) wait(); //Txanda zain egon
		prozesuak[a]=0;
		pantaila.atera(prozesu, a, prozesuak);
		a=((a+1)%MAX); //FIFO[s][(a+1)%KopuruMax][k-1]
		k--;
		notifyAll();
	

	}



}