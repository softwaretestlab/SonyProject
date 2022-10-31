package LoopsNConditionalStatments;

import org.junit.Test;

public class AT03_DoWhileLoop {
    @Test
    public void DoWhileLoopLearn(){
        int ticketNumber=40;
        do{
            System.out.println("TickerNumber is : "+ ticketNumber);
            ticketNumber++;
        }while(ticketNumber<=45);
    }
}
