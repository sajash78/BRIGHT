package SuperKeyword;

public class Animal {

    String colour = "white";

}
class Dog extends Animal{
    String colour = " black";


    public void printColour(){
        System.out.println(colour);
        System.out.println(super.colour);
    }
    public static void main(String[] args){
        Dog obj = new Dog();
                obj.printColour();
    }
}

