package com.geacademy.interfacedemo;

public class Main {

    public static void main(String[] args) {

        Runnable rr = new Hajra();


        execute(rr);
        execute(new Adder(1,2,3));


    }

    public static void execute(Runnable r){
        r.run();
    }

}
