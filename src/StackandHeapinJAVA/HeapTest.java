package StackandHeapinJAVA;

public class HeapTest {
    public static void main(String[] args){
        Person p1 = new Person("Mohamed"); //object stored in heap
        Person p2 = new Person("Bahir"); //object stored in heap

    }
}

class Person{
    String name; //stored in heap

    Person(String name){
        this.name = name;
    }
}
