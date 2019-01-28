package Ariketa_1;

class Kontagailua {
	String izarrak="";
	int zenb=0;
	String zuriunea="";
	
	
	Kontagailua() {
		for(int n=1; n<=(2*LorategiaApp.MAX); n++){
			zuriunea=zuriunea+" ";
		}
		System.out.println("\t\t"+"["+izarrak+zuriunea+"]");
	}
	synchronized void gehitu() {
		String lag;
		lag=izarrak; //balioa irakurri
		Simulatu.HWinterrupt();
		izarrak=lag+"*"; //balioa idatzi
		zenb ++;
		zuriunea="";
		for(int n=1; n<=((LorategiaApp.MAX*2)-zenb); n++){
			zuriunea=zuriunea+" ";
		}
		System.out.println("\t\t"+"["+izarrak+zuriunea+"]");
	}
}