import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidUser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kathe\\OneDrive\\Documentos\\Mis cosas\\Prueba QA wizeline\\browserdriver\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement txt_a = driver.findElement(By.name("user-name"));
		
		txt_a.sendKeys("standard_user"); 
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        driver.findElement(By.xpath("//input[@value='Login' and @type='submit']")).click();
                
        String actualUrl="https://www.saucedemo.com/inventory.html";
        String expectedUrl= driver.getCurrentUrl();
        
        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Aprobado!");
            driver.close();
        }
        else
        {
            System.out.println("No Aprobado.");
        }
    }
}