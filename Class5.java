package myassignment;

public class Class5 {
	
	int id;
	String name;
	int age;	

	//no parameter constructor 
	public Class5()
	{
		System.out.println("Constructor with no parameter");
	}
	
	//1 parameter constructor 
	public Class5(int id)
	{
		this();
		this.id=id;
		System.out.println("Constructor with 1 parameter");
	}
	
	//2 parameter constructor 
	public Class5(int id , int age)
	{
		this(3);
		this.id=id;
		this.age=age;
		System.out.println("Constructor with 2 parameter");
	}
	
	//3 parameter constructor 
	public Class5(int id , int age, String name )
	{
		this(2,24);
		this.id=id;
		this.age=age;
		this.name=name;
		System.out.println("Constructor with 3 parameter");
	}

	public static void main(String[] args) {
      Class5 class5 = new Class5(1,22,"Pooja");

	}

}
