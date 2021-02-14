
package abhospital;


public class Doctor {
    int salary;
    String performance;
    
    void check_report(Report R1){
        if (R1.category.equals("Normal") && R1.location.equals("Green")) {
            System.out.println("Forwarded to hospital");
        } 
        else if(R1.status.equals("Better") && R1.category.equals("Advance")) {
        System.out.println("Stay here");
        }
        else{
                
           }
    }
}
