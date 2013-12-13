package string_calculator_TDD;

public class calculator {

	public int Add(String str)
	{

		if(str.isEmpty())
		{
			return 0;
		}

		
		
		String[] numbers=str.split(",");
		
		return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);

	}

}
