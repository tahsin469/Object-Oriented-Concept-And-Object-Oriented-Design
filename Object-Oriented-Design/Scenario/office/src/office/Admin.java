
package office;


public class Admin {
    void can_check_managers_working_hours(Employee E1)
    {
        if (E1.working_hour>8) {
            System.out.println("new work assignment");
        }
        else{
            System.out.println("do previous work");
        }
    }
}
