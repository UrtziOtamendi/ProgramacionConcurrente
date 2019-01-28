package Adibidea_3;


public class BufferApp {

	public static final int Buffer = 5;

	public static void main (String args[]) { 
		
	
		Pantaila p = new Pantaila();
		SemaforoBuffer b = new SemaforoBuffer(Buffer, p);
		Idazlea id = new Idazlea(b,p);
		Irakurlea ir = new Irakurlea(b,p);
		
		id.start();
		ir.start();
	}
	
}
