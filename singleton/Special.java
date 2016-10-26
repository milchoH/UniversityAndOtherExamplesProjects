package singleton;

public class Special {
	public static Special instance=null;
	private Special(){
		
		System.out.println("creating an object of class Special");
	}
	public static Special createInstance(){
		if(instance==null){
			instance = new Special();
		}
		return instance;
	}
}
