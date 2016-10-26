package factory;

public class Pterodactyl implements Dinosaur{


	public void move() {
		fly();
		
	}


	public void eat() {
	
		eatVegi();
	}


	public void sleep() {

		System.out.println("Ptero sleepss");
		
	}
	public void fly(){

		System.out.println("Ptero fliessssss");
	}
	public void eatVegi(){
		System.out.println("6opka salataaa");
	}
}
