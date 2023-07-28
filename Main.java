package oopsConcepts;

public class Main {
	public static void main(String[] args) {
		
		// encapsulation
		
		Encapsulation myObj=new Encapsulation();
		//myObj.userName="nikunj";// it will give error as we declared the variable private
		myObj.setUserName("nikunj");
		System.out.println(myObj.getUserName());
		
		//inheritance
		
		Watch myWatch=new Watch();
		
		myWatch.showTime();
		
		System.err.println(myWatch.brandName+" "+myWatch.getModelName());
		
		// polymorphism,overloading,overriding
		Phone ph=new Phone();
		ph.calling();
		ph.calling(982549825);
		ph.calling(98254985, 9825463);
		Phone sph=new SmartPhone();
		sph.calling();
		sph.calling(9854252);
		Phone sw=new SmartWatch();
		sw.calling();
		
		//abstraction
		
		Chepi myRobo=new Chepi();
		myRobo.walking();
		myRobo.running();
		
		//interface
		
		Zues mybot=new Zues();
		mybot.running();
		System.out.println("zues is running with speed of "+mybot.runningSpeed(500));
		
		
		
	}

}
