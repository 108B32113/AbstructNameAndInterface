// Ex11_12
interface iVolme{
    public void showData(); // 顯示球體的資料
    public double vol(); // 計算球體積
}
abstract class Sphere implements iVolme{ // could use abstract to inherite implements from super...
    final double PI=3.14;
    protected int x;
    protected int y;
    protected int r;

    //because it got implements so it has to obbey contract
    public void showData(){ // mothod of been implemented  
        System.out.println("球心:" + "(" + x + ", " + y + ")");
        System.out.println("半徑:" + r);
        System.out.println("求體積:" + vol()); //  could directly use methodName
        
    }
    Sphere(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public abstract double vol(); // ### if it wants add a non-defined that it will added a abstract method and get a method to been added null statement
}




class Circle extends Sphere{
    // 請完成這個部分的程式
    protected int r;

    Circle(int x, int y, int r){
        super(x, y, r); // super could not add "."
    }

    public double vol(){
        // can't use public modifier in method
        return (4/3) * PI * (r*r*r);
    }
}

public class Class12 {
    public static void main(String[] args){
        Circle c1 = new Circle(8,6,2); // (8,6) = center of the sphere
        c1.showData();
    }
}








// V(球體積) = (4/3)*PI*r^3