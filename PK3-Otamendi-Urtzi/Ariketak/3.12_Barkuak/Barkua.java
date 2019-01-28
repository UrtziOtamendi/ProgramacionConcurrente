import java.util.Random;

public class Barkua extends Thread {

	private Framea framea;
	private Random r;

	public Barkua(  Framea f){

		framea=f;

		r= new Random();
	}

	public void run() {
		try {sleep(1000);
		while(true) {


			int x= framea.panela.getBarkuaX();
			int y= framea.panela.getBarkuaY();
			int rx = (r.nextInt((600)  ))+1;
			int ry = (r.nextInt((600)  ))+1;
			if(x>rx) {
				for (int i=x;i>ry;i--) {
					framea.panela.setBarkuaX(i);
					if(y>ry) {
						y--;
						framea.panela.setBarkuaY(y);
					}else {
						y++;
						framea.panela.setBarkuaY(y);
					}
					sleep(50);

				}
			}else {
				for (int i=x;i<rx;i++) {
					framea.panela.setBarkuaX(i);
					if(y>ry) {
						y--;
						framea.panela.setBarkuaY(y);
					}else {
						y++;
						framea.panela.setBarkuaY(y);
					}
					sleep(50);
				}
			}
		}
		}
		catch (InterruptedException e) {}


	}
}