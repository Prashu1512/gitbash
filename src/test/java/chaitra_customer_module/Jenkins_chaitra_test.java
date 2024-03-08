package chaitra_customer_module;

import org.testng.annotations.Test;

public class Jenkins_chaitra_test {
	@Test(groups="smokesuite")
	public void samplescript_3()
	{
		System.out.println("-----Smoke 3-----");
	}
	
	@Test(groups={"smokesuite","regressionsuite"})
	public void samplescript_4()
	{
		System.out.println("-----Smoke and Regression 4-----");
	}
}
