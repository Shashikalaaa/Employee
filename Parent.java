package Shashikala;
class Demo1
{
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
class Parent extends Demo1
{
	public static void main(String[] args) {
		Parent bb = new Parent();		
   bb.setA(8);
 int ss=  bb.getA();
 System.out.println(ss);
	}
}
