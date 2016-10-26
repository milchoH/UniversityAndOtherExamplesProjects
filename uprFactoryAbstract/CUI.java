package uprFactoryAbstract;
import java.util.Scanner;
public class CUI extends UI{

	String s;
	
	public CUI(){
		input();
		upperCase();
		printLn();
	}
	public void input() {
	 inputInfo();
		
	}

	public void upperCase() {
	upper();
		
	}

	public void printLn() {
		systemOut();
		
	}
	
	public void inputInfo(){
		
		Scanner i = new Scanner(System.in);
		System.out.println("Molq vavedete  znaci ");
		s = i.nextLine();
		i.close();

	}
	public void systemOut(){
		System.out.println(s);
	}
	public void upper(){
		s=s.toUpperCase();
	}

}
