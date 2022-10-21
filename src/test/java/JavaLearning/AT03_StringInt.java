package JavaLearning;


import org.junit.Test;

public class AT03_StringInt {

    @Test
    public void test03(){
        //declare local variables
        //integers
        int i=10;
        int j=20;
        int k =i+j;
        System.out.println("K value is : "+ k);

    }

    @Test
    public void test04() {
        //declare local variables
        //Strings
        String test01="Software";
        String test02="testlab";
        String test03=test01+test02;
        System.out.println("Value of test03 : "+test03 );
    }
}
