package logic;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int userInput = Integer.parseInt(args[0]);
        System.out.println(binarySearch(userInput));
    }

    public static int binarySearch(int number){

        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7);

        int lastIndex = listOfNumbers.size();
        int firstIndex = 0;
        while(firstIndex<lastIndex || lastIndex == 0){
            int middleIndex = (firstIndex+lastIndex)/2;
            if(listOfNumbers.get(middleIndex) == number){
                return middleIndex;
            }
            else if(listOfNumbers.get(middleIndex) >number){
                lastIndex = middleIndex;
            }
            else{
                firstIndex = middleIndex;
            }
        }
        return -1;
    }
}
