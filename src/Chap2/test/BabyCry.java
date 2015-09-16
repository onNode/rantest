package Chap2.test;

public class BabyCry {
	public void cryReason(){
		System.out.println("the reason why baby cry");
	}
	public void resolveMethod(){
		System.out.println("depend on the cry reason");
	}
}

class HangryCry extends BabyCry{
	public void cryReason(){
		System.out.println("the reason why baby cry is hangry");
	}
	//override
	public void resolveMethod(){
		//super.resolveMethod();
		System.out.println("feed the baby with some milk or other food");
	}
	//overloaded
	public void resolveMethod(String s){
		//super.resolveMethod();
		System.out.println("feed the baby with"+s);
	}
}