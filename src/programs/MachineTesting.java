package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MachineTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdiver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
	//////////////////////////////HOME PAGE//////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		//////////////////////////home button will work///////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		//////////////////////////contact button will work/////////////////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys("heloo@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"recipient-name\"]")).sendKeys("341252435");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"message-text\"]")).sendKeys("blaah");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]")).click();
		////////////////////////user can enter details in contact page//////////////////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
		//////////////////////////////////about us///////////////////////////////////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"example-video\"]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
		////////////////////////////////vid and close button works perfectly in about us page/////////////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		////////////////////////////////cart page will open for user//////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		////////////////////////////////place order button will work//////////////////////////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("blaah");
		driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("shshh");
		driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("4536234563467");
		driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("march");
		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]")).click();
		////////////////////////////will enter details in place order page and close button will work//////////////////////
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("blaah");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("shshh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("4536234563467");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("April");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
	///////////////place order page will open details will be added after that purchase button will work////////////
		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("blaah");
		driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("904868");
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")).click();
		Thread.sleep(000);
	
		/////////////////////////////////sign up page will open and details will be added///////////////////////////////////////
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("blaah");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("904868");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"logout2\"]")).click();
		////////////////////////login page will open and details will be addded///////////////////////////
		//driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		//////////////////////samsung phone page will open and return back to home page/////////////////////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		//////////////////nokia phone page will open and return back to home page///////////////////////////////////
		
		Thread.sleep(3000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		WebElement scroll=driver.findElement(By.cssSelector("#article"));
		js1.executeScript("arguments[0].scrollIntoView();",scroll);
		///////////////////scroll down to bottom of the page//////////////////////////////////////////
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"prev2\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"next2\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"prev2\"]")).click();
/////////////////////////////////preview and next button works////////////////////////////////////////////

	}

}
