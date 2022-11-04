package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AT02_LocatorsLearning {
@Test
    public void LocatorsSelenium(){
    //chromedriver setup
        WebDriverManager.chromedriver().setup();
    //This below line will open chrome browser
    WebDriver driver = new ChromeDriver();
    //maximize browser
        driver.manage().window().maximize();
    // navigate to webpage
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
    //implicit wait
            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    // enter data in firstname field
        //locator - name
        driver.findElement(By.name("firstName")).sendKeys("FirstName");
        // enter data in lastname field
        //locator - id
        driver.findElement(By.id("regAddForm_lastName")).sendKeys("LastName");
// by link text
    driver.findElement(By.linkText("Catalogues")).click();

// by partial link text
    driver.findElement(By.partialLinkText(" RealCa$h ")).click();


        }
}
