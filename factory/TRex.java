package factory;

public class TRex implements Dinosaur, LightDinosaur{

	public void walk(){
		System.out.println("T-Rex walking");
	}
	public void eatMeat(){

		System.out.println("Fresh meat.");
	}
	@Override
	public void move() {
		walk();
		
	}
	@Override
	public void eat() {
		eatMeat();
		
	}
	@Override
	public void sleep() {
		System.out.println("zzzzz");
		System.out.println("weight is:"+Dinosaur.weight);
		
	}
}
