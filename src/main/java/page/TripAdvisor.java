package page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TripAdvisor {
	
	public static WebDriver driver= null;
	public static WebElement element= null;
	
public static WebElement Search_Click(){
		
		element = driver.findElement(By.xpath("//span[@class='brand-global-nav-action-search-Search__label--3PRUD']"));
		return element;
		
}

public static WebElement mainSearch_textbox (){
	
	element = driver.findElement(By.xpath("//input[@id='mainSearch']"));
	return element;
}

public static WebElement Button_Search (){
	
	element = driver.findElement(By.xpath("//div[@id='SEARCH_BUTTON_CONTENT']"));
	return element;
}

public static WebElement FirstResult_Click (){
	
	element = driver.findElement(By.xpath("//div[@class='aspect  is-shown-at-desktop']//div"));
	return element;
}

public static void HandleWindow(){
	
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	String ParentwindowId= it.next();
	String childWindowId= it.next();
	driver.switchTo().window(childWindowId);
	
	driver.findElement(By.linkText("Write a review")).click();
	
	String childwindow2Id = it.next();
	
}


public static void MouseHover (){
	//hover on the ratings
	WebElement ele=driver.findElement(By.xpath("//*[@class='easyClear bigRatingParent']"));
	Actions action = new Actions(driver);
	action.moveToElement(ele).build().perform();
	//click on five star
	WebElement fivestar=driver.findElement(By.xpath("//*[@class='easyClear bigRatingParent']//*[contains(@class,'ui_bubble_rating fl bubble_50')]"));
	action.moveToElement(fivestar).build().perform();
}

public static  WebElement ReviewTitle_textbox(){
	
	element = driver.findElement(By.name("ReviewTitle"));
	return element;
	
	
}

public static  WebElement Review_textbox(){
	
	element = driver.findElement(By.name("ReviewText"));
	return element;
	
	
}

public static void CheckHotelRatings(){
	WebElement hotelsec=driver.findElement(By.xpath("//*[@class='easyClear bigRatingParent']"));
	
	if(hotelsec.isDisplayed())
	{
		//hover on the ratings
		Actions action2 = new Actions(driver);
		
		//selecting service rating
		WebElement ele2=driver.findElement(By.xpath("(//*[@class='dq_allTravelers questionRow stripedRow flagged']//*[@class='detailsRatings'])[1]"));
	action2.moveToElement(ele2).build().perform();
	
	//click on the fivth star
		WebElement service=driver.findElement(By.xpath("(//*[@class='dq_allTravelers questionRow stripedRow flagged']//*[@class='detailsRatings'])[1]//spa[@class='answersBubbles ui_bubble_rating fl qid12 bubble_50']"));
		action2.moveToElement(service).build().perform();
		
		
	}
	else
	{
		System.out.println("hotel section not displayed");
	}
}

public static void SelectCheckBox(){
	WebElement checkbox=driver.findElement(By.xpath("//*[@type='checkbox']"));

	if ( !checkbox.isSelected() )
	{
		checkbox.click();
	}
	
	}
}











