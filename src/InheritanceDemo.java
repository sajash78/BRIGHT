
     class Animal{

        public void eat(){
            System.out.println("eating");
        }
    }//super class finished

    class Dog extends Animal{
        public void bark(){
            System.out.println("barking");
        }// define method finished
        public static void main(String[] args){
         Dog obj = new Dog();
         obj.bark();
         obj.eat();

        }
    }

     class Animal1{

         public void eat(){
             System.out.println("eating");
         }
     }//super class finished

     class Dog1 extends Animal1{
         public void bark(){
             System.out.println("barking");
         }// define method finished

        static class SkinnyDog extends Dog1{
             public void kingDog(){
                 System.out.println("Good dog");
             }
        }

         public static void main(String[] args){
             SkinnyDog obj = new SkinnyDog();
             obj.bark();
             obj.eat();
             obj.kingDog();


         }
     }

