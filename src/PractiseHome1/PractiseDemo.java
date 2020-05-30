package PractiseHome1;

public class PractiseDemo { //  start of  my class
    public static void main(String[] args){ // local variable home work
        int a =5;
        int b =10;
        int c =( a+b);
    System.out.println(c); }

} // end of class

class ifElseDemo{ // start of my ifElse  home work
 public static void main(String[] args){ // start of my variables
 int HIGHWAY = 20;
 if (HIGHWAY>21){
     System.out.println("Wrong highway");
 }
     else{ // else class start
         System.out.println("righ highway");
 } // end of else class
 } // class ends
}
class ForLoop{ // start of forloop home work
    public static void main( String[] args){
        for( byte a=20;a<25;a++){
            System.out.println(a);
        }
    }
}

class ForLoopDemo1 { // start

    public static void main(String[] args){ // method starts
        for (int a=10;a<=15;a++)
        {
            System.out.println(a);
        }

    } // method  ends
} // end

class ConstructorDemoA { // constructor home work
    public ConstructorDemoA(){
        System.out.println("constructorDemo");

    }
    public static void main(String [] args){
        ConstructorDemoA obj = new ConstructorDemoA();

    }
}




    class  Objectcalling{
public static void main (String[] args) { //call the object in main method.
        Objectcalling obj = new Objectcalling();
        obj.demo2(10,20);
        obj.demo2(30,40);
        obj.demo2(50,60);
        }
public void demo2(int a, int b){
        System.out.println(a+b);
        }// method with argument.
        }

        //Example of calling method by object
class ObjectDemo01{
    int a=10;
    int b= 20;
    int c= a+b;

    public static void main (String[] args){
        ObjectDemo01 obj =new ObjectDemo01();//this is a creation of object
        obj.Demo2a();
        obj.Demo2a();
        obj.Demo2a();
    }
    public void Demo1a (){// this is a user define method
        System.out.println(c);
    }
    public void Demo2a(){
        System.out.println(b-a);
    }
    public void Demo3a(){
    }
}