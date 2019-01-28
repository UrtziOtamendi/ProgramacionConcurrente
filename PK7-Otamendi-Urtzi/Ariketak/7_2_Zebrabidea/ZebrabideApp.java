package Zebrabidea;




//Urtzi Otamendi Etxabe 
//2017/11/30
public class ZebrabideApp {

	public static void main (String args[]) {
		int maxK = 6;
		int maxO = 6;
		int maxZain = 6;
		int kMax=5;
		
		Kotxea[] kotxea= new Kotxea[maxK];
		Oinezkoa[] oinezkoa= new Oinezkoa[maxO];
        Pantaila p= new Pantaila(maxO, maxK, maxZain);
        BidezkoZebrabide z;
		//z = new Zubia();
		//z = new ZubiSegurua();
		z = new BidezkoZebrabide(maxZain,kMax,p);
		
		
		for (int i = 0; i<maxO; i++) {
        	oinezkoa[i] = new Oinezkoa(z,p,i);
        	oinezkoa[i].start();
        }
		for (int i = 0; i<maxK; i++) {
			kotxea[i] = new Kotxea(z,p,i);
			kotxea[i].start();
        }
        
    }
}
