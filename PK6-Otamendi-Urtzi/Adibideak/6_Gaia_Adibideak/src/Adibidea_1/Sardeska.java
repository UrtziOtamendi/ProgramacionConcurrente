package Adibidea_1;

class Sardeska {
	private boolean hartua=false;
	private int zenbakia;
	private Pantaila pant;
	Sardeska(int zenb, Pantaila p){
		zenbakia = zenb; pant=p; }
	public synchronized void put() {
		hartua=false;
		pant.idatzi(-1,zenbakia+" utzia ");
		notify();
	}
	//when (h==0) get->SARD[1]
	public synchronized void get() throws java.lang.InterruptedException {
		while (hartua) wait();
		hartua=true;
		pant.idatzi(-1,zenbakia+" hartua");
	}
}