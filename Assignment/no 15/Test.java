class Image{
    float length,height;
    String type,color;

    Image(float length,float height,String type,String color){
        this.length=length;
        this.height=height;
        this.type=type;
        this.color=color;
    }

    public String toString(){
        String info=("\nLength: "+this.length+"\nHeight: "+this.height+"\nImage Extension: "+this.type+"\nColor: "+this.color);
        return info;
    }
}

class Product{
    String name;
    int id;
    Image image;

    Product(String name,int id,Image image){
        this.name=name;
        this.id=id;
        this.image=image;
    }

    public String toString(){
        String info=("Name: "+this.name+"\nID: "+this.id+image);
        return info;
    }
}

class Test{
    public static void main(String[] args){
        Image i=new Image(1920,1080,"png","black");
        Product p=new Product("wallpaper",12,i);
        
        System.out.println(p);
    }
}