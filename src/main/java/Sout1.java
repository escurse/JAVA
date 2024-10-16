public class Sout1 {
    public static void main(String[] args) {
        System.out.println("I am IronMan");
        byte b = 15;
        System.out.println(b);
        short s = 20;
        //  int i = 25L; === long i = 25;
        int i = 25;
        long l = 30;

        byte b1 = 55;
        byte b2 = 15;
        int bs = b1 + b2;
        // 사칙연산하면 int로 강제 형변환함.

        System.out.println(bs);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
    }
}
