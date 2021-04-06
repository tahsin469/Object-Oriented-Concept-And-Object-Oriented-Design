
package abstractdemo;


public class TalentHuntScholarStudent extends Student{

    public TalentHuntScholarStudent(double c) {
        super(c);
    }
@Override

    void waiver() {

        if(cgpa>=3.80){

            System.out.println("You will got 100% Waiver");

        }

    }
}
