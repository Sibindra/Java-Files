// overwride toString method to display the information os Student
class Student{
	private String roll,name;

	Student(String name,String roll){
		this.name=name;
		this.roll=roll;
	}

	// toString exists by automatically like constructors ,here we overwride it
	public String toString(){
		String info="Name: "+this.name+"\nRoll no: "+this.roll;
		return info;
	}
}

class Test{
	public static void main(String[] args) {
		Student s=new Student("Manish","xxx");
		// toString is called when object is printed
		System.out.println(s);
	}
}