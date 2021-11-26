class Person {
    String name;
    int age;
    Job job;

    Person(String name,int age,Job job){
        this.name=name;
        this.age=age;
        this.job=job;
    }

    public String toString(){
        String display="Name: "+this.name+"\nAge: "+this.age+job;
        return display;
    }
}