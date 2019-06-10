package logic;
import java.util.List;


public class BinarySearch {
    public static <T extends Comparable<T>> int binarySearch(T element, List<T> elements) {
        int lastIndex = elements.size()-1;
        int firstIndex = 0;
        while (firstIndex < lastIndex || lastIndex == 0) {
            int middleIndex = getMiddleIndex(lastIndex, firstIndex);
            if (element.compareTo(elements.get(middleIndex))==0) {
                return middleIndex;
            } else if (element.compareTo(elements.get(middleIndex)) < 0) {
                System.out.println();
                lastIndex = middleIndex-1;
            }  else{
                firstIndex = middleIndex+1;
            }
        }
        return -1;
    }


    private static int getMiddleIndex(int lastIndex, int firstIndex) {
        return (firstIndex+lastIndex)/2;
    }
}



