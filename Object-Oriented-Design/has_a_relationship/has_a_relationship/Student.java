
package has_a_relationship;


public class Student {
    String id;
    Cource c1;

    public Student(String id) {
        this.id = id;
       
    }
    
    void registration(Cource c){
        c1=c;
        //System.out.println(c1.code);
    }
    void printCourse(){
        System.out.println(id +" "+ c1.code);
    }

}
