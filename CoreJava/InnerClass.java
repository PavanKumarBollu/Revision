class OuterClass
{
	public void dis()
	{
		System.out.println("Outer Class Dispaly Method \nTo Prove that Class Can Have both Methods and Inner Classes");
	}
	class InnerClass
	{
		public void childDis()
		{
			System.out.println("RegulerInnerClass ChildDisplay method ::" +  this.getClass().getName());
			
		}
	}
}



class InnerClass 
{
	public static void main(String[] args) 
	{
		// OuterClass Object Creation
		OuterClass outerClass = new OuterClass();
		outerClass.dis();
	}
}
