import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDemo {
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.addArguments("Start-maximized");
WebDriver driver = new ChromeDriver(options);		
driver.get("https://www.amazon.in/");		
WebElement name =driver.findElement(By.id("twotabsearchtextbox"));
name.sendKeys("Smart watch"+Keys.ENTER);	
List<WebElement> findElements = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));		
for(int i=0;i<findElements.size();i++){
System.out.println(findElements.get(i).getText());	
}
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='₹1,000 - ₹5,000']")).click();
List<WebElement> elements = driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style']//span[@class='a-price-whole']"));
//  List<String> priceLists =new ArrayList<>();
for (WebElement element : elements) {
System.out.println(element.getText());
  driver.findElement(By.xpath("//span[text()='₹4,000']"));
//List<WebElement> elements = driver.findElements(By.xpath(""));      
 }
	
	

	}
	

}
