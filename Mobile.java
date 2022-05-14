package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Inside Make Call Method");	
	}
	public void sendMsg() {
		System.out.println("Inside Send Message Method");
	}	
	public static void main(String[] args) {
	Mobile myMob =new Mobile();
	myMob.makeCall();
	myMob.sendMsg();
			
	}	
}