package Oilategia;


class Oilotegia  {



	//OILOTEGI = OILOTEGI[0][0][0][False], 
	//OILOTEGI[o:OR][a:AR][az:OR][j:J0]

	
	private int o;//o: oilo kop 
	private int a;//a:  arrautza kop
	private Boolean j;//j: josemi oilotegian?
	private int az; // Arrautza jartzeko zain

	private int O; // oilo kop maxim
	private int A; // arrautza kop maxim
	private Pantaila pantaila;

	public Oilotegia(Pantaila p, int oiloMax, int arrautzaMax) {
		O= oiloMax;
		A= arrautzaMax;
		pantaila=p;
		a=0;
		o=0;
		az=0;
		j=false;
	}

//	 when (j == False && o<O && (a+az)<A) 	oilo[ON].sartu 	->	OILOTEGI[o+1][a][az+1][j]
	synchronized void sartuOiloa(int oiloa) throws InterruptedException {
		while (!(j==false && o<O && (a+az)<A)) wait();
		o++;
		az++;
		pantaila.sartuOiloa(oiloa, o, az ,a);
		notifyAll();
	}
	
	
	//	 when (az>0 && a<A)		oilo[ON].utzi	->	print[a+1]	-> OILOTEGI[o][a+1][az-1][j]	
	synchronized void utzi(int oiloa) throws InterruptedException {
		while (!(az>0 && a<A)) wait();
		az--;
		a++;
		pantaila.utzi(oiloa, o, az ,a);
		 notifyAll();
	}
	
	
//	when (o > 0 )	oilo[ON].irten 			->  OILOTEGI[o-1][a][az][j]
	synchronized void irtenOiloa(int oiloa)  throws InterruptedException {
		while (!(o > 0 )) wait();
		o--;
		pantaila.irtenOiloa(oiloa, o, az ,a);
		notifyAll();
	}

	//josemi.begiratu[a]     				->  OILOTEGI[o][a][az][j]
	synchronized int begiratuJosemi()  throws InterruptedException {
		
		pantaila.begiratuJosemi(o, az ,a);
		notifyAll();
		return a;
	}
	
	//josemi.joan							->  OILOTEGI[o][a][az][j]
	synchronized int joanJosemi()  throws InterruptedException {
		
		pantaila.joanJosemi(o, az ,a);
		notifyAll();
		return a;
	}
	
	//| when (o == 0 && a>1)		josemi.sartu		->  OILOTEGI[o][a][az][True]
	synchronized void sartuJosemi()  throws InterruptedException {
		while (!(o == 0 && a>1)) wait();
		j=true;
		pantaila.sartuJosemi(o, az ,a);
		notifyAll();
	}
	
	//when (j == True && a>1) 	josemi.hartu		->	print[a-2]	->  OILOTEGI[o][a-2][az][j]
	synchronized void hartu()  throws InterruptedException {
		while (!(j == true && a>1) ) wait();
		a=a-2;
		pantaila.hartu(o, az ,a);
		notifyAll();
	}
	
	//when (j == True ) 	josemi.irten 	->  OILOTEGI[o][a][az][False]
	synchronized void irtenJosemi( )  throws InterruptedException {
		j=false;
		pantaila.irtenJosemi( o, az ,a);
		notifyAll();
	}
	
	
}