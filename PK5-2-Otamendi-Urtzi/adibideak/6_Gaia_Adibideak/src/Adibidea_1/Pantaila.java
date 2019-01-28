package Adibidea_1;

public class Pantaila {

	private String tab;
	private String marra;
	public Pantaila(){
		tab="";
		for(int i=1; i<=SemaforoDemo.MAX;i++){
			tab=tab+i+"";
			tab = tab +"\t";

		}
		marra="";
		
		for(int i=1; i<=(tab.length()*(4));i++){
			marra=marra+"_";
		}
		System.out.println(tab);
		System.out.println(marra);
		
	}
	
	public void ekintza (String tartea, String ikurra){
		System.out.println(tartea+ikurra);
	}
	
	public void mutex (int i,int id){
		
		System.out.println(marra+"MUTEX= "+i +" ID : "+ id);
		
	}
}
