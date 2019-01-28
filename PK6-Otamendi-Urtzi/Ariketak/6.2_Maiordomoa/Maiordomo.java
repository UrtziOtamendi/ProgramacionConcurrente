package Ariketa_2;

public class Maiordomo extends Thread {

	
	private int n;
	private int max=5;
	private Pantaila pant;
	
	
	Maiordomo(Pantaila p){
		
		pant=p; 
		n=0;
	}
	
//	MAIOR = MAIOR[0],
//			MAIOR[n:MR] = 

//							).
			//( when(n<Max-1)	eseri 	 -> 	MAIOR[n+1]
	public synchronized void eseri(int  z) throws InterruptedException {
		while(!(n<(max-1))) {
			wait();
		}
		n++;
		pant.idatziM(z," eseri",n);
	}
	
//	|				altxatu	->	 MAIOR[n-1]
	public synchronized void altxatu(int z) throws java.lang.InterruptedException {
		
		n--;
		pant.idatziM(z," altxa ",n);
	}
	
	
	
}
