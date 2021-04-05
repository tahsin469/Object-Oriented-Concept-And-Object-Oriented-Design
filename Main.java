
package polymorphism;


public class Main {

 
    public static void main(String[] args) {
     LocalStudent LocalStudent_obj = new LocalStudent(3.7);
     Admin Admin_obj = new Admin();
     Admin_obj.check(LocalStudent_obj);
     ForeignStudent ForeignStudent_obj = new ForeignStudent(3.7);
     Admin_obj.check(ForeignStudent_obj);
     LocalStudent_obj.paymentPerSemester();
     ForeignStudent_obj.paymentPerSemester();
    }
    
}
