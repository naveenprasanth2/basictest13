package org.example.annotations1;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Setter
@VeryImportant
public final class Cat {
    private String name;
    @ImportantString
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @RunImmediately(times = 3)
    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public static void printName(){
        System.out.println("names");
    }
}
