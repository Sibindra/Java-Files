// creating a exception class by extending orignal exception class
class invalidAgeException extends Exception{
	invalidAgeException(String msg){
		// msg from orignal Exception class
		super(msg);
	}
}

// exception class has default methods such as getMessage(),toString(),printStackTrace() 

class Voter{
	String name;
	int age;

	// throws 
	Voter(String name,int age) throws invalidAgeException{
		if (age<18){
			// prividing msg as invalid age
			// throw
			throw new invalidAgeException("Invalid Age!");
		}

		else{
			this.name=name;
			this.age=age;
		}
	}
}

class Test{
	public static void main(String[] args) {
		try{
			Voter v=new Voter("Jhon",12);
		}

		catch(invalidAgeException e){
			System.out.println(e.getMessage());
		}
	}
}