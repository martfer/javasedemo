package com.geacademy.visibility;

import static com.geacademy.visibility.Address.pi;


public class Main {



    public Person p = new Person("Kiss", "Géza");
    public Person p2 = new Person();
    public String s;


    public Address adress = new Address();

    public static void main(String[] args) {
        for (int i = 0; i < args.length ; i++) {
            System.out.println(i + "th argument is " + args[i]);
        }
        System.out.println(pi);

        double d1 = 1000000000000000000000000000000D;
        double d2 = 1000000000000000050000000000001D;

        System.out.println("sum double: " + (d1 + d2));

        int i = 10;


        byte b = (byte)127;
        b = (byte)i;

//        char c;
//        byte b;
//        short s;
//        int i;
//        long l;
//        float f;
//        double d;
//        boolean boo;

    }


}
