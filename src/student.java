class statickey{
	int roll;
	String name;
	static String teachername;
	
	void showstudentdetails() {
		System.out.println(">>"+roll+" belongs to "+name+ " and "+teachername);
	}
}



public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		statickey s1=new statickey();
		statickey d2=new statickey();
		s1.roll=100;
		s1.name="sri";
		statickey.teachername="sri1";
		s1.showstudentdetails();
		d2.roll=200;
		d2.name="sri2";
		d2.teachername="sri3";
		d2.showstudentdetails();
		statickey d3=new statickey();
		d3.roll=300;
		d3.name="sam";
		d3.showstudentdetails();
		

	}

}
