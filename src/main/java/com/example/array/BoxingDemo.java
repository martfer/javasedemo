package com.example.array;

public class BoxingDemo {

    public static Long[] store = {1L,2L,3L,4L,5L};
    public static long[] storePrimitive = {1,2,3,4};


    public static void main(String[] args) {
        store[0] = new Long(5);
        store[1] = Long.valueOf(5);
        store[2] = 5L;
        long l = store[1];
        l = store[1].longValue();

        System.out.println(store[0] == store[1]);


       persistToDisk(store[3]);
        persistToDisk(45);
    }

    public static void persistToDisk(Object o) {
        System.out.println("saving to disk ...");
    }

}
