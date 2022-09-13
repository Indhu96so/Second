
public class Reverse {

	public static void main(String[] args) {

/*  Method -01
		String s="Indhumathi";
		char c;
		String out="";
		
		for(int i=0;i<s.length();i++)
			{
			c=s.charAt(i);
			out=c+out;
		}
		System.out.println(out);
*/
		
		
		//method-02--->stringbuilder
/*		String s="Indhumathi";
		int length=s.length();
		StringBuilder sb=new StringBuilder();
		
		for(int i=length-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		
		System.out.println(sb);
*/		
		
		//method -03----->Array
		
/*		String s="Indhumathi";
		
		char arr[]=s.toCharArray();		
		char arr2[]=new char[arr.length];
		int count=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			arr2[count]=arr[i];
			count++;
		}
		System.out.println(arr2);
*/		
		
		//method 04------>inbuilt function
		
		String s="Indhumathi";
		StringBuilder sb=new StringBuilder(s);
		
		System.out.println(sb.reverse());
		
		
		
		
		
		
		
		
		
	}

}
