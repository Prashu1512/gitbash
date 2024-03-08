package chaitra_customer_module;

import org.testng.annotations.Test;

public class Supp_module {
	@Test(groups="Supp smoke")
	public void samplescript_3()
	{
		System.out.println("-----test script 3-----");
	}
	
	@Test(groups={"smokesuite","regressionsuite"})
	public void samplescript_4()
	{
		System.out.println("-----Supp smoke and regression-----");
	}
}
