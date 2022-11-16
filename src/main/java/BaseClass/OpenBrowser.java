package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
   public static WebDriver driver;
    public static void NavToWeb(String url){
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //At this point browser will be opened
         driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        // Navigate to GG AccountCreation page
       // driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
        driver.get(url);
    }

}
