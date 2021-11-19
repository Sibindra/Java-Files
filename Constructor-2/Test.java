// create 3 constructors , one with both name and roll,other with onlt name and other without initializing value
class Student{
    private String name,roll;

    Student(String name,String roll){
        this.name=name;
        this.roll=roll;
    }

    Student(String name){
        this(name,"xxx");
    }

    Student(){
        this("Jhon","xxx");
    }

    public void display(){
        System.out.println("Name: "+this.name+"\nRoll no: "+this.roll+"\n");
    }
}

class Test{
    public static void main(String[] args){
        Student s1=new Student("Jake","12");
        Student s2=new Student("Ankit");
        Student s3=new Student();

        s1.display();
        s2.display();
        s3.display();
    }
}