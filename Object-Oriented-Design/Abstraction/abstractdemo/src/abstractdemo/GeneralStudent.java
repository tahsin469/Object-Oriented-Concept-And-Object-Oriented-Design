
package abstractdemo;


public class GeneralStudent extends Student{

     public GeneralStudent(double c) {

        super(c);

    }

    @Override

    void waiver() {

        if(cgpa>3.80){

            System.out.println("You will get 20% Waiver");

        }

    }
    
}
