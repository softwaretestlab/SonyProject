package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        obj.encMethod01(10,20);
        obj.encMethod01(20,20);

        // here we are using the value from return statement into code
        int x = obj.encMethod02(50,60);
        int z = x+40;
        System.out.println("value of z is : "+z);
    }
}
