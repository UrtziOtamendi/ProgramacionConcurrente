package Ariketa3;

class Kontagailua {
	int izarrak=0;
	int zenb=0;
	Pantaila pant;
	
	
	Kontagailua(Pantaila p) {
		pant=p;
		pant.margotuKont();
	}
	
	
	synchronized void gehitu() {
		izarrak++;
		pant.gehitu( izarrak);
	}
}