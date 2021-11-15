class Student{

    private String name;
    private int roll;
    private static String collegeName="NCIT";

    public void setName(String name){
        this.name=name;
    }

    public void setRoll(int roll){
        this.roll=roll;
    }

    public void getName(){
        return this.name;
    }

    public void getRoll(){
        return this.roll;
    }

    public void getcollegeName(){
        return collegeName;
    }

}

class Test{
    public static void main(String[] args){
        Student obj=new Student();

        obj.setName("Ramhari");
        obj.setRoll(22);

        System.out.println(getName());
        System.out.println(getRoll());
        Student.getcollegeName();
    }
}