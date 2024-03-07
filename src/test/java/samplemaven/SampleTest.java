package samplemaven;

import org.testng.annotations.Test;

public class SampleTest 
{
	@Test(groups="smokesuite")
	public void samplescript_5()
	{
		System.out.println("-----test script 3-----");
	}
	
	@Test(groups="regressionsuite")
	public void samplescript_6()
	{
		System.out.println("-----test script 4-----");
	}
}
