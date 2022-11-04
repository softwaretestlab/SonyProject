package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateTitleAssertScreenshot {

    @Test
    public void Navigate() throws IOException {
        //chromedriver setup
        WebDriverManager.chromedriver().setup();
        //This below line will open chrome browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        // navigate to webpage
        driver.get("https://echoecho.com/");
        //implicit wait
        //if it takes more than 10sec , test case will fail and
        //we see pageloadtimeout error message
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String ActualTitle= driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectTitle = "EchoEcho.Com - Web Hosting - JavaScript Tutorial - HTML tutorial - CSS Tutorial - Flash Tutorial - Online for free!";
        //Assertion version-1
        Assert.assertEquals(ExpectTitle,ActualTitle);
        //Assertion version-2
        Assert.assertTrue(ActualTitle.contains("tutorial"));
        //Screenshot
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\softw\\screenshot.jpeg"));



    }
}
