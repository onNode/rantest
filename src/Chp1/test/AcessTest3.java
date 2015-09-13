package Chp1.test;

public class AcessTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessTest bt=new AcessTest();
		
		bt.nameName("kaka");
		bt.setAge(18);
		bt.setHeight(175.0);
		//bt.setWeight(70.3);  not visible
		
		System.out.println(bt.name+"\t"+bt.age+"\t"+bt.height+"\t"); //+bt.weight);

	}

}
