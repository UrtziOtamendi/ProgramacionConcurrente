package Ariketa_2;

class Sukaldaria extends Thread {
	Lapikoa lapiko;
	Sukaldaria(Lapikoa k){
		lapiko = k;
		
	}
	
	//SUKALDARIA = (bete->SUKALDARIA).

	public void run() {
		try { while(true) {
			sleep((long)(Math.random()*1000));
			lapiko.bete();
		}
		} catch (InterruptedException e){}
	}
}