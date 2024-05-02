package string;

public class CountAndSay {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(countandSay(n));
	}

	public static String countandSay(int n) {
		if (n == 1)
			return "1";

		String s = countandSay(n - 1);
		int counter = 0;
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			counter++;
			if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
				res.append(counter).append(s.charAt(i));
				counter = 0;
			}
		}
		return res.toString();
	}
}
