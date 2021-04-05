
package polymorphism;


public class ForeignStudent extends Student{

    public ForeignStudent(double c) {
        super(c);
    }
//Method Overriding
    @Override
    void paymentPerSemester(){
        System.out.println("45000BDT");
    }
    
}
