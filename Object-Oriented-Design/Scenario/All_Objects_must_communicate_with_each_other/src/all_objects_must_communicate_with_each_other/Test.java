
package all_objects_must_communicate_with_each_other;


public class Test {

    
    public static void main(String[] args) {
        Robot Robot_obj1 = new Robot("Tom","Read",30);
        Robot Robot_obj2 = new Robot("To-To","Green",40);
        Robot Robot_obj3 = new Robot("Ti-To","Black",20);
        Robot Robot_obj4 = new Robot("Ti-Ti","White",35);
        Robot Robot_obj5 = new Robot("Too-Too","Blue",50);
        Robot_obj1.introduceself();
        
        Robot_obj1.looking = Robot_obj2;
        Robot_obj1.looking.introduceself();
        
        Robot_obj2.looking = Robot_obj5;
        Robot_obj5.introduceself();
        
        
        Person Person_obj1 = new Person("Tahsin","Talkative",true);
        Person Person_obj2 = new Person("Ahsin","Smart",false);
        Person Person_obj3 = new Person("Rakib","Humble",true);
        Person Person_obj4 = new Person("Subbir","Intellectual",false);
        Person Person_obj15 = new Person("Rana","Aggressive",true);
        
        Person_obj1.robotOwned = Robot_obj5;
        Person_obj1.robotOwned.introduceself();
        Person_obj15.robotOwned = Robot_obj3;
        Person_obj15.robotOwned.introduceself();
        
        Person_obj1.looking = Person_obj2;
        Person_obj1.looking.sitDown();
        Person_obj1.looking.standup();
        
        Person_obj4.looking = Person_obj1;
        Person_obj4.looking.standup();
        Person_obj4.looking.standup();
        
        
        
        
    }
    
}
