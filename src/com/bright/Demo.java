package com.bright;

public class Demo {
public static void main(String[] args) {
int a = 10;
int b =20;
int c= a+b;
        System.out.println(c);
}}
class JavaExample {
    public static void main(String[] args) {
        byte num;
        num = 113;
        System.out.println(num);
    }}
class NewTown{
    public static void main(String[] args){
        byte num;
        num =50;
        System.out.println(num);
    }}
class stringDemo {
    public static void main(String[] args) {
        String firstname = "Ketan";
        String lastname = "Patel";
        System.out.println(firstname + " " + lastname);
        //System.out.println("ketan" + "patel");
        System.out.println(firstname + lastname);

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("total of a and b="+c);
    }}

class StringDemo1{
    public static void main ( String[] args){
        int Id =20;
        String name = "Saj";
        System.out.println(Id + " "+ name);
    }}
class Student {
    int id = 10;
    String name = "rohit";

    //Example of instance variable access main method
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s1.id);
        System.out.println(s1.name);
    }}
class StudentObjectDemo {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        StudentObjectDemo s2 = new StudentObjectDemo();

        System.out.println(s2.a);
        System.out.println(s2.b);
    }
}
// Example of multiple objects and
    class Student1{
    int id;
    String name;
    public static void main(String[] args){
        Student1 s1= new Student1();
        Student1 s2= new Student1();
        Student1 s3= new Student1();
        s1.id= 20;
        s1.name= "ketan";
        s2.id=30;
        s2.name="saj";
        s3.id=40;
        s3.name="mike";
        System.out.println(s1.id + " "+s1.name);
        System.out.println(s2.id + " "+s2.name);
        System.out.println(s3.id + " "+s3.name);
    }}
    //Example of calling method by object
    class ObjectDemo1{
    int a=10;
    int b= 20;
    int c= a+b;

    public static void main (String[] args){
        ObjectDemo1 obj =new ObjectDemo1();//this is a creation of object
        obj.Demo2();
        obj.Demo1();
        obj.Demo3();
    }
        public void Demo1 (){// this is a user define method
        System.out.println(c);
    } public void Demo2(){
        System.out.println(b-a);
    }
        public void Demo3(){
    }
        }
        class ObjectDemo2{
    public static void main (String[] args) {
        ObjectDemo2 obj = new ObjectDemo2();
        obj.demo2(20,10);
        obj.demo2(30,40);
        obj.demo2(50,60);
    }
    public void demo2(int a, int b){
        System.out.println(a+b);
    }// method with argument.
        }
        class  StudentObjectDemo1a { // different example of obj calling in method.
    int a = 20;
    int b = 100;
    public static void main(String[] args) {
        StudentObjectDemo s3 = new StudentObjectDemo();

        System.out.println(s3.a);
        System.out.println(s3.b);
    }}

    class ObjectDemo5{
    byte a = 100;
    byte b= 126;
    public static void main(String[] args){
        ObjectDemo5 D5 = new ObjectDemo5();

        System.out.println(D5.a);
        System.out.println(D5.b);
    }
    static class ObjectDemo6a{
            int a = 'S';
            int b= 'A';
            public static void main(String[] args) {

                ObjectDemo6a D6 = new ObjectDemo6a();

                System.out.println(D6.a);
                System.out.println(D6.b);}}}

