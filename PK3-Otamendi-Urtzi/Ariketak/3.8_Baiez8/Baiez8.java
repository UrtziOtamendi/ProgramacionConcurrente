
public class Baiez8 {

	public static void main (String args[]) {

		Errepidea2 p = new Errepidea2();
		Kotxea2 audi = new Kotxea2("+",1000, p, 20, -100);
		Kotxea2 dacia = new Kotxea2("*",400, p, 20, 100);

		p.kotxe1= audi;
		p.kotxe2= dacia;

		audi.start();
		dacia.start();
	}
}


class Kotxea2 extends Thread {
	private String baiEz;
	private int denbora, kopurua, azelerazioa;
	private Errepidea2 e;
	public Kotxea2(String s, int i,Errepidea2 er, int k, int a){
		baiEz=s; denbora=i; 
		kopurua =k;
		azelerazioa=a;
		e=er;
	}

	public void run() {
		int i;
		for (i=0;i<kopurua;i++) {
			e.margotu();
			try {sleep(denbora);}
			catch (InterruptedException e) {}
			this.eskuinera();
			if(denbora+azelerazioa> 0)
				denbora = denbora+azelerazioa;
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

class Errepidea2 {

	public Kotxea2 kotxe1;
	public Kotxea2 kotxe2;



	public void margotu(){
		
		for(int i=0; i<24; i++){System.out.println();}

		System.out.println(kotxe1.getBaiEz());
		System.out.println(kotxe2.getBaiEz());

	}
}




