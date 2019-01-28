
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;


import java.awt.Color;
import java.awt.Dimension;
// Timer Imports
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class Panela extends JPanel implements ActionListener {
    private Image txalupa,barkua;
    private Timer timer;
    private int x1, x2,x3, y1=40, y2=80, y3=120;

	
	
    public Panela(){
    	ImageIcon ii = new ImageIcon(this.getClass().getResource("Barkua.png"));
        barkua = ii.getImage();
    	ImageIcon ii2 = new ImageIcon(this.getClass().getResource("Txalupa.png"));
        txalupa = ii2.getImage();
     
        this.setBackground(Color.black);
        timer = new Timer(1, this); // 15ms-ro actionPerformed metodoari deitzen dio
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);
        Dimension tamaña = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("Ura.PNG"));
        g.drawImage(imagenFondo.getImage(),0,0,tamaña.width, tamaña.height, null);
        setOpaque(false);
        g.drawImage(barkua, x1 , y1, this);
        g.drawImage(txalupa, x2 , y2, this);
    }

    public void setBarkuaX(int x) {
    	x1=x;
    }
    
    public int getBarkuaX() {
    	return x1;
    }
    
    public void setBarkuaY(int y) {
    	y1=y;
    }
    
    public int getBarkuaY() {
    	return y1;
    }
    
    public void setTxalupaX(int x) {
    	x2=x;
    }
    
    public int getTxalupaX() {
    	return x2;
    }
    public void setTxalupaY(int y) {
    	y2=y;
    }
    public int getTxalupaY() {
    	return y2;
    }
    
    
    public void actionPerformed(ActionEvent e){ 
        repaint(); // panela bir-margotu (re-paint)
    }
}