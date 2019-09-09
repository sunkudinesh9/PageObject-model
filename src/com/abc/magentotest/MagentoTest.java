
package com.abc.magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobject.Home;
import com.abc.magentoobject.Login;
import com.abc.magentoobject.Logout;

public class MagentoTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://magento.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(url);

		Home h = new Home(driver);
		h.ClickOnMyAccount();

		Login l1 = new Login(driver);
		l1.typeOnEmail("nitinmanjunath1991@gmail.com");
		l1.typeOnPassqword("Welcome123");
		l1.clickOnLogin();

		Logout l2 = new Logout(driver);
		l2.clickOnLogout();
		
		driver.quit();

	}

}
