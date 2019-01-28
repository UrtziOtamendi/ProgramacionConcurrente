
import java.awt.Color;

public class BarkuAnimatuak  {
	
	public static void main (String args[]) {
	
		Framea framea = new Framea();
		framea.getContentPane().setBackground(Color.GRAY);
		framea.setVisible(true);
		Barkua b = new Barkua( framea);
		Txalupa t= new Txalupa(framea);
		
		b.start();
		t.start();
	}
}



