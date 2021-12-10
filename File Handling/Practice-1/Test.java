// WAP to get a name, rollno and faculty from the user and write it to a file named Student
import java.io.*;
import java.util.Scanner;

class Test{
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);

        String prompt;

        FileOutputStream fos=new FileOutputStream("record.txt");
        DataOutputStream dos=new DataOutputStream(fos);

        do{
            System.out.println("Enter the name: ");
            String name=s.next();

            System.out.println("Enter the roll no: ");        
            int roll=s.nextInt();

            System.out.println(("Enter the faculty: "));
            String faculty=s.next();

            dos.writeUTF(name);
            dos.writeInt(roll);
            dos.writeUTF(faculty);

            System.out.println("Enter no to exit and anyother key to continue!");
            prompt=s.next();

        } while(prompt.toLowerCase().equals("no"));

        // closing 
        fos.close();
        dos.close();
        s.close();
    }
}