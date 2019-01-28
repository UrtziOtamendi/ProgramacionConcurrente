class BaiEz2App{
	public static void main (String args[]) {
		Bai2Idazlea bai = new Bai2Idazlea();
		Ez2Idazlea ez = new Ez2Idazlea();
		bai.start();
		ez.start();
	}
}


class Bai2Idazlea extends Thread {
	public void run() {
		int i;
		for (i=0;i<4;i++) {
			System.out.println("bai2");
			try {sleep(1000);}
			catch (InterruptedException e) {}
		}
	}
}
class Ez2Idazlea extends Thread {
	public void run() {
		int i;
		for (i=0;i<20;i++) {
			System.out.println("ez");
			try {sleep(400);}
			catch (InterruptedException e) {}
		}
	}
}