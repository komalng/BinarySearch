package BinarySearch;
import logic.BinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void isUserInputAvailableInTheListOrNot(){
        assertEquals(-1 , BinarySearch.binarySearch(20));
        assertEquals(6,BinarySearch.binarySearch(7));
        assertEquals(0,BinarySearch.binarySearch(1));
        assertEquals(1,BinarySearch.binarySearch(2));
    }


}
