package Chp1.test;

public class AcessTest {
	public String name;
	protected int age;
	double  height;
	private double weight;
	
	public void nameName(String n){
		name=n;
	}
	protected void setAge(int y){
		age=y;
	}
	void setHeight(double h){
		height=h;
	}
	private void setWeight(double w){
		weight=w;
	}
	public static void main(String[] args){
	AcessTest tt=new AcessTest();
	
	tt.nameName("juju");
	tt.setAge(18);
	tt.setHeight(163.0);
	tt.setWeight(50.2);

	System.out.println(tt.name+"\t"+tt.age+"\t"+tt.height+"\t"+tt.weight);

	}
}
