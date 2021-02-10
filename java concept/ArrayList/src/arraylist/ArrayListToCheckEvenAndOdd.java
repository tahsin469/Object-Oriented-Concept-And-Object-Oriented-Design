/* Problem Text:
------------------------------------------
** Take an Array List of Integer Type
** Add these values 11,22,33,44,55
** Create a method Which Checks every number of that Array-List and
** Print if the number is an Even Number or, Odd Number.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToCheckEvenAndOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        /*
        ** To Declare an ArrayList
         */
        ArrayList<Integer> myArrayList = new ArrayList<>();

        /*
        ** Adding Values In An Array List 
        ** Using Loop
         */
        int data = 0;
        while (sc.hasNextInt()) // Will Take Input Till You Input Integer Type Data
        {
            data = sc.nextInt();
            myArrayList.add(data);
        }

        /*
        ** Check if a number of ArrayList is Even or, Odd
        ** Using Enhaned For Loop
         */
        for (int numbers : myArrayList) {
            if (isAnEvenNumber(numbers)) {
                System.out.println(numbers + " is An Even Number");
            } else {
                System.out.println(numbers + " is An Odd Number");
            }
        }

    }

    private static boolean isAnEvenNumber(int number) {
        return number % 2 == 0;
    }
    
}
