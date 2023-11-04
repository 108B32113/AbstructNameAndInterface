class Stu{
    protected String id; // semicolon(se mai ko lon)
    protected String name; // 姓名
    protected int mid; // 期中考成績
    protected int finl; // 期末考成績
    protected int common; // 平時成績

    public Stu(String id, String name, int mid, int finl, int common){
        this.id = id;
        this.name = name;
        this.mid = mid;
        this.finl = finl;
        this.common = common;
    }

    public void show(){
        System.out.println("id=" + id + " " + "姓名=" + " " + name + " " + mid + " " + "期中考成績=" + mid + " " + "期末考成績=" + finl);
    }
} // ### class could not be got inheritance by implements
interface Data{
    public void showData();
}
interface Test{
    public void showScore();
    public void calcu(); // Mid30% Final40%
}
//extends only be got inheritance once, but implements could multi...

public class Class08 {
    public static void main(String args[]){
        Stu stu = new Stu("940001", "Fiona", 90, 92, 85);
        stu.show();
    }
}
