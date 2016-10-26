package uprFactoryAbstract;

public class Test {
	public static void main (String[] args){
		UI ui = StringFactory.createProg(4);
		ui.input();
		ui.upperCase();
		ui.printLn();
	}
}
