// Ex11_5
interface iAaaP{
    public void show();
}
class Bbb{
    public int num=10;
    public void set(int n){
        num=n;
    }
}
// 請於此處定義Ccc類別
class Ccc extends Bbb implements iAaaP{ // implements(翻譯:實作(字義有執行之意))
    // 類別C裡的程式碼
      //Ccc concurrently owned Bbb and iAaaP two inheritance properties
    
    //Bbb part
    public int num=10;
    public void set(int n){
        num=n;
    }
    //iAaap part
    public void show(){
        System.out.println(num);
    }
}

public class Class05 {
    public static void main(String[] args){
        Ccc obj = new Ccc();
        obj.set(5);
        obj.show(); // 印出num=5
    }
}
