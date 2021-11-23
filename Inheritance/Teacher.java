class Teacher extends Employee{
    int nSub; //n number of subjects

    Teacher(String name,int id,int salary,int nSub){
        // super calls the constructor of parent class
        super(name,id,salary); //must be in first line
        this.nSub=nSub;
    }

    public int getSalary(){
        // teacher has bonus hence
        int bonus=this.nSub*100;
        salary=this.salary*12;
        int total=salary+bonus;

        return total;
    }

}