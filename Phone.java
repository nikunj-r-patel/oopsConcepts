package oopsConcepts;

class Phone {
	public void calling() {
		System.out.println("calling by Phone");
	}
	public void calling(int num) {
		System.out.println("calling on "+num+" method overloading");
		
	}
	public void calling(int num1,int num2) {
		System.out.println("calling on "+num1+" and "+num2+" method overloading");
		
	}

}
class SmartPhone extends Phone{
	public void calling() {
		System.out.println("calling by SmartPhone by method overriding");
	}
	public void calling(int num) {
		System.out.println("calling on "+num+" by Smart phone by method overriding");
	}
	
}
class SmartWatch extends Phone{
	public void calling() {
		System.out.println("calling by SmartWatch by method overriding");
	}
	
}

