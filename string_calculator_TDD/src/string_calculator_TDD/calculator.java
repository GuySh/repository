package string_calculator_TDD;

public class calculator {

	public int Add(String str)
	{

		if(str.isEmpty())
		{
			return 0;
		}
		
		
		String[] numbers=str.split(",");
		
		int i;
		int sum=0;
		for(i=0 ; i<numbers.length ; i++)
		{
			sum=sum+Integer.parseInt(numbers[i]);
		}
		
		return sum;
		

	}

}
