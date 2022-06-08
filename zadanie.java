	package Practise;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

public class zadanie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				System.setProperty("webdriver.chrome.driver", "/Users/klaudiakruszewska/Documents/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/angularpractice/");
				
				driver.findElement(By.name("name")).sendKeys("Klaudia");
				driver.findElement(By.name("email")).sendKeys("Klaudia@gmail.com");
				driver.findElement(By.id("exampleInputPassword1")).sendKeys("abc123");
				System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
				driver.findElement(By.id("exampleCheck1")).click();
				System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
				driver.findElement(By.id("exampleFormControlSelect1")).click();
				driver.findElement(By.cssSelector("body app-root option:nth-child(2)")).click();
				driver.findElement(By.id("inlineRadio2")).click();
				driver.findElement(By.name("bday")).sendKeys("13051998");
				driver.findElement(By.xpath("//input[@value='Submit']")).click();
				System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
				

				
			}

	}
