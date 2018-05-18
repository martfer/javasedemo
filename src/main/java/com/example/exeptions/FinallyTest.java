
package com.example.exeptions;

public class FinallyTest {

    private static int hello() throws MyException {

        try {
            System.out.println("hello body");
//            return 0;
            throw new MyException("hello");
//        }
// catch( MyException me) {
//            throw  new RuntimeException();
        } finally {
            System.out.println("hello finally");
                return 4;
//            throw new OutOfMemoryError("sorry...");
        }

    }

    public static void main(String[] args) throws MyException {
        System.out.println("doit: " + hello());
        

    }
}
