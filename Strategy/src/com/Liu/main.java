package com.Liu;


import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Cat[] a = {new Cat(5,1),new Cat(3,3),new Cat(1,5)};
//        Dog[] a = {new Dog( 3), new Dog (5), new Dog( 1)};
        Sorter s = new Sorter();
        s.sort(a, new CatWeightComparator());
        System.out.println(Arrays.toString(a));
    }
}
