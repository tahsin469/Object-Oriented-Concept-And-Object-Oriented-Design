
package student_management_system;


public class test {

    
    public static void main(String[] args) {
        Student Ali = new Student(121,1000,3.5);
        Student Tahsin = new Student(121,1000,3.9);
        Admin Rahim = new Admin();
        Rahim.waiver_calculation(Ali);
        Rahim.waiver_calculation(Tahsin);
        Student Rana = new Student(121,2000,3.9);
        Rahim.clearence_condition(Rana);
        Rahim.check_fee(Rana);
    }
    
}
