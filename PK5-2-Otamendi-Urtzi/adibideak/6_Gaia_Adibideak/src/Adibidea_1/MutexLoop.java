package Adibidea_1;

class MutexLoop extends Thread {
	int id;
	Semaforo mutex;
	String tartea;
	int luze;
	Pantaila pantaila;
	
	public MutexLoop (int i, Semaforo sema, int zenbat, String tabul, Pantaila p){
		id=i; mutex=sema; luze=zenbat; tartea=tabul; pantaila= p;
	}
	public void run(){
		try {while(true) {
			for (int i=1;i<=6;i++) ekintza("|"); // Ekintza ez kritikoa
			mutex.behera(id); // Eskuratu elkar-bazterk
			for (int i=1;i<=luze;i++) ekintza("*"); // Ekintza kritikoa
			mutex.gora(id); // Askatu elkar-bazterk
		}
		} catch(InterruptedException e){}
	}
	void ekintza(String ikurra) {
		try {
			pantaila.ekintza(tartea,ikurra);
			sleep((int)(Math.random()*1000));
		}catch (InterruptedException e) {}
	}
}