
package student_management_system;


public class Admin {
    void waiver_calculation(Student S1){
        if (S1.cgpa>3.8) {
            System.out.println("you got 20% waiver");
        } else {
            System.out.println("you do not got 20% waiver");
        }
    }
    void clearence_condition(Student S2){
        if (S2.fee == 12000) {
            System.out.println("You have clearence");
        } else {
            System.out.println("You do not have clearence");
        }
    }
    void check_fee(Student S3){
        if (S3.id == 511 && S3.fee>=5000) {
            System.out.println("you got clearence");
        } else {
            System.out.println("you do not got clearence");
        }
    }        
}
