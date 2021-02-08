
package object_communication;


public class Student {
    String id,name;
    double cgpa;

    public Student(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    void can_view_pament(){
        System.out.println("Viewing");
    }
}
