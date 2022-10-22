package JavaLearning;

import org.junit.Test;

import java.util.ArrayList;

public class AT12_ArrayList {

    @Test
    public void ArrayList(){
        ArrayList<String> ListOfCars=new ArrayList<String>();
        ListOfCars.add("BMW");
        ListOfCars.add("Toyota");
        ListOfCars.add("Benz");
        ListOfCars.add("RangeRover");
        System.out.println("car names inside ListOfCars : "+ ListOfCars);

        int CarsCount = ListOfCars.size();
        System.out.println("CarsCount : "+CarsCount); //4
        //for loop
        for(int i=0;i<CarsCount;i++){
            System.out.println("Array index : "+ i+" and its value is : "+ListOfCars.get(i));

        }
    }
}
