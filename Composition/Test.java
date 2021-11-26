class Test {
    public static void main(String[] args){
        Job j=new Job("Manager",40000);
        Person p=new Person("Jhon",32,j);

        System.out.println(p);
        System.out.println(j);
    }
}