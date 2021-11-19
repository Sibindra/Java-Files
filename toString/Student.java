// overwride toString method to display the information of Student
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