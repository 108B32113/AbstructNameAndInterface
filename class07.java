interface MyMath{ // typically we always setted main() position that class of position been a public class
                        //    but other class, interface, abstruct all can be public type
    public void mod(int a, int b); // 計算 a%b
    public void fac(int a); // 計算a!
    public void mul(int a, int b) // !=阶乘（factorial） ! named=factorial
    public void div(int a, int b);
}

interface AdvancedMath{
    public void mod(int a, int b); //計算 a%b
    public void fac(int a); //計算a!
    public void pow9(int a, int b); // 計算a^b
}
class Compute implements MyMath, AdvancedMath{
    // 請完成這個部分的程式碼
    public int ans;

    // MyMath part
    public void show(){
        System.out.println(ans);
    }

    public void mod(int a, int b){
        ans = a % b;
    }

    // ### factorial practice
    public void fac(int a){ // used "long" because avoid result size be too big
                            // !=階乘（factorial） ! named=factorial
                            // factorial of 0 or 1 are 1
        long result = 1; // projuct of factorial    
        for(int i = 1; i <= a; i++){ // doesn't trigger(觸發) of first running time until first iteration(迭代)
            result *= i;
        }
        ans = (int)result; // long transfer to int
    }
    public void mul(int a, int b){
        ans = a * b;
    }
    public void div(int a, int b){
        ans = a / b;
    }




    // AdvancedMath part
    public void mod(int a, int b){ // modulo's(is)(ma 的 lo) abrreviation
        ans = a % b;
    }
    public void fac(int a){
        long result = 1; // projuct of factorial    
        for(int i = 1; i <= a; i++){ // doesn't trigger(觸發) of first running time until first iteration(迭代)
            result *= i;
        }
        ans = (int)result; // long transfer to int
    }
    // ### exponent practice
    public void pow(int a, int b){
        long result = 1; // result = power: any base to exponent(指數) 0 these value are 1(final power)
        if(b==0 || b==1){
            result = 1; // 0 or 1 exponent is 1
        }
        for(int i = 1; i < b; i++){ // i = exponent, been b by after ++ i'll done
            result *= a;
        }
        ans = (int)result; // last to transfer
    }
}
public class class07 {
    Compute cp = new Compute();
    cp.mul(3,5);
    cp.show(); // 此行會回應 "ans=15" 字串
    cp.mod(14,5);
    cp.show(); // 此行會回應 "ans=4" 字串
    cp.fac(5);
    cp.show(); // 此行會回應 "ans=120" 字串
}
