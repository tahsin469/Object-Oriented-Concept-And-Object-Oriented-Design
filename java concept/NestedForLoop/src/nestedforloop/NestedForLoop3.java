/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedforloop;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NestedForLoop3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Number Of Rows? :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; ++k) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
