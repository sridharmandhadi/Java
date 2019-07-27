import java.util.Scanner;
public class UserInput {
	
   static int sum(int x, int y) {
		
		int sum1= x+y;
		return sum1;
	}
   
   static int sum(int x, int y, int z) {
	   int sum2=x+y+z;
	   return sum2;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner= new Scanner(System.in);
		
		//System.out.println("Enter your input: ");
	//	int x=scanner.nextInt();
		//System.out.println("x="+x);
		//UserInput uref=new UserInput();
		int z=sum(10,20);
		System.out.println("z="+z);
		int b=sum(20,30,40);
		System.out.println("b="+b);
		
				
		

	}

}
