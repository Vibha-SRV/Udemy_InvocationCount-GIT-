package invocationcount;

import org.testng.annotations.Test;

public class Open5Times extends OpenBrowser {
	
	@Test(invocationCount=2, threadPoolSize=2)
	public void Login()
	{
		driver= getDriver("Chrome");
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
