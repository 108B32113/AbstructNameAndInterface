// Ex11_10
interface Data{
    public void best(); // 判斷那一科成績較高
    public void failed(); // 判斷那一科成績低於60分
}
interface Test extends Data{
    public void showData(); // 顯示學生的資料及平均成績
    public double average(); // 計算數學和英文的平均成績
}
class Stu implements Test{
    protected String name; // 姓名
    protected int math; // 數學成績
    protected int english; // 英文成績

    // 請完成這個部分的程式
    Stu(String name, int math, int english){
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void best(){
        if(math > english){
            System.out.println(name + "的英文比數學好");
        }
        else if(math < english){
            System.out.println(name + "的數學比英文好");
        }
        else{
            System.out.println(name + "的數學跟英文的成績一樣");
        }

        
    }
    public void failed(){
        if(math < 60){
            System.out.println(name + "的數學被當了");
        }
        else if(english < 60){
            System.out.println(name + "的英文被當了");
        }
        else if(math<60 && english<60){ // && = and
            System.out.println(name + "的數學跟英文都被當了");
        }
    }
    public void showData(){
        System.out.println("姓名:" + name);
        System.out.println("數學成績:" + math);
        System.out.println("英文成績:" + english);
        System.out.println("平均成績:" + average());
    }
    public double average(){ // if it had return value then it can be printed directly use methodName
        return (math+english) / 2;
    }

    public void show(){ // ### show non-return method can create anoter new method to directly add methodName
        showData();
        best();
        failed();
    }
}

public class Class10 {
    public static void main(String[] args){
        Stu s=new Stu("Judy" , 58, 91);
        s.show();
    }
}
