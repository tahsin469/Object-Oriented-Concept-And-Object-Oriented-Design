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
public class NestedForLoop4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Number Of Rows? :");
        int n = myScanner.nextInt();
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); ++k) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
