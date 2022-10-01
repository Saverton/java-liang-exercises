/** Program to perform various operations to ArrayLists of Number objects.
 * 
 * @author Scott M.
 * NumberList.java
 */

import java.util.ArrayList;

public class NumberList {
    /** Main method to run program. */
    public static void main(String[] args) {
        ArrayList<Number> nums = new ArrayList<>();
        nums.add(new Integer(100));
        nums.add(new Double(43.5));
        nums.add(new java.math.BigDecimal("46.4968902030"));
        nums.add(new Float(72.356));
        nums.add(new java.math.BigInteger("34959202039"));
        
        System.out.println(nums);
        shuffle(nums);
        System.out.println(nums);
        sort(nums);
        System.out.println(nums);
    }
    
    /** Method to shuffle an ArrayList
     * @params Array list of Numbers */
    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int swap = (int)(Math.random() * list.size());
            Number temp = list.get(i);
            list.set(i, list.get(swap));
            list.set(swap, temp);
        }
    }
    
    /** Method to sort an ArrayList of Number objects
     * @params Array List of Numbers */
    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < list.get(index).doubleValue()) {
                    index = j;
                }
            }
            Number temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
    }
    
    /** Method to find the max element in a list of Number objects.
     * @params List of Numbers
     * @return Max element
     */
    public static Number max(ArrayList<Number> list) {
        try {
            int maxIndex = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(maxIndex).doubleValue() < (list.get(i)).doubleValue())
                    maxIndex = i;
            }
            return list.get(maxIndex);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return null;
        }
    }
}