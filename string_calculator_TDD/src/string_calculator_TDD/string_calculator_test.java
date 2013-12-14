package string_calculator_TDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class string_calculator_test {
	
	private calculator calc;
	
	@Before
	public void init()
	{
		calc=new calculator();
	}

	@Test
	public void EmptyZero()
	{
		calculator calc=new calculator();
		assertEquals(calc.Add(""), 0);
	}
	
	@Test
	public void oneNumber()
	{
		assertEquals(calc.Add("1"), 1);
	}
	
	@Test
	public void TwoNumbers()
	{
		assertEquals(calc.Add("1,2"), 3);
	}

	@Test
	public void lotOfNumbers()
	{
		assertEquals(calc.Add("1,2,3,4"), 10);
	}
	
	@Test
	public void lineBetweenNumbers()
	{
		assertEquals(calc.Add("1,2\n3,4"), 10);
	}
	
	@Test
	public void differentDelimiters()
	{
		assertEquals(calc.Add("//;\n1;2"), 3);
	}


}
