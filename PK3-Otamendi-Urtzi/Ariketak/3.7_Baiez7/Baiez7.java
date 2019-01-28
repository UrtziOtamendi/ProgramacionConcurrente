

class BaiEz7App{
	public static void main (String args[]) {
		
		Errepidea p = new Errepidea();
		Kotxea audi = new Kotxea("+",1000, p, 20);
		Kotxea dacia = new Kotxea("*",400, p, 20);
		
		p.kotxe1= audi;
		p.kotxe2= dacia;

		audi.start();
		dacia.start();
	}
}

class Kotxea extends Thread {
	private String baiEz;
	private int denbora, kopurua;
	private Errepidea e;
	public Kotxea(String s, int i,Errepidea er, int k){
		baiEz=s; denbora=i; 
		kopurua =k;
		e=er;
	}
	
	public void run() {
		int i;
		for (i=0;i<kopurua;i++) {
			e.margotu();
			try {sleep(denbora);}
			catch (InterruptedException e) {}
			this.eskuinera();
		}
		e.margotu();
	}
	
	public void eskuinera(){
		baiEz = " "+baiEz;
	}
	
	public String getBaiEz(){
		return baiEz;
	}
}
class Errepidea {
	
	

	public Kotxea kotxe1;
	public Kotxea kotxe2;
	

	
	public void margotu(){
		
		for(int i=0; i<24; i++){System.out.println();}
		
		System.out.println(kotxe1.getBaiEz());
		System.out.println(kotxe2.getBaiEz());

	}
}

