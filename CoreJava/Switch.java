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
		System.out.println("Example Three ");
		enum direction {NORTH, SOUTH, EAST,WEST};
		direction dir =	direction.NORTH;
		switch(dir)
		{
			case NORTH:
				System.out.println("North");
				break;
			case SOUTH:
				System.out.println("SOUTH");
				break;
			case EAST:
				System.out.println("EAST");
				break;
			case WEST:
				System.out.println("West");
				break;
			default:
				System.out.println("Default");
				break;

		}
		System.out.println("Example Four ");
		int day = 2;
		switch(day)
		{
			case 1:
			case 2:
			case 3:
				System.out.println("3 Cases are Groupped Together");
				break;
			default:
				System.out.println("Default Case");
				break;
		}

		System.out.println("Switch Five");
		switch("pavan")
		{
			case "pavan" -> System.out.println("Switch Expression ");
			default->	System.out.println("Default Case");
		}


		System.out.println("Example Six");
		int age = 19;
		String result = switch(age)
		{
			case 19 -> "Pavan Kumar Bollu";
			case 20 -> "Pavan Kumar Yadav";
			case 21 -> "Bollu Pavan Kumar";
		}

		System.out.println("Value Which Switch Returened is " + result );

	}
}
