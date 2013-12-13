package string_calculator_TDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class string_calculator_test {

	@Test
	public void EmptyZero()
	{
		calculator calc=new calculator();
		assertEquals(calc.Add(""), 0);
	}


}
