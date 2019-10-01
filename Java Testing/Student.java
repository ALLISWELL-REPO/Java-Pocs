class Student extends Person
{
	public Student(){
		System.out.println("Student class constructor");	
	}

	public void m1(){
	System.out.println("This is m1() method of Student class");
	}

	public void m3(){
		System.out.println("This is m3() method of Student class");	
	}

	public static void main(String[] args){
		Person p=new Person();
		p.m1();
		p.m2();

		Student s=new Student();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		s.m5();

		Employee e=new Employee();
		e.m1();
		e.m2();
	}
}