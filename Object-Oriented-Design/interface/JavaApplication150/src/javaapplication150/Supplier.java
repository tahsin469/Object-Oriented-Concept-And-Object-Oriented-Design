
package javaapplication150;


public class Supplier implements IBonus{
    int soid_item;
    void set_sold_item(int s){
        soid_item = s;
    }
    @Override
    public void getBonus(){
        System.out.println("Bonus is "+soid_item*15);
    }
}
