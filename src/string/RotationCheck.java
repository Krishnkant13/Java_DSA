package string;

public class RotationCheck {

	public static void main(String[] args) {

		String str1="ABCD";
		String str2="BCDA";
		
		if(areRotation(str1, str2))
			System.out.println("Given Sring are Ration of each Other ");
		else
			System.out.println("Given Sring are Ration of each Other ");
	}
	
	public static boolean areRotation(String str1,String str2) {
		if(str1.length()!=str1.length())
			return false;
		String temp = str1+str1;
		return temp.contains(str2);
	}

}
