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
        String s1 = "hello";
        // 참조 타입은 대문자 시작

        String lv;
        // 지역 변수

        final int age; // 자바는 가능, js는 불가능. 값 할당은 한 번만 가능
    }
}
