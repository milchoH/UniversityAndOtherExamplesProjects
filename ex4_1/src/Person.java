public class Person extends PrintAdapter {

	String name;
	int age;	

	Person() {} // необходимо е да се дефинира макар и с празно тяло 
	  			// за конструктора на клас Employee
		  		// поради наличието на Person(String n, int a)
	Person(String n, int a){
		name=n;
		age=a;
	}	

	void pInfo(){ 
		System.out.print(name+" "+age+" ");
	}
	
}

class Student extends Person{

	String uni;
	String profile;	
	
	Student(String n, int a, String u, String p){
		super(n,a);
		uni=u;
		profile=p;	
	}

	void pInfo(){
		super.pInfo();
		System.out.println(" "+uni+" "+profile);
	}
}

class Employee extends Person{
	
	String firm;
	float salary;	

	Employee(String n, int a, String f, float s){
		name=n; 
		age=a;
		firm=f;
		salary=s;
	}

	void pInfo(){
		super.pInfo();
		System.out.println(" "+firm+" "+salary);
	}	
	
}
