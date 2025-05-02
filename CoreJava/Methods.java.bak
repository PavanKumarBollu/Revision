class Parent
{
	public static void m1(Object obj)
	{
		System.out.println("Parent Method Got Called By The Reference :: " + obj.getClass().getName());

	}

}
class Child extends Parent
{
	public static void m1(Object obj)
	{
		System.out.println("Child Method Got Called By The Reference :: " + obj.getClass().getName());
	}
}

class Methods 
{
	public static void main(String[] args) 
	{
		Parent p1 = new Parent();
		p1.m1(p1);//Parenet 
	}
}
