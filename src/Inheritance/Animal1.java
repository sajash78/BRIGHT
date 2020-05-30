package Inheritance;

public class Animal1 {
    public void eat(){
            System.out.println("eating");
        }
    }//super class finished

    class Dog extends Animal1 {
        public void bark() {
            System.out.println("barking");
        }// define method finished
    }
        class BabyDog1 extends Dog {
            public void weeping(){
                System.out.println("weeeping");
            }
            public static void main(String[] args){
            BabyDog1 obj = new BabyDog1 ();
            obj.weeping();
            obj.bark();
            obj.eat();
        }
        }
