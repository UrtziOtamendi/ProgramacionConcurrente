package Adibidea_3;


class Idazlea extends Thread {

	SemaforoBuffer buf; 
	Pantaila pantaila; 
	String alphabet = "abcdefghijklmnopqrstuvwxyz";

	Idazlea(SemaforoBuffer b, Pantaila pant) { 
		
		buf = b; 
		pantaila = pant; 
		
	}

	public void run() {
		try { 
			int ai = 0; 
			while(true) { 
				
				if (Math.random()<0.3) sleep(1000); 
				pantaila.idatzi(alphabet.charAt(ai)+">"); 
				buf.put(alphabet.charAt(ai)); 
				ai=(ai+1)%alphabet.length();
				
			} 
		} catch (InterruptedException e){}

	}

}