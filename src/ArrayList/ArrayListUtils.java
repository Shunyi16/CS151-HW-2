
package ArrayList;

import java.util.ArrayList;

/**
 * Class that provides helper functions for ArrayList
 */
public class ArrayListUtils {

    /**
     * Calculates total sum of all elements in the given array
     *
     * @param arr array list of integers for which we calculate sum
     * @return the total sum of all elements in the array
     */
    public static int sum(ArrayList<Integer> arr) {
        // TODO: implement this method on a separate branch. Should return sum of all elements in the array list

        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }
        return sum;
    }

    /**
     * Calculates average value of all elements in the given array
     *
     * @param arr array list of integers for which we calculate average
     * @return average value of all elements in the array
     */
    public static int mean(ArrayList<Integer> arr) {
        // TODO: implement this method on a separate branch. Should return the average of elements in the array list

        int sum = 0;
        int mean = 0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
            mean = sum/(i+1);
        }
        return mean;

    }
}
