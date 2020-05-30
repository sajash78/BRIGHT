package SwitchDemo;

public class SwitchDemo2 {
    public static void main (String[] args){
        int age =18;
        switch(age){
            case 16:
         System.out.println("you are under 18");
         break;
         case 18:
         System.out.println(" you can vote");
         //break;
            case 25:
                System.out.println("above 18");
                //break;
            default:
                System.out.println("YOU ARE NOT Eligible for vote");
        }
    }}


