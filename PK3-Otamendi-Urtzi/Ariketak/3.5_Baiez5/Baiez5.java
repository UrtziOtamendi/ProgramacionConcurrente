
class BaiEz5App{
	public static void main (String args[]) {
		Pantaila2 p = new Pantaila2();
		Idazlea5 bai = new Idazlea5("bai",1000,4,p);
		Idazlea5 ez = new Idazlea5("\tez",400,15,p);
		Idazlea5 agian = new Idazlea5("\t\tagian",500,10,p);
		bai.start();
		ez.start();
		agian.start();

	}
}

class Idazlea5 extends Thread {
	private String baiEz;
	private int denbora, kopurua;
	private Pantaila2 p;
	public Idazlea5(String s, int i, int j, Pantaila2 pant){
		baiEz=s; denbora=i; kopurua=j;
		p=pant;
	}
	public void run() {
		int i;
		for (i=0;i<kopurua;i++) {
			p.margotu(baiEz);
			try {sleep(denbora);}
			catch (InterruptedException e) {}
		}
		p.margotu(baiEz+" bukatu da");
	}
}
class Pantaila2 {
	public void margotu(String s){
		System.out.println(s);
	}
}

