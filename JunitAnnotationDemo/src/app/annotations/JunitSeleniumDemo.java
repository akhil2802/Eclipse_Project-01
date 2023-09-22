package app.annotations;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitSeleniumDemo {
	
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void test1() {
		
		/*
//		   Verifying Title Name:
		String expectedTitle = "Gmail";
		
		driver.get("http://gmail.com");
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		
//		   Verifying Url:
		String expectedUrl = "https://www.olx.in/?bm-verify=AAQAAAAG_____8dblnngwl2FXRCI1sSIkiyr-avghiOZwgSzeTVRMtgkLDhMM9VEemVT-ETT40P4CxSsVz3FggRnIn1cuIvZYVBHE4aQ21ornDH09y4vWaCzSzc3jojdK8ZOYxg-eRASt0BnyEFanvkup9dQRRgMeOt2amAo72ev-KPD-9SfxeIaJX4mnUzxWQwCo7JTEv15DN3R72YN8E0mgV1TPq38b5wqC-3zWtqDb4u8SHPjIQ";
		
		driver.get("http://www.olx.com");
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, actualUrl);
		*/
	}
}
