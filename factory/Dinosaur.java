package factory;

public interface Dinosaur {
		
		public static final int DINO_TREX=1;
		public static final int DINO_PTERO=2;
		
		public void move();
		public void eat();
		public void sleep();
		public int weight=100;	
}
