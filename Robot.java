package oopsConcepts;

public abstract class Robot {
	public abstract void walking();
	public void running() {
		System.out.println("robot is running");
	}
	

}
class Chepi extends Robot{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("Chepi is walking");
	}
	
}
class Zues implements WarRobo{

	@Override
	public void running() {
		// TODO Auto-generated method stub
		System.out.println("Zues is running");
	}

	@Override
	public int runningSpeed(int speed) {
		// TODO Auto-generated method stub
		
		return speed;
	}
	
}
