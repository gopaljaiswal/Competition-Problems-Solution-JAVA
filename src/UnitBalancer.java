import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class UnitBalancer {

	public static class Pair {
		private Long value;
		private String unit;

		public Pair() {

		}

		public Pair(Long value, String unit) {
			this.value = value;
			this.unit = unit;
		}

		public Long getValue() {
			return value;
		}

		public void setValue(Long value) {
			this.value = value;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String units = bf.readLine();
		String[] unArr = units.split(",");
		int m = unArr.length;

		HashMap<String, Pair> map = new HashMap<String, Pair>();
		ArrayList<String> rightUnit = new ArrayList<String>();
		for (int i = 1; i < m; i++) {
			String s = bf.readLine();
			String[] A = s.split(" ");

			Pair p = new Pair();
			p.setValue(Long.parseLong(A[2]));
			p.setUnit(A[3]);

			rightUnit.add(A[3]);
			map.put(A[0], p);
		}

		String firstUnit = null;
		for (String it : map.keySet()) {
			if (!rightUnit.contains(it)) {
				firstUnit = it;
			}
		}

		System.out.println(getRes(map, firstUnit));
		bf.close();
	}

	public static String getRes(HashMap<String, Pair> map, String firstUnit) {

		String src = firstUnit;
		Pair p = map.get(src);
		String result = "";
		result += 1 + "" + src + " = " + p.getValue() + "" + p.getUnit();

		String prevUnit = p.getUnit();
		Long prevVal = p.getValue();

		while (true) {
			if (!map.containsKey(prevUnit)) {
				break;
			} else {
				Pair p1 = map.get(prevUnit);

				String nxtvUnit = p1.getUnit();
				Long nxtVal = p1.getValue();

				result += " = " + nxtVal * prevVal + "" + nxtvUnit;

				prevUnit = p1.getUnit();
				prevVal = prevVal * p1.getValue();

				// System.out.println(result);
			}
		}

		return result;
	}
}
