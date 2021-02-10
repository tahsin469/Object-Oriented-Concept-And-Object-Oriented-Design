/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;

/**
 *
 * @author User
 */
public class Continue {
    public static void main(String[] args) {
         System.out.println("All odd number from 0 to 100");
        
        for(int i=0; i<100; i++)
        {
            if(i % 2 == 0)
            {
                continue; // when the 'i' is found even then continue keyword will start the for loop again. 
            }
            else
            {
                System.out.println(i); // when the 'i' is found odd it won't go to if statement. it will come in else statement and print i
            }
            
        }
    }
}
