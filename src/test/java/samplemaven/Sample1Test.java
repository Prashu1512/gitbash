package samplemaven;

import org.testng.annotations.Test;

public class Sample1Test 
{
	@Test(groups={"smokesuite","regressionsuite"})
	public void samplescript_1()
	{
		System.out.println("-----test script 1-----");
	}
	
	@Test(groups="smokesuite")
	public void samplescript_2()
	{
		System.out.println("-----test script 22222-----");
	}
}
