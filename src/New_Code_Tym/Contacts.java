/**
 * 
 */
package New_Code_Tym;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gopaljaiswal
 *
 */
public class Contacts {

	public static class TrieNode {

		Map<Character, TrieNode> children;
		int size;

		public TrieNode() {
			children = new HashMap<Character, TrieNode>();
			size = 0;
		}
	}

	public static TrieNode root;

	public static void insert(String s) {
		TrieNode curr = root;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			curr.children.putIfAbsent(ch, new TrieNode());
			curr = curr.children.get(ch);
			curr.size++;
		}
	}

	public static int search(String s) {
		TrieNode curr = root;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			TrieNode node = curr.children.get(ch);
			if (node == null) {
				return 0;
			}
			curr = node;
		}
		return curr.size;
	}

	public static void main(String[] args) throws Exception {
		root = new TrieNode();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t-- > 0) {
			String s[] = bf.readLine().split(" ");
			if (s[0].equals("add")) {
				insert(s[1]);
			} else {
				System.out.println(search(s[1]));
			}
		}
		bf.close();
	}

}
