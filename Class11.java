// Ex11_11, 介面的延伸
interface Show_ans{
    public void show();

}
interface MyMath extends Show_ans{
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
}

class Compute implements MyMath{
    //請完成這個部份的程式碼
    public int ans;

    public void show(){
        System.out.println(ans);
    }

    public void add(int a, int b){
        ans = a + b;
    }
    public void sub(int a, int b){
        ans = a - b;
    }
    public void mul(int a, int b){
        ans = a * b;
    }
    public void div(int a, int b){
        ans = a / b;
    }
}

public class Class11 {
    public static void  main(String[] args){
        Compute cp=new Compute();
        cp.mul(3,5); // since arguemts to identify what's the method
        cp.show(); // 此行會回應"ans = 15"字串
    }
}