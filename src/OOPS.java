
class User{
	
	//Attributes are property of object not of class
	String name;
	private String phone;// private remains only in the object and cannot be accessed outside,
	String email;
	int age;
	char gender;
	String address;
	
	// Methods: Property of Object not of class
	//Setter Method: For phone attribute
	void setPhone(String p) {//non private method which can be accessed outside
		if(p.length()==10){
			phone=p;
		}else {
			phone="NA";
			System.out.println(">>Invalid Phone number");
		}
	}
	
	//getter Method: for phonea attributes
	String getPhone() {
		return phone;
	}
	
}

//Encapsulation: Making your data private in object so that no one can access it directly!!
//Attribute can be either private or nonprivate i.e default.

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User uRef1=new User();
		uRef1.name="Myname";
		//uRef1.phone="9999999999";
		uRef1.setPhone("9999999999");
		uRef1.email="abc@xyz.com";
		uRef1.age=30;
		uRef1.gender='M';
		uRef1.address="120 hathway";
	
		if(uRef1.email.endsWith(".com")) {
			System.out.println("email is valid,email:"+uRef1.email);
		}else {
			System.out.println("Email is not valid..please check");
		}
		System.out.println("getphone="+uRef1.getPhone());
		

	}

}
