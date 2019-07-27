import java.lang.StringBuilder;
public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Hello");
		String x=str.concat(" World");
		System.out.println("str is:" +str);
		System.out.println(x);
		
		String s = "Java";
		StringBuilder buffer = new StringBuilder(s);  //Object creation
		//change(buffer);
		buffer.append("world");

		//   System.out.println("What's strBuf.charAt(5)? " + strBuf.charAt(3));
		   System.out.println(buffer); 
		

	}


}
