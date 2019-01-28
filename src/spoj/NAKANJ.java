/**
 * 
 */
package spoj;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.LinkedList;

/**
 * @author gopaljaiswal
 *
 */
class NAKANJ {
	public static void main(String[] args) throws Exception {
		Parser in = new Parser(System.in);
		int T = in.nextInt();
		while (T > 0) {
			String[] idx = new String[2];
			idx[0] = in.next();
			idx[1] = in.next();

			Pair stpt = new Pair(((int) (idx[0].charAt(0) - 'a')),
					((int) (idx[0].charAt(1)) - '1'), 0);

			Pair endpt = new Pair((int) (idx[1].charAt(0) - 'a'),
					(int) (idx[1].charAt(1)) - '1', 0);
			getRes(stpt, endpt);
			T--;
		}
	}

	public static void getRes(Pair stPt, Pair endPt) {
		LinkedList<Pair> queue = new LinkedList<Pair>();
		boolean[][] visited = new boolean[8][8];

		int[] one = { -1, 1 };
		int[] two = { -2, 2 };
		queue.add(new Pair(stPt.getxIdx(), stPt.getyIdx(), 0));

		while (queue.size() > 0) {
			Pair stPt1 = queue.poll();
			int x = stPt1.getxIdx();
			int y = stPt1.getyIdx();
			int cost = stPt1.getCost();

			if (x < 0 || y < 0 || x > 7 || y > 7) {
				continue;
			}

			// out.println(x + " " + y);

			if (visited[x][y] == true) {
				continue;
			}

			if (x == endPt.getxIdx() && y == endPt.getyIdx()) {
				System.out.println(cost);
				break;
			}

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					queue.add(new Pair(x + one[i], y + two[j], cost + 1));
					queue.add(new Pair(x + two[i], y + one[j], cost + 1));
				}
			}
			visited[x][y] = true;
		}
	}
}

class Pair {
	private Integer xIdx;
	private Integer yIdx;
	private Integer cost;

	public Pair() {

	}

	public Pair(Integer x, Integer y, Integer cost) {
		this.xIdx = x;
		this.yIdx = y;
		this.cost = cost;
	}

	public Integer getxIdx() {
		return xIdx;
	}

	public void setxIdx(Integer xIdx) {
		this.xIdx = xIdx;
	}

	public Integer getyIdx() {
		return yIdx;
	}

	public void setyIdx(Integer yIdx) {
		this.yIdx = yIdx;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}
}

class Parser {
	final private int BUFFER_SIZE = 1 << 16;

	private DataInputStream din;
	private byte[] buffer;
	private int bufferPointer, bytesRead;

	public Parser(InputStream in) {
		din = new DataInputStream(in);
		buffer = new byte[BUFFER_SIZE];
		bufferPointer = bytesRead = 0;
	}

	public long nextLong() throws Exception {
		long ret = 0;
		byte c = read();
		while (c <= ' ')
			c = read();
		boolean neg = c == '-';
		if (neg)
			c = read();
		do {
			ret = ret * 10 + c - '0';
			c = read();
		} while (c > ' ');
		if (neg)
			return -ret;
		return ret;
	}

	// reads in the next string
	public String next() throws Exception {
		StringBuilder ret = new StringBuilder();
		byte c = read();
		while (c <= ' ')
			c = read();
		do {
			ret = ret.append((char) c);
			c = read();
		} while (c > ' ');
		return ret.toString();
	}

	public int nextInt() throws Exception {
		int ret = 0;
		byte c = read();
		while (c <= ' ')
			c = read();
		boolean neg = c == '-';
		if (neg)
			c = read();
		do {
			ret = ret * 10 + c - '0';
			c = read();
		} while (c > ' ');
		if (neg)
			return -ret;
		return ret;
	}

	private void fillBuffer() throws Exception {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if (bytesRead == -1)
			buffer[0] = -1;
	}

	private byte read() throws Exception {
		if (bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}
}