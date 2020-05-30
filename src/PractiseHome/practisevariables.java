package PractiseHome;

public class practisevariables { // start of practisec class

    int a = 10;
    int b=20;
    int c= (a+b);

    public void Demo1(){// demo1 start

        System.out.println(c);
    } //Demo 1 method end

    public static void main(String[] args){ // main method start
       practisevariables obj =new practisevariables();
       obj.Demo1();
    }// main finished.

}// end of class name

class practiseDem // start of my calss
{
    int a =30;
        int b =40;
        int c = a+b;

        public void Demo2() { //start of demo

            System.out.println(c);

        }
        public static void main(String[] args){ // start of main method

            practiseDem obj = new practiseDem();
            obj.Demo2();

        }// End OF main Method
}

class Parent { // parent class start
    public void property() {// propert method start
        System.out.println("this is my parents property");
    }// property method finished
} // parent class end
    class Children extends Parent{ // children class start
        public static void main(String[] args){ // start of main method
            Children obj = new Children();
               obj.property();

        } // end of main method
    } // childeren class finished


class GreatParents { // start of my class
    public void BigHouse() { // this is start of my define method
        System.out.println("grand parents home"); } // this is where my Define method ends
    } // end of my first class
class MyParents extends GreatParents { // from where my MyParents class starts from.
        public static void main(String[] args) { // start of my Main method.
            MyParents obj = new MyParents();
            obj.BigHouse();
        } // end of main method
    }

class ifElseDemo {
    public static void main(String[] args) {
        int mark = 45;
        if (mark > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        } }}

        class IfElseDemo2 { //start of my class
            public static void main(String[] args) { // main method starts
                int mark = 100; // Variable used
                if (mark > 50) {
                    System.out.println("LOSE");
                } else { // the else block starts from here.
                    System.out.println("OK");
                }
            }
        }

class IfElsDemo{
    public static void main( String[] args){
        int Apples = 209;
        if (Apples <300){
            System.out.println("Expensive");
        }
        else{
            System.out.println("Good price");
        }

    }
}

class IfElseDemo4 {

    public static void main(String[] args) {
        int mark = 500;
        if (mark < 50){

            System.out.println("YES");
    } else{System.out.println("no");

        }
    }}

        




















