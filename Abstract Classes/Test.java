//abstract class
abstract class Base{
	abstract public void greet();
}

class Child extends Base{
    public void greet(){
        System.out.println("Greetings");
    }
}

// in main we can call function greet of base class from child class object
class Test{
    public static void main(String[] args){
        Child c=new Child();
        c.greet();
    }
}