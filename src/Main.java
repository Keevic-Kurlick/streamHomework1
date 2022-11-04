import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> posValues = new ArrayList<>();
        intList.forEach(number -> {
            if (number > 0) {
                posValues.add(number);
            }
        });

        List<Integer> evenNumbers = new ArrayList<>();
        posValues.forEach(number -> {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        });
        evenNumbers.sort(Comparator.naturalOrder());

        evenNumbers.forEach(System.out::println);
    }
}