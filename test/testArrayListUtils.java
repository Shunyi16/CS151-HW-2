import java.lang.reflect.Array;
import java.util.ArrayList;
import static ArrayList.ArrayListUtils.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testArrayListUtils {
    @Test
    public void testSum(){
        ArrayList <Integer> myarr = new ArrayList<>();
        myarr.add(0);
        myarr.add(1);
        myarr.add(2);
        myarr.add(3);
        assertEquals(sum(myarr), 6, "sum result should be 6");
    }

}
