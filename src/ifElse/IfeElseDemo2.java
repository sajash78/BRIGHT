package ifElse;

public class IfeElseDemo2 {
    public static void main(String[] args){
        float sugarlevel= 605f;// local variable
        if (sugarlevel>=6.5||sugarlevel>=10.00){// use of logical operator- OR-||)
            System.out.println("Type-1 Diabetes"); // code to execute when one condition is true
            // if block is completed.
        } else {
            System.out.println("NO Diaetes");
        }

    }
}


