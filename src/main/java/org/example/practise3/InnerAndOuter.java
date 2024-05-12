package org.example.practise3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InnerAndOuter {
    private int val = 0;
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Inner{
        private int val = 9;
    }

    public static void main(String[] args) {
        InnerAndOuter innerAndOuter = new InnerAndOuter();
        System.out.println(innerAndOuter.getVal());

//        Inner inner = innerAndOuter.new Inner();
//        System.out.println(inner.getVal());

        Inner inner1 = new InnerAndOuter.Inner();
        System.out.println(inner1.getVal());
    }
}
