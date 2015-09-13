package Pack.another;

import Chp1.test.AcessTest;

public class AcessTest5  extends AcessTest{

	@Override
	public void nameName(String n){
		name=n+"family";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessTest5 ft=new AcessTest5();
		ft.nameName("lili");
		ft.setAge(19);
		//ft.setHeight(177.5);  not visible
		//et.setWeight(68.6);   not visible
		System.out.println(ft.name+"\t"+ft.age+"\t");	

	}

}
