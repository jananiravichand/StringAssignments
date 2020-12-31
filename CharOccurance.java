package StringAssignments;

public class CharOccurance {

	public static void main(String[] args) {
		String str="Welcome to Chennai";
		
		char[] charArray=str.toCharArray();
		int count=0;
		for (int i =  0; i <charArray.length; i++) {
			count=1;
			for (int j =  i+1; j<charArray.length; j++) {
			if ( charArray[i]== charArray[j]) {
				count++;
				 charArray[j]=' ';
			}
			
		}
		if ( charArray[i]!=' ') {
			System.out.println( charArray[i]+"-->"+count);
		}
			
		}
	}
}

