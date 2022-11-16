package SeleniumLearning;

import BaseClass.OpenBrowser;
import org.junit.Test;

public class BaseClassUsage {
    @Test
    public void nav(){
        OpenBrowser.NavToWeb("https://echoecho.com/");
        OpenBrowser.NavToWeb("https://www.google.com/");
    }
}
