import java.util.Scanner;

class Test{
    public static void main(String[] args){
        String name;
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the name: ");
        name=s.next(); //nextInt for int;nextFloat for float;next for String

        System.out.println("Name: "+name);

        s.close();
    }
}