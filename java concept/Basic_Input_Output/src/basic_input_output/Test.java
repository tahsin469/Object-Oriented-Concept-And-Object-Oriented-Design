
package basic_input_output;
// importing scanner 
import java.util.Scanner;


public class Test {

   
    public static void main(String[] args) {
         String name = "abcdef"; // string 
        int age = 30; // int can store 16 bit
        float sgpa = 2.5f; // float can store 16 bit. here f is used after 2.5. its because in java 0.0 format is used for only double type variable 
        // so when 2.5 is written it will show and error because float can store 16 bit but 2.5 is 32 bit as this format is for double type variable

        double cgpa = 4.0; // double can store 32 bit
        char section = 'A'; // single char can store 1 bit

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("sgpa and cgpa is: " + sgpa + " , " + cgpa);
        System.out.println("Section is " + section);
        
        // making scanner type object
        Scanner myscanner = new Scanner(System.in);

        System.out.println("\n\nPlease enter your name");
        String name2 = myscanner.nextLine();
        System.out.println("Please enter your age");
        int age2 = myscanner.nextInt();
        System.out.println("Please enter your id");
        String id = myscanner.next();
        System.out.println("Please enter your SGPA");
        float semesterGPA = myscanner.nextFloat();
        System.out.println("Please enter your CGPA");
        double cgpa2 = myscanner.nextDouble();
    }
    
}
