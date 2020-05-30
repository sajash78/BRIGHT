package PractiseHome2;

public class IfElseDemo1 { // start of class
    public static void main(String[] args){
        float wages = 6.5f;
        if (wages> 5.5f){
            System.out.println("PAID OUT");
        }
        else System.out.println("no pay");
    }
}// End of class

class IfElseDemo2 { // start of class changed the variables.

    public static void main(String[] args){
int mark =50;
if (mark<49){
    System.out.println("YES");
}
else {
    System.out.println("NO");
}
    }
}// End of class

 class StaticVariableDemo1 { // Static variable Start of class
    static int a = 10;
    static int b = 20;
    static int c = 10+20;
    public static void main(String[] args){ //you can access to main method
        System.out.println(c);
    }
    public void demo1(){ // you can access to user defined method as well
        System.out.println(c);
    }
}


class ForLoopDemo1 {
    public static void main(String[] args){
        for (int i=3;i<=15;i++){
            System.out.println(i);

        }
    }
}
class ForLoopDemo2{
    public static void main(String[] args){
        for (int a=6;a<=10;a++){
            System.out.println(a);
        }
    }
}
class ConstructorDemo1{
    static ConstructorDemo1 obj; // new practise class
   public ConstructorDemo1(){
       System.out.println("hello");
   } // end of class
    public static void main(String[] args){
       ConstructorDemo1.obj= new ConstructorDemo1();
   }
}

class ConstructorDemo10 {
    public ConstructorDemo10(){
        System.out.println("Constructor demo");
    }
    public static void main(String [] args){
        ConstrutorDemo.ConstructorDemo1 obj = new ConstrutorDemo.ConstructorDemo1();
    }}



class  StaticVariablesDemo1{ // example of local variable/ instant
 public static void main(String[] args){

     int a =1;
     int b =2;
     int c= a+b;
     {
         System.out.println(c);
     }
 }}

class StaticPractise{ // this is instant method and you can change it to static method by adding the word static to it.

   static int a =20;
   static int b = 40;
   static int c = a+b;
   public static void main(String[] args) {
        System.out.println(c);
    }

    static class Practise1{ // instant method example.

        int a =20;
        int b = 40;
        int c = a+b;
        public static void main(String[] args){
            System.out.println(StaticPractise.c);
        }
    }}





