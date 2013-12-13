package string_calculator_TDD;

public class calculator {
	
	public int Add(String str)
	{
		
		if(str.isEmpty())
		{
		return 0;
		}
		else
		{
			return Integer.parseInt(str);
		}
	}

}
