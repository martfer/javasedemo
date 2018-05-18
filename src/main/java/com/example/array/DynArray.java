package com.example.array;

import java.util.Arrays;

public class DynArray {

    private  int SIZE = 3;
    private int idx = 0;
    private Object[] value = new Object[SIZE];

    public void add(Object o) {
        value[idx++] = o;
        if(idx == SIZE) {
            SIZE *=2;
            Object[] tmp = new Object[SIZE];
//            for (int i = 0; i < ; i++) {
//
//            }
//            System.arraycopy();
//            Arrays.copyOfRange(value, tmp, 0);


//            .....
            value = tmp;
        }
    }


    public static void main(String[] args) {

        DynArray dA = new DynArray();

        dA.add("cica");
        dA.add("kiskutya");
        dA.add("nyuszi");
        dA.add("mica");

    }
}
