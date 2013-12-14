package string_calculator_TDD;

public class calculator {

	public int Add(String str)
	{

		if(str.isEmpty())
		{
			return 0;
		}
		
		String arg = "[,\n]+";
		String[] numbers=str.split(arg);
		
		int i=0;
		int sum=0;
		char c;
		try
		{
		Integer.parseInt(numbers[0]);
		}
		catch(NumberFormatException e)
		{
			c=numbers[0].charAt(2);
			str=str.replace(c, ',');
			numbers=str.split("[,\n]+");
			i=1;
			
		}
		
		
		
		for( ; i<numbers.length ; i++)
		{
			sum=sum+Integer.parseInt(numbers[i]);
		}
		
		return sum;
		

	}

}
