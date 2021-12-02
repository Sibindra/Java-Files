import java.util.Scanner;

class Values{
    String[] names={"Jhon","Hari","Ankit"};
    int index;

    public void inputIndex(){
        Scanner s=new   Scanner(System.in);

        System.out.println("Enter the index of value you want to display: ");
        index=s.nextInt();
    }

    public String displayName(){
        try{
            return names[index];
        }

        catch(Exception c){
            return "Invalid index value the array as "+c;
        }
    }
}

// if index >=3 then exception occurs that is Array out of bound exception so we use exception handling
class Test{
    public static void main(String[] args) {
        Values obj=new Values();

        obj.inputIndex();
        System.out.println(obj.displayName());
    }
}