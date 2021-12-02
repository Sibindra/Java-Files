abstract class Base{

	Base(){
		// System.out.println("Constructor");
	}

	abstract public void greet();
}

class Child extends Base{

    public void greet(){
        System.out.println("Greetings");
    }
}

class Test{

    public static void main(String[] args){
        Child c=new Child();
        c.greet();
    }
}