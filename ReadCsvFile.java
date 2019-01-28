import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class ReadCsvFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		HashMap<Integer, ArrayList<String>> hmap = new HashMap<Integer, ArrayList<String>>();

		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				"/Users/gopaljaiswal/Desktop/mappingAdId.csv"));
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			String[] arr = line.split(",");
			int a=Integer.parseInt(arr[1]);
			ArrayList list=new ArrayList();
			list.add(arr[0]);
			hmap.put(a, list);
		}
		Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }

	}

}
