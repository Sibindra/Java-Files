class Student {
    
    String name;
    int roll;
    static String collegeName="NCIT";

    // setters 
    public void setName(String name){
        this.name=name;
    }

    public void setRoll(int roll){
        this.roll=roll;
    }

    // getters
    public String getName(){
        return this.name;
    }

    public int getRoll(){
        return this.roll;
    }

    static public String getcollegeName(){
        return collegeName;
    }

}

class Test {
    public static void main(String[] arg){

        Student obj=new Student();

        obj.setName("Hari");
        obj.setRoll(22);

        System.out.println(obj.getName());
        Student.getcollegeName();
    }
}