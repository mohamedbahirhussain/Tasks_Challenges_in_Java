package JavaReviseTest.ConstructorJava;

public class MainConst {
    String name;
    int jobid;

    public MainConst(String name){
        this.name = name;
    }

    public MainConst(int jobid, String name){
        this.jobid = jobid;
        this.name = name;
    }

    public static void main(String[] args){
        System.out.println("This is Constructor!!!");

        MainConst objmain = new MainConst(23,"Bahir");
        System.out.println(objmain.name);
    }
}
