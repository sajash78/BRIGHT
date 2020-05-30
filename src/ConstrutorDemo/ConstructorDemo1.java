package ConstrutorDemo;
// Example of de

import com.bright.Demo;

public class ConstructorDemo1 {
    public ConstructorDemo1(){
        System.out.println("Constructor demo");

    }
    public static void main(String [] args){
        ConstructorDemo1 obj = new ConstructorDemo1();

    }
}


 class ConstructorDemo2 { // another example of defult Construtor
    public ConstructorDemo2(){
        System.out.println(" example demo");

    }
    public static void main(String [] args){
        ConstructorDemo1 obj = new ConstructorDemo1();

    }
}

class Demo2{

    public Demo2(int a, int b){
        System.out.println(a/b);
    }
    public static void main(String[] args){
        Demo2 obj= new Demo2(100, 20);
        Demo2 obj1= new Demo2(200, 40);

    }
}

class Demo3{ // example of parameterised constructor.

    public Demo3(int a, int b){
        System.out.println(a/b);
    }
    public static void main(String[] args){
        Demo2 obj= new Demo2(100, 20);
        Demo2 obj1= new Demo2(200, 40);

    }
}
//example of access instance by this keyword with parameterise construction
class Demo4{
    int a;
    int b;
    public Demo4(int a, int b){

        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }
    public static void main (String[] args){

    }
}

class Demo5{
    int a;
    int b;
    public Demo5(int a, int b){

        a=a;
        b=b;
        System.out.println(a+b);
    }
    public static void main (String[] args){

    }
}

