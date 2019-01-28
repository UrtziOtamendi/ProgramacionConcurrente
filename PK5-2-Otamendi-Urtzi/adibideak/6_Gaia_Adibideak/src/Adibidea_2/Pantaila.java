package Adibidea_2;



public class Pantaila {

	public Pantaila() { 
		
	} 
	
	
	
	synchronized public void idatzi(String t) { 
		
		System.out.println(t); 
		
	} 
	
	synchronized public void irakurri(String t) { 
		
		System.out.println("\t\t\t"+t); 
		
	} 
	
	synchronized public void erakutsi(char[] buf) { 
		
		System.out.print("\t|");
		for(int i=0; i<BufferApp.Buffer; i++){
			System.out.print(buf[i]+"|");
		}
		System.out.println("");
		
	} 
	
	
	
	
}
