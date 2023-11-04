// Ex11_4, 介面實作的範例
interface MyMath{
    public void show();
    public void add(int a, int b); // 計算a+b
    public void sub(int a, int b); // 計算a-b
    public void mul(int a, int b); // 計算a*b
    public void div(int a, int b); // 計算a/b
}
class Compute implements MyMath{ //use "implement" will obbey contract
    // 請完成這個部分的程式碼
    public double ans; // use variable need to declare first at start of class

    public void show(){ //when method took here then the semicolon(分號) can remove
        System.out.println(ans); // could directly print variable and not to been add double quotes(雙引號)
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
        if(b != 0){
            ans = (double) a / b;
        }else{
            System.out.println("Divisor(除數) could not is 0"); // dividend is 被除數
        }
    }
}

public class Class04
{
    public static void main(String argp[]){
        Compute cp=new Compute();
        cp.mul(3,5); // 計算3*5
        cp.show(); // 此行會回應 "ans=15" 字串
    }
}