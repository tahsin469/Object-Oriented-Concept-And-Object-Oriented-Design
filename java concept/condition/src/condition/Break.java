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
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 30; i++) {
            System.out.println(i);
            if (i == 20) {
                break; // this will break the loop and come out from the for loop
            }
        }
        System.out.println("i has been printed 20 times");
    }
    
}
