package HomeWork;

import com.sun.tools.javac.Main;

import java.util.concurrent.Callable;

public class HomeWork050420 { // this is Static method
    static int mark =30; // i need the key word static to make it static.
    public static void main(String[] args) {
        userdefinemethod();//call your user define method into main method for static method

    }
    public static void userdefinemethod(){

    switch (mark){
        case 35:
            System.out.println("PASS");
            break;
        case 60:
            System.out.println("FIRST CLASS");
            break;
        case 70:
            System.out.println("Distiction");
            break;
        default:
            System.out.println("FAIL");
    }
    }
}


 class HomeWorkinstant { // this is instant method
    int mark =30; // the word static has been removed for non static method.Also outside of main method.
    public static void main(String[] args) {
        HomeWorkinstant obj = new HomeWorkinstant();// created an obj
        obj.userdefinemethod0();      //called your user define method into main method for instance
    }

    public void userdefinemethod0() {  // no need to put in static word for not static method

        switch (mark){
            case 35:
                System.out.println("PASS");
                break;
            case 30:
                System.out.println("FIRST CLASS");
                break;
            case 70:
                System.out.println("Distiction");
                break;
            default:
                System.out.println("FAIL");
        }
    }
}

class HomeWork1{
    //default Constructor method
    int a= 5;
    int b=10;
    int c=15;
    public HomeWork1(){
        System.out.println(a+b+c);
        System.out.println(a+b-c);

    }
    public static void main(String[] args){
       HomeWork1 obj = new HomeWork1();//create object - no need to called user define in Constructor method
    }

}

class HomeWork{
    //default Constructor method
    int a= 5; // the variable are inside the class but out of any Method!!
    int b=10; // you call have as many variable as you need
    int c=15;
    public HomeWork(){
        System.out.println(a+b+c); // must call each one for different print
        System.out.println(c+b-a); // for this i have 2 print out.

    }
    public static void main(String[] args){
        HomeWork obj = new HomeWork();//create object - no need to called user define in Constructor method
    }}

class Constructor1 {  //Parameterised Constructor
    public Constructor1(int a, int b) { // same as the default method. outside of main method. using define method
        System.out.println(a/b); // using the divide symbol
    }
    public static void main(String[] args){
        Constructor1 obj = new Constructor1(90,3); // calling the object
    }
}

class Constructor2{  //Parameterised Constructor 2
    Constructor2(int a, int b){
        System.out.println(a*b); }
    public static void main(String[] args){
        Constructor2 obj = new Constructor2(4,2);

    }}

class Constructor3{  //Parameterised Constructor 3 this using the +
      Constructor3( int a, int b){
          System.out.println(a+b);}
          public static void main(String[] args){
              Constructor3 obj = new Constructor3( 40,5);
          }
    }



class Demo1{ // example of this method
    int a; // you can call as many variable amount, so i could have extended a few more if wanted.
    int b;

    public Demo1(int a,int b){
        this. a =a; // then  the above variables must be called back in define method and given a value.i.e a=a
        this.b=b;
        System.out.println(a+b);
    }
    public static void main(String[] args){
        Demo1 obj = new Demo1(100,100);// and the Object must be called back in the main method.
    }
}

class bank{   // super class start from example of single inheritance.
    public void bank(){
        System.out.println("this is main bank");

    } // super class has finished.
}
class Hsbc extends bank{ // sub class extends the super class
    public void Hsbc(){ // define method has started.
        System.out.println("This is the Hsbc bank");
    } // end of define method.
    public static void main(String[] args){ // start of the main method..
        Hsbc obj = new Hsbc();
        obj.bank();
        obj.Hsbc();
    } // main method finished
} // Sub class has ended.




class dad {//start of super class or parent class
    public void Father(){
        System.out.println("This is my parents property");
    } // end of super class
}
class Saj extends dad{  //Single Inheritance - child class and calling parent class.

    public void Son(){
        System.out.println("This is my property");
    };
    public static void main(String[] args){
        Saj obj = new Saj();
        obj.Son(); // to change the print out i  could call father before son by swapping obj around.
        obj.Father();
    }}

class Business{  //Multilevel Inheritance - Grandparent class
    public void MONEY(){ // START OF CLASS
        System.out.println("CO-OP");
    } // END OF CLASS
}
class Director extends Business{  //Multilevel Inheritance - Parent class
    public void ORGANIZE(){
        System.out.println("Gives orders");
    }
}
class MANAGER extends Director{ //Multilevel Inheritance - Child class
    public void WORK(){
        System.out.println("we follow ");
    }

public static void main(String[] args){
        MANAGER obj = new MANAGER();
        obj.MONEY();
        obj.ORGANIZE();
        obj.WORK();}}

class Business1{  //Multilevel Inheritance - Grandparent class
    public void MONEY(){ // START OF CLASS
        System.out.println("CO-OP");
    } // END OF CLASS
}
class Director1 extends Business1{  //Multilevel Inheritance - Parent class
    public void ORGANIZE(){
        System.out.println("Gives orders");
    }
}
class MANAGER1 extends Director1{ //Multilevel Inheritance - Child class
    public void WORK(){
        System.out.println("we don not follow we get kicked ");
    }

    public static void main(String[] args){
        MANAGER1 obj = new MANAGER1(); // i tried this without entering 1 after the manager, it gave the above print.
        obj.MONEY();
        obj.ORGANIZE();
        obj.WORK();}}



     class MainLead { // start of my Hierarchy class demo, main parent
    public void mainBoss() {
        System.out.println(" THIS is top man");
    }
} // end of the above class

    class Second extends MainLead { // child 1
        public void Lead() {
            System.out.println("Second man");
        }
    }
        class Third extends MainLead{ // child 2
            public void subLead(){
                System.out.println( "He does the running" );
            }
            public static void main(String[] args){
            Third obj = new Third();
            obj.mainBoss();
            obj.subLead();
        }
            }


