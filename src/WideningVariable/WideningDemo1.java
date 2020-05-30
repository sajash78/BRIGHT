package WideningVariable;

public class WideningDemo1 {
    public static void main(String[] args){
        byte b = 100;
        float f = b;
        System.out.println(b);
        System.out.println(f);
    }
}

 class NarrowingDemo {
    public static void main(String[] args){
        float f  = 25.3f;
        int a = (int) f;
        System.out.println(f);
        System.out.println(a);
    }
}