package com.example.array;

import java.util.Arrays;


public class DynArray implements MyList{

    private  int SIZE = 3;
    private int idx = 0;
    private Object[] values = new Object[SIZE];

    public void add(Object o) {
        if(idx >= SIZE) {
            Object[] tmp = new Object[SIZE*2];
            System.arraycopy(values, 0, tmp, 0,SIZE);
            values = tmp;

            SIZE *=2;
//            values = Arrays.copyOf(values, SIZE);
        }
        values[idx++] = o;


    }

    public int size() {
        return idx;
    }

    public Object[] toArray() {
        return Arrays.copyOf(values, idx);
    }

    public static void main(String[] args) {

        DynArray dA = new DynArray();

        dA.add("cica");
        dA.add("kiskutya");
        dA.add("nyuszi");
        dA.add("mica");
        System.out.println(dA.size());

    }
}
