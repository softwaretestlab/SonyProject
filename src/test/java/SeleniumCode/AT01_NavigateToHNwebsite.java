package SeleniumCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateToHNwebsite {

    @Test
    public static void NavToHN() throws IOException {
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("HomePageUrl"));
        // implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public static void AsserTitle(){
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println("HNTitle : "+ActualTitle);
        String ExpectedTitle = "Computers, Electrical, Furniture & Bedding | Harvey Norman Australia";
        //Assertion Version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }

}
