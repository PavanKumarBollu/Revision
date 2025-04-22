class  Switch
{
	public static void main(String[] args) 
	{

		System.out.println("Example One ");
		int num = 2;
		switch(num)
		{
			case 1:
				System.out.println("Case-1");
				break;
			case 2:
				System.out.println("Case-2");
				break;
			case 3:
				System.out.println("Case-3");
				break;
			default:
				System.out.println("Default");
				break;
		}
		
		System.out.println("Example Two ");

		switch("Pavan")
		{
			case "Pavan":
				System.out.println("Pavan");
				break;
			default:
				System.out.println("Default");
				break;
		}
	}
}
