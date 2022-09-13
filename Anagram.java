import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		//keep:peek
		
		String s1="keep";
		String s2="peek";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		
		
		if(c1.equals(c2))
		{
			System.out.println("yes");
		}else
		{
			System.out.println("no");
		}
			
		
		

	}

}
