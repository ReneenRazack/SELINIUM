package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.edgedriver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demoqa.com/upload-download");
				driver.manage().window().maximize();
				WebElement fileinput=driver.findElement(By.cssSelector("#uploadFile"));
				String filepath="D:\\bbb\\New Text Document.txt";
		fileinput.sendKeys(filepath);
		driver.findElement(By.xpath("//*[@id=\"downloadButton\"]")).click();
			}

		

	}

