package Com.guru99.testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import Com.guru99.pageObject.LoginPage;
import junit.framework.*;

public class TC_Login_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		LoginPage lp= new LoginPage(driver);
		System.out.println(lp.getClass());
		lp.setUserName(username);
		lp.setpassword(password);
		lp.clickSubmit();
		//WebElement btn = findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		//btn.click();
		//this is my new file
		System.out.println(driver.getTitle());
	

		if(driver.getTitle().equals("Guru99 Bank Home Page"))
		{
			Assert.assertTrue(true);
		}else
			{
		Assert.assertTrue(false);
		}
		System.out.println("end of this code");

	}

	private WebElement findElement(By name) {
		// TODO Auto-generated method stub
		return null;
	}
}
	

