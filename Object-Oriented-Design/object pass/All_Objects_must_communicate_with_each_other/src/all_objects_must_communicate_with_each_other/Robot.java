
package all_objects_must_communicate_with_each_other;


public class Robot {
    String name;
    String colour;
    int weight;
    Robot looking;

    public Robot(String name, String colour, int weight) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
    }
    void introduceself(){
        System.out.println("My name is "+this.name);
        System.out.println("My name is "+this.colour);
        System.out.println("My name is "+this.weight);
    }
}
