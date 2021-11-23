class Test {
    public static void main(String[] args){
        Employee e=new Employee("Jhon",01,1000);
        Teacher t=new Teacher("Atul",33,10000,12);

        System.out.println("Employee salary: "+e.getSalary()+"\n"+"Teacher salary: "+t.getSalary());
    }
}