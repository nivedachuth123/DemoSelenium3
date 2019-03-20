
import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class CustTest {

@Test
public  void  main1() throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
 
Thread.sleep(3000);
 
driver.findElement(By.name("t1")).sendKeys("Piyush Kataria");
driver.findElement(By.name("t2")).sendKeys("piyush34@gmail.com");
driver.findElement(By.name("t3")).sendKeys("987456321");
 
driver.findElement(By.xpath("//input[@type='submit']")).click();
Assert.assertEquals(3, 3);
}

@Test
public  void  main2() throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost:9090/Customer2/CustomerDetails.html");
 
Thread.sleep(3000);
 
driver.findElement(By.name("t1")).sendKeys("Piyush Kataria");
driver.findElement(By.name("t2")).sendKeys("piyush34@gmail.com");
driver.findElement(By.name("t3")).sendKeys("987456321");
 
driver.findElement(By.xpath("//input[@type='submit']")).click();
 
Assert.assertEquals(3, 3);

 
}
}