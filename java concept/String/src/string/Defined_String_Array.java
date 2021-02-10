/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author User
 */
public class Defined_String_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String strArray[] = {"Daffodil", "International", "University"};

        // printing strArray using enhanced for loop
        for (String x : strArray) {
            System.out.print(x + " ");
        }
    }
    
}
