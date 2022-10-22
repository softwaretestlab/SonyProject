package JavaLearning;

import org.junit.Test;

public class AT10_ArrayLoop {
    @Test
    public void test14() {
        // variable  age is an array
        int[] age = {10, 20, 30, 40, 50, 60};
       int LengthOfArray= age.length;
        System.out.println("length of array is : "+LengthOfArray);  //6
        //for loop
        for(int i=0;i<LengthOfArray;i++){
            System.out.println("Array index is : "+i+"its value is : "+age[i]);

        }
    }
}
