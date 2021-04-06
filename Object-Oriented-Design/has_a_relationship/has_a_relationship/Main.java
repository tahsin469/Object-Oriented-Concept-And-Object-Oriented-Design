
package has_a_relationship;


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("193-54");
        Cource c = new Cource("SE221");
        s1.registration(c);
        s1.printCourse();
    }
}
