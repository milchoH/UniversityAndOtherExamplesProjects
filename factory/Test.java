package factory;

public class Test {

	public static void main (String args[]){
		
		testFactory();
	}
	
	public static void testFactory(){
		Dinosaur dino1;
		Dinosaur dino2;
		
		try {
			
			dino1= DinoFactory.createDino(Dinosaur.DINO_TREX);
			dino2= DinoFactory.createDino(Dinosaur.DINO_PTERO);
			
			System.out.println("dino1");
			dino1.eat();
			dino1.move();
			dino1.sleep();
			System.out.println("dino2");
			dino2.eat();
			dino2.move();
			dino2.sleep();
		} catch (DinoException e) {
			System.out.println("Error"+e.getMessage());
			e.printStackTrace();
		}
	
	}
}
