// WAP to get a name, rollno and faculty from the user and write it to a file named Student
import java.io.*;
import java.util.*;

class Test{
    public static void main(String[] args) throws IOException{
        Scanner s=new Scanner(System.in);

        FileOutputStream fos=new FileOutputStream("Records.dat");
        DataOutputStream dos=new DataOutputStream(fos);

        do{
            System.out.println("Enter name: ");
            String name=s.next();

            System.out.println("Enter roll no: ");
            int roll=s.nextInt();

            System.out.println("Enter Faculty: ");
            String faculty=s.next();

            dos.writeUTF(name);
            dos.writeInt(roll);
            dos.writeUTF(faculty);

            System.out.println("Press any key to continue! (yes/no)");
            String prompt=s.next();

        }while(!prompt.toLowercase().equals("no"));
    
        fos.close();
        dos.close();
        s.close();
    }
}