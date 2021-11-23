class Person{
	String name;
	int age;
	Job job; //job is a user-defined data-type ie class and job is its variable

	Person(String name,int age,Job job){
		this.name=name;
		this.age=age;
		this.job=job;
	}

	public String toString(){
		String display="Name: "+this.name+" Age: "+this.age;
		return display;
	}
}