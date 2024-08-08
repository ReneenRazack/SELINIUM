package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edgedriver","\"D:\\chromedriver_win64\\msedgedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"item-2\"]/span")).click();
WebElement radiobutton=driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(2) > label"));
if(!radiobutton.isSelected()) {
	radiobutton.click();
}
//yes radiobutton 
WebElement radiobutton1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
if(!radiobutton1.isSelected()) {
	radiobutton1.click();
}

	}

}
