/**
 * 
 */
package New_Code_Tym;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Stats {

	// static ConcurrentHashMap<String, Integer> mapCount = new
	// ConcurrentHashMap<String, Integer>();
	// static ConcurrentHashMap<String, Double> mapSum = new
	// ConcurrentHashMap<String, Double>();
	static HashMap<String, Integer> mapCount = new HashMap<String, Integer>();
	 static HashMap<String, Double> mapSum = new HashMap<String, Double>();

	// HashMap<String, Double> mapAgg = new HashMap<String, Double>();
	public static class StatisticsAggregatorImpl implements
			StatisticsAggregator {

		@Override
		public void putNewPrice(String symbol, double price) {
			// YOUR CODE HERE
			if (mapCount.containsKey(symbol) == true) {
				int count = mapCount.get(symbol);
				mapCount.put(symbol, count + 1);
				mapSum.put(symbol, mapSum.get(symbol) + price);
			} else {
				mapCount.put(symbol, 1);
				mapSum.put(symbol, price);
			}
		}

		@Override
		public double getAveragePrice(String symbol) {
			// YOUR CODE HERE
			if (mapSum.containsKey(symbol) == true)
				return mapSum.get(symbol) / mapCount.get(symbol);
			return 0.0;
		}

		@Override
		public int getTickCount(String symbol) {
			// YOUR CODE HERE
			if (mapCount.containsKey(symbol) == true)
				return mapCount.get(symbol);
			return 0;
		}
	}// YOUR CODE HERE

	// //////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(String.format("%s %.4f %d", symbol,
						stats.getAveragePrice(symbol),
						stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}
