package Ariketa3;

import Ariketa_2.Simulatu;

public class Pantaila {

	String zuriunea;
	
	public Pantaila() {
		
	zuriunea=""; 
	}


	synchronized public void margotuAtea(String k, int i, int izarrak) {

		zuriunea="";
		for(int n=1; n<=(LorategiaApp.MAX-i); n++){
			zuriunea=zuriunea+" ";
		}
		//Simulatu.HWinterrupt();
		System.out.print(k+"[");
		
		for(int z=0 ; z<izarrak ; z++) {

			Simulatu.HWinterrupt();
			System.out.print("*");
			
		}
		System.out.println(zuriunea+"]");

		
	}
	synchronized public void margotuKont() {
		zuriunea="";
		for(int n=1; n<=(2*LorategiaApp.MAX); n++){
			zuriunea=zuriunea+" ";
		}
		System.out.println("\t\t"+"["+""+zuriunea+"]");
	}
	synchronized public void gehitu(int izar) {
		
		String zuriune="";
		for(int n=1; n<=((LorategiaApp.MAX*2)-izar); n++){
			zuriune=zuriune+" ";
		}
		
		System.out.print("\t\t"+"[");
		for(int z=0 ; z<izar ; z++) {

			Simulatu.HWinterrupt();
			System.out.print("*");
			
		}
		System.out.println(zuriune+"]");
	}

}
