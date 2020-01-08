package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();


		System.setProperty("webdriver.chrome.drive", "C:\\Users\\almir.damiao\\Desktop\\chromedriver");

		driver.get("http://advantageonlineshopping.com/#/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"menuUserSVGPath\"]")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input")).sendKeys("Almir");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input")).sendKeys("almir_cesar01@hotmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input")).sendKeys("25082000abc");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input")).sendKeys("25082000abc");
		
		System.out.println("account details successful");
		
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input")).sendKeys("Almir");
		
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input")).sendKeys("Damião");
		
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input")).sendKeys("(11)98411-4939");
	    
		System.out.println("cadastro de detalhes feito com sucesso");
		
		
		
//		driver.quit();
		
		
	}
}
