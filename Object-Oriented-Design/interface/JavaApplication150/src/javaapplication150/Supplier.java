
package javaapplication150;


public class Supplier {
    int soid_item;
    void set_sold_item(int s){
        soid_item = s;
    }
    public void getBonus(){
        System.err.println("Bonus is "+soid_item*15);
    }
}
