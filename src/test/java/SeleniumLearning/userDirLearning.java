package SeleniumLearning;

import org.junit.Test;

public class userDirLearning {

    @Test
    public void myPath(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\TestDataHN1.xlsx");
    }
}
