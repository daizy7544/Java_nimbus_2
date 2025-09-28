package java_nimbus;

import java.util.ArrayList;
import java.util.List;

public class PartA {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Autoboxing: int → Integer
        numbers.add(Integer.parseInt("10"));
        numbers.add(Integer.parseInt("20"));
        numbers.add(Integer.parseInt("30"));
        numbers.add(Integer.parseInt("40"));

        int sum = calculateSum(numbers);

        System.out.println("Sum of integers: " + sum);
    }

    public static int calculateSum(List<Integer> list) {
        int total = 0;
        for (Integer num : list) {
            // Unboxing: Integer → int
            total += num;
        }
        return total;
    }
}
