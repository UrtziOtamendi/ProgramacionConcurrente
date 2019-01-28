package Oilategia;


//Urtzi Otamendi Etxabe 
//2017/11/30
public class OilotegiaApp {

	public static void main (String args[]) {
		int maxO = 5;
		int maxA = 6;
		int oiloKop=8;
		
		Oiloa[] oiloak= new Oiloa[oiloKop];
        Pantaila p= new Pantaila(oiloKop,maxO, maxA);
        Oilotegia o= new Oilotegia(p, maxO, maxA);
		Josemi josemi = new Josemi(o);
		josemi.start();
		
		for (int i = 0; i<oiloKop; i++) {
			oiloak[i] = new Oiloa(o,i);
			oiloak[i].start();
        }
        
    }
}
