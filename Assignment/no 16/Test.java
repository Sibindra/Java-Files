import java.util.Scanner;

interface Debit{
    public void getDebit();
}

interface Paypal{
    public void getPaypal();
}

abstract class Amount{
    int total;

    abstract public void totalAmount();
    abstract public void displayAmount();

}

class Payment extends Amount implements Debit,Paypal{
    int cardNo;
    int cvvNo;
    String bankName;
    String email;
    String password;

    Scanner s=new Scanner(System.in);

    public void getDebit(){
        System.out.println("Enter card no: ");
        cardNo=s.nextInt();

        System.out.println("Enter cvv no: ");
        cvvNo=s.nextInt();

        System.out.println("Enter bank name: ");
        bankName=s.next();
    }

    public void getPaypal(){
        System.out.println("Enter Email: ");
        email=s.next();

        System.out.println("Password: ");
        password=s.next();
    }

    public void totalAmount(){
        System.out.println("Enter the total amount for payment: ");
        total=s.nextInt();
    }

    public void displayAmount(){
        System.out.println("\nTotal Amount: "+total);
    }
}

class Test{
    public static void main(String[] args){
        Payment p=new Payment();
        Scanner s=new Scanner(System.in);


        p.totalAmount();

        System.out.println("choose your payment option:\n");
        System.out.println("1.Debit card\n2.Paypal account:");

        int choice=s.nextInt();

        switch(choice){
            case 1:
                p.getDebit();
                p.displayAmount();
                break;

            case 2:
                p.getPaypal();
                p.displayAmount();
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}