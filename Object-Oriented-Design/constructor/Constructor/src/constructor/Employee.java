
package constructor;


public class Employee {
    int emp_id;
    int working_hour;
    String shift;

    public Employee(int emp_id, int working_hour, String shift) {
        this.emp_id = emp_id;
        this.working_hour = working_hour;
        this.shift = shift;
    }
}
