public class PrintNumber {

    public static void main(String[] args) {

        int testTisNumber = 123;

//        printNum(testTisNumber);
        System.out.println(printNum2(testTisNumber));
//        printNum3(testTisNumber);

    }

    public static void printNum3(int i) {
        while( i != 0) {
            System.out.print(i%10);
            i /= 10;    // i = i/10;
        }
    }

    public static void printNum(int i) {
        if(i == 0) {
            return;
        }
        printNum(i/10);
        System.out.print(i%10);
    }


    public static String printNum2(int i) {
        if(i == 0) {
            return "";
        }
        String ret = printNum2(i/10);
        return ret + Integer.toString(i%10);
    }
}
