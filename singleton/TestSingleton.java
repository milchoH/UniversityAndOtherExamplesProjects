package singleton;

public class TestSingleton {
	public static void main (String args[]){
		Special s1= Special.createInstance();
		Special s2= Special.createInstance();
		
		System.out.print("s1="+s1);
		System.out.print("s2="+s2);
	
	}
}
