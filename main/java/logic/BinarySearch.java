package logic;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int userInput = Integer.parseInt(args[0]);
        System.out.println(binarySearch(userInput,Arrays.asList(1,2,3,4,56)));
    }

    public static int binarySearch(int beSearch,List<Integer> numbers){
        int lastIndex = numbers.size();
        int firstIndex = 0;
        while(firstIndex<lastIndex || lastIndex == 0){
            int middleIndex = getMiddleIndex(lastIndex, firstIndex);
            if(numbers.get(middleIndex) == beSearch){
                return middleIndex;
            }
            else if(numbers.get(middleIndex) >beSearch){
                lastIndex = middleIndex;
            }
            else{
                firstIndex = middleIndex;
            }
        }
        return -1;
    }

    private static int getMiddleIndex(int lastIndex, int firstIndex) {
        return (firstIndex+lastIndex)/2;
    }
}
