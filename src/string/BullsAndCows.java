package string;

public class BullsAndCows {

	public static String getHint(String secret, String guess) {
		int bulls = 0, cows = 0;
		int[] numbers = new int[10];

		for (int i = 0; i < secret.length(); i++) {
			int s = secret.charAt(i) - '0';
			int g = guess.charAt(i) - '0';

			if (s == g)
				bulls++;
			else {
				if (numbers[s]++ < 0)
					cows++;
				if (numbers[g]++ > 0)
					cows++;
			}
		}
		return bulls + "A" + cows + "B";
	}

	public static void main(String[] args) {
		String secret = "1807";
		String guess = "7810";
		System.out.println(getHint(secret, guess));
	}
}
