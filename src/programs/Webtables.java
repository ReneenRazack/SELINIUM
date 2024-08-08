package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.Driver",
				"D:\\\\games\\\\study\\\\chromedriver-win64\\\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/webtables");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("dgas");
driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("sga");
driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("sg44a@gmail.com");
driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("2");
driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("50000");
driver.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("software testing");
driver.findElement(By.cssSelector("#submit")).click();
driver.findElement(By.cssSelector("#searchBox")).sendKeys("dgas");
driver.findElement(By.xpath("//*[@id=\"delete-record-4\"]")).click();


	}

}
