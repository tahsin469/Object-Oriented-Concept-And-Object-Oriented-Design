
package object_communication;


public class Admine {
    void check_cgpa(Student S1){
        if (S1.cgpa>3.8) {
            System.out.println("10% waiver");
        }
        else{
            System.out.println("do not get 10% waiver");
        }
    }
}
