

class BaiEz6App{
	public static void main (String args[]) {
		Pantaila6 p = new Pantaila6();
		Idazlea6 bai = new Idazlea6("bai",400,50,10,p);
		Idazlea6 ez = new Idazlea6("\tez",1000,-100, 15,p);
		bai.start();
		ez.start();
	}
}

class Idazlea6 extends Thread {
	private String baiEz;
	private int denbora, kopurua,a;
	private Pantaila6 p;
	public Idazlea6(String s, int i,int azelerazioa, int j,  Pantaila6 pant){
		baiEz=s; denbora=i; kopurua=j; a= azelerazioa;
		p=pant;
	}
	
	public void run() {
		int i;
		for (i=0;i<kopurua;i++) {
			p.margotu(baiEz);
			
			try {sleep(denbora);}
			catch (InterruptedException e) {}
			if(denbora+a> 0)
			denbora = denbora+a;
		}
		p.margotu(baiEz+" bukatu da");
	}
}
class Pantaila6 {
	public void margotu(String s){
		System.out.println(s);
	}
}

