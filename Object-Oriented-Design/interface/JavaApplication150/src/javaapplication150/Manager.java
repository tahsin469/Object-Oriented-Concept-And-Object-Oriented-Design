
package javaapplication150;


public class Manager extends Employee implements IBonus{

     Manager(int s) {
        super(s);
    }

    @Override
    public void getBonus(){
        System.out.println("Bonus is "+salary*10);
    }
    
}
