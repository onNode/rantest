package Pack.another;

import Chp1.test.AcessTest;

public class AccessTest2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessTest ct=new AcessTest();
		ct.nameName("alpha");
		//ct.setAge(18);   not visible 
		//ct.setHeight(180.5);  not visible too
		//ct.setWeight(80.3);   not visible too
		System.out.println(ct.name);		

	}
	

}
