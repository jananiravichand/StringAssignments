package StringAssignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "I am a software tester"; 
		
		    String[] splitedTest = str.split(" ");
		    String rev = "";
		   
		    for (int i = 0; i < splitedTest.length; i++) {
		      if (i % 2 == 0) {
		        String[] evenNumberValue = splitedTest;
		        System.out.print(evenNumberValue[i] + " ");
		      } else {
		        
		        char[] charArray = splitedTest[i].toCharArray();
		       
		        for (int j = charArray.length - 1; j >= 0; j--) {
		          rev = rev + charArray[j];
		        }
		        System.out.print(rev + " ");
		        rev = "";
		      }
		    }

		  }

		}