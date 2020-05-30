package Polymorphism;

public class Bike {
    public void run() {
        System.out.println("Bike is running");
    }// Bike class ends
}

    class Splendor extends Bike {
        public void run(){
           System.out.println("Splendor is running"); }



           public static void main(String[] args){
        Bike obj = new Splendor();
        obj.run();
    }
}
