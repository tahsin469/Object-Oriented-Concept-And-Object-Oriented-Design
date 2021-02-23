
package all_objects_must_communicate_with_each_other;


public class Person {
    String name;
    String personality;
    boolean isSitting;
    Robot robotOwned;
    Person looking;

    public Person(String name, String personality, boolean isSitting) {
        this.name = name;
        this.personality = personality;
        this.isSitting = isSitting;
    }
    void sitDown(){
        this.isSitting=true;
    }
    void standup(){
        this.isSitting=false;
    }
}
