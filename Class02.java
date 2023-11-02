// Ex11_2, 抽象類別
abstract class MyMath{
    protected int ans;
    public void show(){
        System.out.println("ans=" + ans);
    }
    public abstract void add(int a, int b); // 計算 a+b
    public abstract void sub(int a, int b); // 計算 a-b
    public abstract void mul(int a, int b); // 計算 a*b
    public abstract void div(int a, int b); // 計算 a/b
}
class Compute extends MyMath{
    int a, b;

    public Compute()
    {}
    public void add(int a, int b) { // 只是計算 沒有要傳回值 所以用 void
        ans = a + b;
    }
    public void sub(int a, int b) {
        ans = a - b;
    }
    public void mul(int a, int b) {
        ans = a * b;
    }
    public void div(int a, int b) {
        ans = a / b;
    }
}
public class Class02 {
    public static void main(String args[]){
        Compute cp = new Compute(); // 如果直接調用 ###建構元就必須沒有參數
        cp.mul(3, 5); // 計算3*5
        cp.show();  // 此行會回應 "ans=15" 字串
    }
}