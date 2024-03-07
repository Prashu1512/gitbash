package chaitra_customer_module;

import org.testng.annotations.Test;

public class Module1_Test {
	@Test(groups="smokesuite")
	public void samplescript_3()
	{
		System.out.println("-----test script 3-----");
	}
	
	@Test(groups={"smokesuite","regressionsuite"})
	public void samplescript_4()
	{
		System.out.println("-----test script 4-----");
	}
}
