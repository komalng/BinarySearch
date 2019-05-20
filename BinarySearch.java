import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int userInput = Integer.parseInt(args[0]);
        if(binarySearch(userInput) == -1){
            System.out.println(userInput+" is not present in listOfNumbers");
        }
        else{
            System.out.println(userInput+" is present in "+binarySearch(userInput)+" index in listOfNumbers");
        }
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
                lastIndex = middleIndex-1;
            }
            else{
                firstIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
