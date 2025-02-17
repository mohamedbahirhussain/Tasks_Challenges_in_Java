package StackandHeapinJAVA;

public class StackTest {
    public static void main(String[] args){
        int a = 10; //stored in stack
        int b = 20;

        int sum = a+b;
        System.out.println(sum);
    }

    public static int add(int x, int y){
        int result = x+y; //Local Variable stored in stack
        return result;
    }
}
