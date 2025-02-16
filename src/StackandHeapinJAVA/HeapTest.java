package StackandHeapinJAVA;

public class HeapTest {
    public static void main(String[] args){
        Person p1 = new Person("Mohamed"); //object stored in heap
        Person p2 = new Person("Bahir"); //object stored in heap

        //p1, p2 are object reference that'll store in stack

    }
}

class Person{
    String name; //stored in heap instance variable

    Person(String name){
        this.name = name;
    }
}
