package MethodOverloading;

public class MethodOverloadingDemo1 { // class start


        public void demo1(int a, int b) {
            System.out.println(a + b);
        }

        public void demo1(int a, int b, int c) {
            System.out.println(a + b + c);
        }

        public static void main(String[] args) {
            MethodOverloadingDemo1 obj = new MethodOverloadingDemo1();
            obj.demo1(10, 20);
            obj.demo1(30, 40, 50);
        }
    }

class MethodOverloadingDemo2 { // class start


    public void demo2(int a, int b) {
        System.out.println(a + b);
    }

    public void demo2( int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 obj = new MethodOverloadingDemo2();
        obj.demo2(50, 20);
        obj.demo2( 30, 40, 50);


    }
}



