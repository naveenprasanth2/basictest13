package org.example.practise1;

public class Child extends Parent {
    int number;
    public Child(int number){
        super(number);
        this.number = number;
    }

    public void test(){
        System.out.println("child");
    }
}
