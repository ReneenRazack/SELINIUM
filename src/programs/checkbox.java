package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);
		System.setProperty("webdriver.edgedriver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		WebElement checkbox=driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-title"));
		if(!checkbox.isSelected()) {
			checkbox.click();
			checkbox.click();
			}
	
			driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg")).click();		
			WebElement checkbox1=driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
			if(!checkbox1.isSelected()) {
				
				checkbox1.click();
				//home
			}
	driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > button")).click();
	//desktop
	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]")).click();
WebElement checkbox2=driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]"));
	if(!checkbox2.isSelected()) {
	checkbox2.click();
	}//document
	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")).click();
	driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg > path")).click();
	//workspace tick removing
	driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg > path")).click();
	//office tick removing
	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button")).click();
	//toggle workspace
	WebElement checkbox3=driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]"));
	if(!checkbox3.isSelected());
	checkbox3.click();
	//click workspace
	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]")).click();
	//react unclick
	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[1]")).click();
	//angular unclick
	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span/label/span[1]")).click();
	//veu unclick
	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button")).click();
   //office toggle
	WebElement checkbox4=driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[1]"));
	if(!checkbox4.isSelected());
	checkbox4.click();
	checkbox4.click();
	//public click and unclick in office
	WebElement checkbox5=driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]"));
	if(!checkbox5.isSelected());
	checkbox5.click();
	checkbox5.click();
	//private click and unclick in office
	WebElement checkbox6=driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[1]"));
	if(!checkbox6.isSelected());
	checkbox6.click();
	checkbox6.click();
	//classified click and unclick in office
	WebElement checkbox7=driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]"));
	if(!checkbox7.isSelected());
	checkbox7.click();
	checkbox7.click();
	//general click and unclick in office
	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]")).click();
	WebElement checkbox8=driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-collapsed > span > label > span.rct-checkbox"));
 if (!checkbox8.isSelected()) {
      checkbox8.click();
	 }
 //downloads unchecked 
driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button")).click();
		} catch (InterruptedException e) {
            e.printStackTrace();
		// TODO Auto-generated method stub

		}
	}
} 
