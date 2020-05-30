package Interface;

public interface Bike {
    public abstract void run();

} //end of class

class Splendor implements Bike{
    public void run(){
        System.out.println("running safety");
    } // end of class

    public static void main(String[] args){
        Splendor obj =  new Splendor();
        obj.run();
    }
}




