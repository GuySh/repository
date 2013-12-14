/*
 * Guy shimoni
 * gitHub login: GuySh
 * */

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
	public void EmptyZero() throws Exception
	{
		calculator calc=new calculator();
		assertEquals(calc.Add(""), 0);
	}

	@Test
	public void oneNumber() throws Exception
	{
		assertEquals(calc.Add("1"), 1);
	}

	@Test
	public void TwoNumbers() throws Exception
	{
		assertEquals(calc.Add("1,2"), 3);
	}

	@Test
	public void lotOfNumbers() throws Exception
	{
		assertEquals(calc.Add("1,2,3,4"), 10);
	}

	@Test
	public void lineBetweenNumbers() throws Exception
	{
		assertEquals(calc.Add("1,2\n3,4"), 10);
	}

	@Test
	public void differentDelimiters() throws Exception
	{
		assertEquals(calc.Add("//;\n1;2"), 3);
	}

	@Test
	public void negativeNumberWillThrowAnException() 
	{
		try
		{
			assertEquals(calc.Add("-1,-3,2"), 1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}



}
