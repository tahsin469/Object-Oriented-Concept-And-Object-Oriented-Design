
package abhospital;


public class Test {

    
    public static void main(String[] args) {
        
        Doctor Tahsin = new Doctor();
        Tahsin.performance = "good";
        Report Report_obj = new Report("Normal","Green","Better");
        Tahsin.check_report(Report_obj);
        Chairman Chairman_obj = new Chairman();
        Chairman_obj.assign_doctor_salary(Tahsin);
        
    }
    
}
