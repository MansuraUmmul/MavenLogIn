package LogInTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {        

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.saucedemo.com/");

        // Find the username and password fields and enter your credentials
        WebElement username = driver.findElement(By.name("user-name"));
        WebElement password = driver.findElement(By.name("password"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");

        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();
        
        String pageTitle = driver.getTitle();
        System.out.println("Page Title after login: " + pageTitle);

        // Close the browser
        driver.quit();
    }
}
