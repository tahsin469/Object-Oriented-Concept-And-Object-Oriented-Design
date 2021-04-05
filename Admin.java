
package polymorphism;


public class Admin {
    void check(int a){
        System.out.println("Admin is checking files");
    } 
        void check(LocalStudent s){
            if (s.cgpa>3.6) {
            
                System.out.println("ok");
            
    } 
    
}
// Method Overloading
        void check(ForeignStudent s){
            if (s.cgpa>3.6) {
            
                System.out.println("very good");
            
    } 
    
}
}