// Ex11_1，抽象類別裡建構子
abstract class Caaa{
    protected int num;

    //(a)
    Caaa(int n){
        num = n;
    }

    public abstract void show();
}
class Cbbb extends Caaa{
    //(b)
    Cbbb(int n){
        super(n);
    }

    //(c)
    public void show(){
        System.out.println(num);
    }

}
public class Class01{
    public static void main(String args[]){
        Cbbb bb = new Cbbb(2); // 此行可設定num成員的值為2
        bb.show();               // 此行可印出 "num=2" 字串          
    }
}