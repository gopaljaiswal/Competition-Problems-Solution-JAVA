import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
 
public class FindFrequencyProblem {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 4, 5, -1, 6, 4 };
        Map<Integer, Integer> frequencyMap = findFrequency(arr);
           System.out.println("Frequency of elements :");
        printMap(frequencyMap);
    }
 
    private static Map<Integer, Integer> findFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            Integer val = map.get(i);
            if (val != null) {
                map.put(i, val + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }
 
    private static void printMap(Map<Integer, Integer> map) {
    	int l=map.size();
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " ->" + map.get(key)+"  "+l);
        }
    }
}