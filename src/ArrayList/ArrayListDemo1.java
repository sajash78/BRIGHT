package ArrayList;


import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo1 { // START

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add(" volvo");// 0 index
        cars.add("BMW");
        cars.add("ford");
        System.out.println(cars);
        System.out.println(cars.get(0));

        for (String car : cars) {
            System.out.println(car);
        }

    } // end of class


}

    class ArraListDemo2{ // start
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(15);
            numbers.add(26);
            numbers.add(8);

            Collections.sort(numbers);
            //Collections.sort(numbers, Collections.reverseOrder());

            for (int number : numbers) {
                System.out.println(number);
            }
        }
}






























