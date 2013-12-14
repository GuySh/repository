package string_calculator_TDD;

public class calculator {

	public int Add(String str) throws Exception
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
			numbers=str.split(arg);
			i=1;
			
		}
		
		
		
		for(  ; i<numbers.length ; i++)
		{
			if(Integer.parseInt(numbers[i]) < 0)
			{
				String temp=" ";
				for(int j=i ; j<numbers.length ; j++)
				{
					if(Integer.parseInt(numbers[j]) < 0)
					{
						temp+=numbers[j]+" ";
					}
				}
				
				throw new Exception("negatives not allowed" + temp);
			}
			sum=sum+Integer.parseInt(numbers[i]);
		}
		
		return sum;
		

	}

}
