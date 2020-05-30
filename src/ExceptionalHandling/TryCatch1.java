package ExceptionalHandling;

import java.util.ArrayList;

public class TryCatch1 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

      try {
          System.out.println(numbers.get(3)); }

      catch (Exception e){
          System.out.println("something went wrong");
      }
      finally {
          System.out.println("TRY CATCH BLOCK IS FINISHED");
      }
      System.out.println(numbers.get(2));



    }
}
