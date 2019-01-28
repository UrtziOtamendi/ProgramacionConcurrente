package Adibidea_2;


class Irakurlea extends Thread {

	Buffer buf; 
	Pantaila pantaila; 
	String alphabet = "abcdefghijklmnopqrstuvwxyz";

	Irakurlea(Buffer b, Pantaila pant) { 
		
		buf = b; 
		pantaila = pant; 
		
	}

	public void run() {
		try { 
			int ai = 0; 
			while(true) { 
				
				if (Math.random()<0.3) sleep(1000); 
				char c = buf.get(); 
				pantaila.irakurri(">"+c); 
				ai=(ai+1)%alphabet.length();
				
			}
		} catch (InterruptedException e){}

	}

}
