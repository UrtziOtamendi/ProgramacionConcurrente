
import java.util.Random;

public class Txalupa extends Thread {

	private Framea framea;
	private Random r;

	public Txalupa(  Framea f){

		framea=f;

		r= new Random();
	}

	public void run() {
		try {sleep(1000);
		while(true) {
			int x= framea.panela.getTxalupaX();
			int y= framea.panela.getTxalupaY();
			int rx = (r.nextInt((600)  ))+1;
			int ry = (r.nextInt((600)  ))+1;
			if(x>rx) {
				for (int i=x;i>ry;i--) {
					framea.panela.setTxalupaX(i);
					if(y>ry) {
						y--;
						framea.panela.setTxalupaY(y);
					}else {
						y++;
						framea.panela.setTxalupaY(y);
					}
					sleep(50);

				}
			}else {
				for (int i=x;i<rx;i++) {
					framea.panela.setTxalupaX(i);
					if(y>ry) {
						y--;
						framea.panela.setTxalupaY(y);
					}else {
						y++;
						framea.panela.setTxalupaY(y);
					}
					sleep(50);
				}
			}
		}
		}
		catch (InterruptedException e) {}


	}
}
