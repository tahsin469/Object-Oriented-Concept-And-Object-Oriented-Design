
package office;


public class test {

    
    public static void main(String[] args) {
        Employee Rahim = new Employee("10",9,"Day");
        Document Document_object = new Document("Done");
        Rahim.check_documents_status(Document_object);
        Admin Tahsin = new Admin();
        Tahsin.can_check_managers_working_hours(Rahim);
    }
    
}
