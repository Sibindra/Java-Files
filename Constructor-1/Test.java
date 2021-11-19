class Shape {

    int x,y,l,h;

    // all four value
    public Shape(int x,int y,int l,int h){
        this.x=x;
        this.y=y;
        this.l=l;
        this.h=h;
    }

    // only two value where x=y=0
    public Shape(int l,int h){
        this(0,0,l,h);

    }

    // no value where x=y=0 and l=h=1
    public Shape(){
        this(0,0,1,1);

    }
}

class Test{
    public static void main(String[] args){
        Shape obj1=new Shape(2,3,4,5);
        Shape obj2=new Shape(6,7);
        Shape obj3=new Shape();
    }
}