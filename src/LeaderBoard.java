import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class LeaderBoard {

	public static HashMap<String, User> map;
	public static TreeMap<UserScroe, String> treeMap;

	public static void main(String[] args) throws Exception {
		map = new HashMap<String, LeaderBoard.User>();
		treeMap = new TreeMap<UserScroe, String>(new ScoreCompr());

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] s = bf.readLine().split(",");

			if (s[0].equals("exit()")) {
				System.out.println("exit() call");
				return;
			}

			if (s[0].equals("UPSERT_USER")) {

				String name = s[1];
				String country = s[2];
				String email = s[3];
				if (email.isEmpty()) {
					System.out.println("please enter email id");
				} else {
					User user = new User(name, country, email);
					upsertUser(user);
				}

			} else if (s[0].equals("UPSERT_SCORE")) {
				String email = s[1];
				Integer score = Integer.parseInt(s[2]);

				upsertScore(email, score);

			} else if (s[0].equals("GET_TOP")) {

				Integer K = Integer.parseInt(s[1]);
				getTopK(K);

			} else if (s[0].equals("GET_USERS_WITH_SCORE")) {
				Integer N = Integer.parseInt(s[1]);
				getuserWithScore(N);

			} else if (s[0].equals("SEARCH")) {
				String name = s[1];
				String country = s[2];
				String email = s[3];

				serachUser(name, country, email);
			}
		}
	}

	// upsert user
	public static void upsertUser(User user) {
		map.put(user.getEmail(), user);
		System.out.println(map);
	}

	// upsert score
	public static void upsertScore(String email, int score) {
		UserScroe userScroe = new UserScroe(email, score);
		if (map.containsKey(email)) {
			treeMap.put(userScroe, email);
		}
		System.out.println(map);
		System.out.println(treeMap);
	}

	// get top K
	public static void getTopK(int K) {

		int i = 0;
		if (treeMap.size() == 0) {
			System.out.println("No User for score");
			return;
		}

		System.out.print("Top " + K + " users are ");
		Set<UserScroe> keys = treeMap.keySet();
		for (UserScroe key : keys) {
			System.out.print(i + 1 + "." + key.getEmail() + " ");
			i++;
			if (K == i) {
				break;
			}
		}
		System.out.println();
	}

	// get user with score N
	public static void getuserWithScore(int N) {
		int i = 0;

		Set<UserScroe> keys = treeMap.keySet();
		for (UserScroe key : keys) {
			i++;
			UserScroe userScroe = key;
			if (userScroe.getScore() == N) {
				System.out.print(i + "." + userScroe.getEmail() + " ");
			}
		}
		System.out.println();
	}

	// search user info
	public static void serachUser(String name, String country, String email) {
		Boolean serNameFlag = false;
		Boolean setCountryFlag = false;
		Boolean serEmailFlag = false;

		if (name != null) {
			serNameFlag = true;
		}
		if (country != null) {
			setCountryFlag = true;
		}
		if (email != null) {
			serEmailFlag = true;
		}
		
		for (Entry<String, User> entry : map.entrySet()) {
			User user = entry.getValue();
			//System.out.println(user);
			if (user.getName().equals(name)
					&& user.getCountry().equals(country)
					&& user.getEmail().equals(email)) {
				System.out.print(user.getEmail() + ",");
			}
		}
	}

	// ScoreComparator
	public static class ScoreCompr implements Comparator<UserScroe> {
		@Override
		public int compare(UserScroe a, UserScroe b) {
			if (a.getScore() < b.getScore()) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	// UserScore class
	public static class UserScroe {
		private String email;
		private Integer score;

		public UserScroe(String email, Integer score) {
			this.email = email;
			this.score = score;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getScore() {
			return score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}
	}

	// user class
	public static class User implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 614319720137523311L;

		private String name;
		private String country;
		private String email;

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(String name, String country, String email) {
			super();
			this.name = name;
			this.country = country;
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", country=" + country + ", email="
					+ email + "]";
		}

	}

}
