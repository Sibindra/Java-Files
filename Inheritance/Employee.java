class Employee {
    String name;
    int id,salary;

    Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public int getSalary(){
        return this.salary*12; // return yearly salary
    }
}