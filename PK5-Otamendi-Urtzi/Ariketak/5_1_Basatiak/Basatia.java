package Ariketa_1;

class Basatia extends Thread {
	Lapikoa lapikoa;
	Pantaila pantaila;
	
	int basatia;

	public Basatia(Lapikoa k,int b, Pantaila p){
		lapikoa = k;
		basatia=b;
		pantaila=p;
	}
	
	//BASATIA = (hartu->jan->lo->BASATIA).
	public void run() {
		try {
			while(true) {
				sleep((long)(Math.random()*1000));
				lapikoa.hartu(basatia);
				sleep((long)(Math.random()*1000));
				pantaila.jan(basatia);
				sleep((long)(Math.random()*1000));
				pantaila.lo(basatia);
					
			}
		}catch (InterruptedException e){}
	}
}