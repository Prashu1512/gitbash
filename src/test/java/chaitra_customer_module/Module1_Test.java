package chaitra_customer_module;

import org.testng.annotations.Test;

public class Module1_Test {
	@Test(groups="smokesuite")
	public void samplescript_3()
	{
		System.out.println("----MOdule Smoke-----");
	}
	
	@Test(groups={"smokesuite","regressionsuite"})
	public void samplescript_4()
	{
		System.out.println("-----Module reg and smoke-----");
	}
}
