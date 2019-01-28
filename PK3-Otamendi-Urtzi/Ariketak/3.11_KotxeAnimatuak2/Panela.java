package KotxeAnimatuak2;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;


import java.awt.Color;
// Timer Imports
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class Panela extends JPanel implements ActionListener {
    private Image image1,image2,image3;
    private Timer timer;
    private int x1, x2,x3, y1=40, y2=80, y3=120;

	public void setX(int kotxea, int balioa){
		if (kotxea==1)	{x1=balioa;}
		else if(kotxea==2)			{x2=balioa;}
		else    {x3=balioa;}
	}
	
    public Panela(){
    	ImageIcon ii = new ImageIcon(this.getClass().getResource("kotxe1.png"));
        image1 = ii.getImage();
    	ImageIcon ii2 = new ImageIcon(this.getClass().getResource("kotxe2.png"));
        image2 = ii2.getImage();
        ImageIcon ii3 = new ImageIcon(this.getClass().getResource("kotxe3.png"));
        image3 = ii3.getImage();
        this.setBackground(Color.black);
       
        timer = new Timer(15, this); // 15ms-ro actionPerformed metodoari deitzen dio
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(image1, x1 , y1, this);
        g.drawImage(image2, x2 , y2, this);
        g.drawImage(image3, x3 , y3, this);
    }

    public void actionPerformed(ActionEvent e){ 
        repaint(); // panela bir-margotu (re-paint)
    }
}