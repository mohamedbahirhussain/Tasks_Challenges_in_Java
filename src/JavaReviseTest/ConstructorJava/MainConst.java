package JavaReviseTest.ConstructorJava;

public class MainConst {
    String name;

    public MainConst(){
        name = "Bahir";
    }

    public static void main(String[] args){
        System.out.println("This is Constructor!!!");

        MainConst objmain = new MainConst();
        System.out.println(objmain.name);
    }
}
