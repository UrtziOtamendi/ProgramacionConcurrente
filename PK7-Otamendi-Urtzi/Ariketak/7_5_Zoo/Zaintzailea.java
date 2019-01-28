package Zoo;


class Zaintzailea extends Thread {
	Jangela jangela;
	

	


	public Zaintzailea(Jangela z) {

		
		jangela = z;
	}
	public void run() {

		try {
			while(true) {
				//ZAINDARIA  =( sartu -> bete -> irten -> ZAINDARIA).
				sleep((long)(Math.random()*1000));
				jangela.sartu();
				sleep((long)(Math.random()*1000));
				jangela.bete();
				sleep((long)(Math.random()*1000));
				jangela.irten();
				
				
				
			}
		} catch (InterruptedException e){}
	}
}