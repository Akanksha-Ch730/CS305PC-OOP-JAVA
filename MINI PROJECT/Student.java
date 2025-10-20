// Encapsulation and Inheritance
package Student;
class Student extends Person{
	private String id,name,branch,password;
	Student(String n){
		super(n); // Parent class constructor
		this.name = n;
	}
	// getter methods of encapsulation
	public void getID(String id){
		this.id = id;
	}
	public void getBranch(String branch){
		this.branch = branch;
	}
	public void getPassword(String password){
		this.password = password;
	}
	// Dynamic Polymorphism (Method overriding)
	@Override
	public String getDetails(){
		return (id+","+name+","+branch+","+password);
	}

}