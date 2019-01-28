
import java.awt.BorderLayout;

import javax.swing.*;

public class Framea extends JFrame {

	Panela panela = new Panela();
	
	public Framea() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		
		this.setTitle("Barkuak");
		this.add(panela);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.add( panela , BorderLayout.CENTER);
		panela.repaint(); 
	}
}

