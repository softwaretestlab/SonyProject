package JavaLearning;

import org.junit.Test;

public class AT04_GlobalVariables {
    //global variables
    int i=10;
    int j=20;
    String abc ="testlab";

    @Test
    public void test05(){
        //local variables
        int m =20;
        int x = m+i+j;
        System.out.println("x value is : "+x);
    }

    @Test
    public void test06(){
        //local variables
        int k=i+j;
        System.out.println("k value is : "+k);
        System.out.println("abc value is : "+abc);
    }
}