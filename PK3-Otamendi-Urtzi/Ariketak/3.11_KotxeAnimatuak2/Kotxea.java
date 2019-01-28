package KotxeAnimatuak2;

public class Kotxea extends Thread {
	private int kotxea;
	private int abiadura;
	private int denbora;
	private int azelerazioa;
	private Framea framea;

	public Kotxea(int kotx, int abiad, int az,  Framea f){
		kotxea=kotx;
		abiadura=abiad;
		framea=f;
		azelerazioa=az;
	}

	public void run() {
		try {sleep(1000);}
		catch (InterruptedException e) {}
		for (int x=0;x<540;x++) {
			framea.panela.setX(kotxea,x);

			denbora=(int)(1000/abiadura);
			try {
				sleep(denbora);
				if((abiadura - azelerazioa)>30)
					abiadura= abiadura +azelerazioa;
			}
			catch (InterruptedException e) {}

		}
		System.out.println(" Bukatuta ("+kotxea+")");
	}
}