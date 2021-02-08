
package object_communication;


public class test {

    
    public static void main(String[] args) {
        Student Tahsin = new Student("143-545-455", "Tahsin", 3.5);
        Student Ahsan = new Student("143-545-456", "Ahsan", 3.9);
        Tahsin.can_view_pament();
        System.out.println(Tahsin.id);
        Admine Subbir = new Admine();
        Subbir.check_cgpa(Ahsan);
        Subbir.check_cgpa(Tahsin);
    }
    
}
