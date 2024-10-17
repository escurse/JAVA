public class Sout2 {
    String mv;
    // 멤버 변수

//    final String mv; ==> 멤버 변수를 상수로 만들 경우 값 할당 안 할시 오류 발생.

    public static void main(String[] args) {
                            // 매개 변수
        System.out.println("I am IronMan");

        String message = "Hello World";
        System.out.println(message);

        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        // 기초 타입은 소문자 시작, 약속어
        String s1 = "Hello";
        // 참조 타입은 대문자 시작

        String lv;
        // 지역 변수

        final int age; // 자바는 가능, js는 불가능. 값 할당은 한 번만 가능

//        자바가 가지는 숫자 타입 간의 사칙 연산 결과는 두 피연산자의 타입이 같다면 반드시 동일 타입으로, 다르다면 보다 큰 타입으로 연산된다.
        int ten = 10;
        int three = 3;
        System.out.println(ten / three);
        double result = ten / three;
                        // 먼저 계산 후 double 판단.
        System.out.println(result);
        double resultD = 10D / three;
        System.out.println(resultD);

        // 기초 타입: 스택 영역에 값 직접
        // 참조 타입: 힙 영역에 값을 넣고 스택 영역에는 힙의 주소
        // 동/부등 연산(==, !=): 스택 값 비교

        int ia = 5; // 0x00
        int ib = 5; // 0x01
        boolean is = ia == ib;
        System.out.println(is);

        String sa = new String("Hello"); // 0x02, @ax00 ~ @ax04
        String sb = new String("Hello"); // 0x03, @bx00 ~ @bx04
        System.out.println(sa == sb); // false
        System.out.println(sa.equals(sb)); // true
    }
}
