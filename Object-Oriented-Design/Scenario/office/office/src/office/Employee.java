
package office;


public class Employee {
    String employee_id;
    int working_hour;
    String shift;

    Employee(String employee_id , int working_hour , String shift) {
        this.employee_id = employee_id;
        this.working_hour = working_hour;
        this.shift = shift;
    }
    void check_documents_status(Document D1)
    {
        
        if (D1.status.equals("Good")) {
            System.out.println("We can deal");
        } 
        else if(D1.status.equals("Done")) {
            System.out.println("Proceed");
        }
        
    }
}
