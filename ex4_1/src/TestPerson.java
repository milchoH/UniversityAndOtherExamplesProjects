public class TestPerson{
	
	public static void main(String [] gh){
				
		Person p= new Person("Petja", 22);
		//p.pInfo();
		//p.print();
		System.out.println();
		
	//	PrintInterface pi = new Person("Petja", 22);
	//	pi.print();
		
		Student s= new Student("Ivan", 21, "RU", "KST");
		s.pInfo();
		
		Employee e= new Employee("Parvan", 32, "IBM", 1000);
		e.pInfo();
		
		Person [] mas = new Person[3];
		mas[0]=p;
		mas[1]=s;
		mas[2]=e;
		
		for (int i=0; i<mas.length; i++) {	
			mas[i].pInfo();
			if (i==0) System.out.println();
		} 
	}
}