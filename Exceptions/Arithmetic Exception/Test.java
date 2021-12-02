import java.util.Scanner;

class Test{
    static int a,b;

    public static void input(){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a: ");
        a=s.nextInt();

        System.out.println("Enter b: ");
        b=s.nextInt();
    
    }
    // exception occuurs when b=0 ie.Arithmetic exception if it is not handled
    // exception stops executing of remaining lines
    public static int display(){
        // try this if it works
        try{
            return a/b;
        }

        // else catch the exception with catch
        catch(Exception e){
            // here e shows the reason for the exception in this case : Arithmetic Exception
            System.out.println("Failed to run as: "+e);
            return 0;
        }
    }

    public static void main(String[] args){
        input();
        System.out.println("Output= "+display());
    }
}