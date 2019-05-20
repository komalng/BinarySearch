import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int userInput = Integer.parseInt(args[0]);
        List<Integer> listOfNumbers = Arrays.asList(1, 22, 35, 46, 57, 67, 89, 99, 100, 110, 120);
        int lastIndex = listOfNumbers.size();
        int firstIndex = 0;
        while (firstIndex < lastIndex || lastIndex == 0) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (listOfNumbers.get(middleIndex) == userInput) {
                System.out.println(listOfNumbers.get(middleIndex) + "is in" + middleIndex+"index");
                break;
            }

        }
    }
}
