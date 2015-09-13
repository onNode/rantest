package Chp1.test;

public class AcessTest4 extends AcessTest{
	
	@Override
	public void nameName(String n){
		name=n+"family";
	}
	

	public static void main(String[] args){
		AcessTest4 et=new AcessTest4();
		et.nameName("xixi");
		et.setAge(19);
		et.setHeight(157.5);
		//et.setWeight(48.6);   not visible
		System.out.println(et.name+"\t"+et.age+"\t"+et.height);
	}
}
