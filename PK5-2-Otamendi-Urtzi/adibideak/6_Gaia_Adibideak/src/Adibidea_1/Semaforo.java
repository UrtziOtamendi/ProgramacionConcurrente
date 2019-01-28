package Adibidea_1;

public class Semaforo {
	private int balioa;
	private Pantaila pant;
	public Semaforo (int hasierakoa, Pantaila p ){
		balioa = hasierakoa;
		pant=p;
		
	}
	
	
	synchronized public void gora(int id) {
		++balioa;
		pant.mutex(1,id);
		notify();
	}
	
	synchronized public void behera(int id)
			throws InterruptedException {
		while (!(balioa>0)) wait();
		pant.mutex(0, id);
		--balioa;
		
	}
}