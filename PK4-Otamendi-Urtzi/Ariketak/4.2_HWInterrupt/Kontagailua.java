package Ariketa_2;

class Kontagailua {
	int izarrak=0;
	String zuriunea="";
	
	
	Kontagailua() {
		for(int n=1; n<=(2*LorategiaApp.MAX); n++){
			zuriunea=zuriunea+" ";
		}
		System.out.println("\t\t"+"["+zuriunea+"]");
	}
	synchronized void gehitu() {
		izarrak++;
		zuriunea="";
		for(int n=1; n<=((LorategiaApp.MAX*2)-izarrak); n++){
			zuriunea=zuriunea+" ";
		}
		System.out.print("\t\t"+"[");
		for(int i=0; i<izarrak; i++) {
			Simulatu.HWinterrupt();
			System.out.print("*");

		}
		System.out.println(zuriunea +"]");
	}
}