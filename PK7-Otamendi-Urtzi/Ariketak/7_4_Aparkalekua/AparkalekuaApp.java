package Aparkalekua;



public class AparkalekuaApp {

	final static  int KMax= 8;
	final static  int MMax= 8;
	final static  int SMax= 4;
	final static  int K= 1;
	final static  int M= 0;
	final static  int Max= 6;
	final static  int PMax= 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Kotxea[] kotxeak= new Kotxea[KMax];
		Motoa[] motoak= new Motoa[MMax];
      
		Pantaila p= new Pantaila();
        Aparkalekua ap= new Aparkalekua(p);
		
		
		for (int i = 0; i<KMax; i++) {
			kotxeak[i] = new Kotxea(i,ap);
			kotxeak[i].start();
        }
		
		for (int i = 0; i<MMax; i++) {
			motoak[i] = new Motoa(i,ap);
			motoak[i].start();
        }
        
	}

}
