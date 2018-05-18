package com.geacademy.interfacedemo;

public class Adder implements Runnable
{

    private int[] numbers;

    public Adder(int... numbers) {
        this.numbers = numbers;
    }

    public Adder() {
    }


    @Override
    public void run() {
        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
        for (int i: numbers ) {
            sum += i;
        }

        System.out.println("Sum is " + sum);
    }
}
