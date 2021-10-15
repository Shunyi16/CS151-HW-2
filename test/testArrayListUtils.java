import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static ArrayList.ArrayListUtils.mean;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testArrayListUtils {
    @Test
    public void testMean(){
        ArrayList <Integer> myarr = new ArrayList<>();
        myarr.add(1);
        myarr.add(1);
        myarr.add(2);
        myarr.add(4);
        assertEquals(mean(myarr), 2, "sum result should be 2");
    }
}
