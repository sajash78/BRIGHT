package Abstract;

public abstract class Bike {
    public abstract void run();

}// end of class
    class Splendor extends Bike{
public void run(){
    System.out.println("running safely");
} //
public static void main(String[] args){
    Splendor obj =new Splendor();
    obj. run();
}
}

abstract class Parent {

    public abstract void property();

    public void balance() {
        System.out.println("Parents class");
    }
}
class Childern extends Parent {
    public void property() {
        System.out.println(" THIS IS MY PROPRTY");
    }


        public static void main(String[] args){
            Childern obj = new Childern();
            obj.property();
            obj.balance();
        }
}

