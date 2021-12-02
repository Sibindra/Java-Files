// interfaces 
interface Camera{
    void takePicture();
    void recordVideo();
}

interface Wifi{
    void connectNetwork();
}

// classes
class Cell{
    void callNumber(){
        System.out.println("Calling");
    }

    void pickCall(){
        System.out.println("Picking call");
    }
}

// here we acheive multilevel inheritance
class Child extends Cell implements Camera,Wifi{
    public void takePicture(){
        System.out.println("Taking picture");
    }

    public void recordVideo(){
        System.out.println("Recording video");
    }

    public void connectNetwork(){
        System.out.println("Connecting to network");
    }
}

class Test{
    public static void main(String[] args){
        // here making object of child class only we can use interfaces and base class methods
        Child c=new Child();

        c.takePicture();
        c.connectNetwork();
        c.callNumber();
    }
}