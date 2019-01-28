package Zoo;


//Urtzi Otamendi Etxabe 
//2017/11/30
public class ZooApp {

	static final int Max=10;
	static final int LKop=5;
	public static void main (String args[]) {
		
		Lehoia[] lehoiak= new Lehoia[LKop];
        Pantaila p= new Pantaila();
        Jangela o= new Jangela(p);
		Zaintzailea z = new Zaintzailea(o);
		z.start();
		
		for (int i = 0; i<LKop; i++) {
			lehoiak[i] = new Lehoia(o,i);
			lehoiak[i].start();
        }
        
    }
}
