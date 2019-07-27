class point{
	
	int x;
	int y;
	
	point() {
		x=10;
		y=20;
	}
	
	point(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println(x+":"+y);
				
	}
	
	void setdetails(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void showpoint() {
		System.out.println(">> point is: "+x+":"+y);
	}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p1=new point();
		point p2=new point();
		point p3=new point();
		point p4=new point(600,700);
		
	//	p1.x=10;
		//p1.y=20;
		
		//p1.showpoint();
		
		p1.setdetails(100, 200);
        p2.setdetails(300, 400);
        
        p1.showpoint();
        p2.showpoint();
        p3.showpoint();
        p4.showpoint();
	}

}
