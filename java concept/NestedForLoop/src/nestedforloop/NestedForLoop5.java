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
public class NestedForLoop5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number Of Rows? :");
        int n = in.nextInt();
        for (int i = 1; i <= n; ++i) {
            int j = i - 1;
            while (j != 0) {
                System.out.print(" ");
                j--;
            }

            for (int k = 1; k <= (2 * (n - i) + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}
