package string;

public class LongestCommanPrefix {
	public static String comman(String s1, String s2) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
			if (s1.charAt(i) == s2.charAt(i))
				sb.append(s1.charAt(i));
			else
				break;
		}
		return sb.toString();
	}
	
	public static String commanPrefix(String[] strs) {
		
		String res=strs[0];
		for (int i = 1; i < strs.length; i++) {
			res=comman(res, strs[i]);
			
		}
		return res;
	}

	public static void main(String[] args) {
		String[] strs= {"krishn","krvita","krish"};
		System.out.println(commanPrefix(strs));
	}

}
