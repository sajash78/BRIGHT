package MethodOverridding;

public class Bike {
    public void run(){
        System.out.println(" BIKE is running");
    }
} // BIKE CLASS END
class Splendor extends Bike{
    public void run(){
        System.out.println("Splendor is running safely");
    }
    public static void main(String[] args){
        Splendor obj = new Splendor();
        obj.run();
    }
}