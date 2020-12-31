package StringAssignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 String str1 = "stops";
		    String  str2 = "potss";
		    if ( str1.length() ==str2 .length()) {
		      char[] charArray1 =  str1.toCharArray();
		      char[] charArray2 = str2 .toCharArray();
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);
		      int count = 0;
		      for (int i = 0, j = 0; i < charArray1.length; i++, j++) {
		        if (charArray1[i] != charArray2[j]) {
		          count++;
		        }

		      }
		      if (count > 0) {
		        System.out.println("Not an Anagram");
		      } else {
		        System.out.println("Given is an Anagram");
		      }

		    }
		 
	}

}
