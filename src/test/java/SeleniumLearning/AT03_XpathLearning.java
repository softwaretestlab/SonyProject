package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
public class AT03_XpathLearning {

    @Test
    public void xpath() throws InterruptedException {
        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
        driver.get("https://www.myer.com.au/join");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter email address
        //xpath version-1
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@gmail.com");
        //click on create account button
        ////xpath version-2
        //button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-c') and contains(@type,'button')]
        driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-c')]")).click();
       //Enter password
        driver.findElement(By.xpath("//input[@id='password' and @type='password']")).sendKeys("password");
        //Click on create account button
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Create account')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(20000);
        //xpath version-3
        driver.findElement(By.xpath("//button[@id='create-account']")).click();
    }
}
