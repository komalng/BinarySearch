package BinarySearch;
import logic.BinarySearch;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void isUserInputAvailableInTheListOrNot(){
        assertEquals(-1 , BinarySearch.binarySearch(20, Arrays.asList(1,2,3,4,5)));
        assertEquals(6,BinarySearch.binarySearch(7,Arrays.asList(5,7,1,0,10,3)));
        assertEquals(0,BinarySearch.binarySearch(1,Arrays.asList(12,18,19,10)));
        assertEquals(1,BinarySearch.binarySearch(2,Arrays.asList(2,19,10,1)));
    }


}
