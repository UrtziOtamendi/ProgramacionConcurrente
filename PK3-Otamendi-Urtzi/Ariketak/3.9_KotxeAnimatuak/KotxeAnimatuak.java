package KotxeAnimatuak;

public class KotxeAnimatuak  {
	
	public static void main (String args[]) {
	
		Framea framea = new Framea();
		framea.setVisible(true);
		
		Kotxea k1 = new Kotxea(1, 500, -1, framea);
		Kotxea k2 = new Kotxea(2, 50, 1,framea);
						
		k1.start();
		k2.start();
	}
}



