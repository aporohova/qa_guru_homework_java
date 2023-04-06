package homework;

public class Overflow {
    public static void main(String[] args) {
        System.out.println("Overflow");
        byte a = 10;
        short b = 31000;
        int c = 25;
        int d = 10;
        long e = 1470;
        System.out.println("Byte Overflow= " + (a + 128));
        System.out.println("Short Overflow= " + (b + 2000));
        System.out.println("Int Overflow= " + Math.pow(c,d));
        System.out.println("Long Overflow= " + Math.pow(e,d));
    }
}
