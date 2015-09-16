package Chap2.test;

public class polytest {
	public static void main(String[] args){
		BabyCry bbc = new  BabyCry();
		BabyCry bhc = new HangryCry();
		//HangryCry hbc = new BabyCry();
		HangryCry hhc= new HangryCry();
		bbc.cryReason();
		bhc.cryReason();  //the polymorphism ?
		hhc.cryReason();
		
		bbc.resolveMethod();
		bhc.resolveMethod();
		hhc.resolveMethod();
		
		hhc.resolveMethod("milk");

		
	
	}

}
