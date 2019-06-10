package BinarySearch;
import logic.BinarySearch;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void isUserInputAvailableInTheListOrNot(){
        assertEquals(-1 , BinarySearch.binarySearch(20, Arrays.asList(1,2,3,4,5)));
        assertEquals(-1,BinarySearch.binarySearch(7,Arrays.asList(10,26,90,100)));
        assertEquals(0,BinarySearch.binarySearch(10,Arrays.asList(10,19,21,35,78)));
        assertEquals(3,BinarySearch.binarySearch(45,Arrays.asList(10,19,21,45,78)));
        assertEquals(1,BinarySearch.binarySearch(2,Arrays.asList(1,2,180,1000)));
        assertEquals(1,BinarySearch.binarySearch(2.0,Arrays.asList(1.0,2.0,180.0,1000.0)));
        assertEquals(4,BinarySearch.binarySearch("e",Arrays.asList("a","b","c","d","e")));
        assertEquals(3,BinarySearch.binarySearch("hi",Arrays.asList("at", "from", "hello", "hi", "there", "this")));
    }


}
