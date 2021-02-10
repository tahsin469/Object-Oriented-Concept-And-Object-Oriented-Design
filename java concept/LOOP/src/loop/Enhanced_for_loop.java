/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author User
 */
public class Enhanced_for_loop {
    public static void main(String[] args) {
        int array[] = {3, 5, 7, 2, 9, 6, 1, 34, 56, 90};
        int total = 0;

        for (int x : array) {
            System.out.print(x + " ");
            total += x;
        }
        System.out.println("\nSummation of the array is " + total);
    }
}
