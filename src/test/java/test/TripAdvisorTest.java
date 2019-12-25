package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.TripAdvisor;

public class TripAdvisorTest extends TripAdvisor {
	
	@BeforeMethod
	public void Initialization() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\ScriptDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.tripadvisor.in/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 }
	
	@Test
	public void Searchtest(){
		TripAdvisor.Search_Click().click();
	}
	@Test
	public void SearchTextBoxTest(){
		TripAdvisor.mainSearch_textbox().sendKeys("club mahindra");
		TripAdvisor.Button_Search().click();
	}
	@Test
	public void FirstResultTest(){
		TripAdvisor.FirstResult_Click().click();
	}
	@Test
	public void HandleWindowTest(){
		TripAdvisor.HandleWindow();
	}
	@Test
	public void MouseHoverTest(){
		TripAdvisor.MouseHover();
		
	}
	@Test
	public void ReviewTitleTest(){
		TripAdvisor.ReviewTitle_textbox().sendKeys("good Website");
	}
	@Test
	public void ReviewTest(){
		TripAdvisor.Review_textbox().sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
	
	}
	@Test
	public void HotelRatingsTest(){
		TripAdvisor.CheckHotelRatings();
	}
	@Test
	public void CheckBoxTest(){
		TripAdvisor.SelectCheckBox();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
