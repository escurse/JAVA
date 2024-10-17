public class Sout2 {
//    String mv;
    // 멤버 변수

//    public static void sayHello() {
//        System.out.println("Hello");
//    }
//
//    public void sayHi() {
//        System.out.println("Hi");
//    }

//    final String mv; ==> 멤버 변수를 상수로 만들 경우 값 할당 안 할시 오류 발생.

    public static void main(String[] args) {
                            // 매개 변수
        System.out.println("I am IronMan");

        String word2 = "HoUr";
        // 위 문자열 word2가 영어 소문자(a-z)로만 이루어져 있는가의 여부를 출력하세요.
        // 97 ~ 122
        // "yes" => true
        // "Nice" => false
        // "absolutE" => false

        String word3 = "yes";
        String word4 = "Nice";
        String word5 = "absolutE";

        System.out.println(word2.equals(word2.toLowerCase()));
        System.out.println(word3.equals(word3.toLowerCase()));
        System.out.println(word4.equals(word4.toLowerCase()));
        System.out.println(word5.equals(word5.toLowerCase()));

//        String word = "hello";
//        String word1 = "Hello Nice To Meet You";
//        String word2 = "great honor";
//        String word3 = "some thing";
//
//        String a = word.replace(" ","");
//        String a1 = word1.replace(" ","");
//        String a2 = word2.replace(" ","");
//        String a3 = word3.replace(" ","");

        // 위 문자열 word가 포함하는 모든 공백을 제거하고,
        // replace(" ","")
        // 첫자가 대문자가 아니라면 대문자로 만든 뒤,
        // 나머지 문자를 모두 소문자로 만드세요.
        // "Hello Nice To Meet You" => "Hellonicetomeetyou"
        // "great honor" => "Greathonor"
        // "some thing" => "Something"

//        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase());
//        System.out.println(a1.substring(0, 1).toUpperCase() + a1.substring(1).toLowerCase());
//        System.out.println(a2.substring(0, 1).toUpperCase() + a2.substring(1).toLowerCase());
//        System.out.println(a3.substring(0, 1).toUpperCase() + a3.substring(1).toLowerCase());

//        String s = "기억이 안 납니다.";
//        System.out.println(s.substring(0, 4) + s.substring(6, 10));

//        String comment = "플랫폼 쓰지 말고 010-1234-5678로 연락주시면 만원 네고해 드려요.";
//        String fixed = comment.replaceAll("\\d", "*");
//        System.out.println(fixed);

//        String comment = "16일 15시 터키 말라티아 동쪽 45km 지역에서 규모 6.0 지진";
//        String fixed = comment.replace("터키", "튀르키예");
//        System.out.println(fixed);

//        String contact = "010-1234-5678";
//        System.out.println( contact.matches("^(010)-(\\d{4})-(\\d{4})$"));

//        System.out.println("=".repeat(50));
//        System.out.println("ㅋ".repeat(50));
//        System.out.println("=".repeat(50));

//        String messages = "Hi, my name is mysterious.";
//        System.out.println(messages.length());

//        System.out.println(messages.indexOf("my"));
//        System.out.println(messages.lastIndexOf("my"));

//        String message = "Hello World";
//        System.out.println(message.equalsIgnoreCase("hello World"));

//        System.out.println(message.equals("hello World"));

//        System.out.println(message.startsWith("H"));
//        System.out.println(message.endsWith("d"));

//        String message = "Hello World";
//        System.out.println(message.contains("Hell"));
//        System.out.println(message.contains("world"));

//        String before = "abc";
//        String after = before.concat(" def");
//        System.out.println(before);
//        System.out.println(after);

//        String word = "Oil";
//        String word1 = "gas";
//
//        // 주어진 문자열 word가 대문자로 시작하는가의 여부를 출력하세요.
//        // 코드 작성 시작
//        char a = word.charAt(0);
//        char b = word1.charAt(0);
//
//        if (a >= 65 && a <= 90) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//
//        if (b >= 65 && b <= 90) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//
//        char firstLetter = word.charAt(0);
//        boolean result = firstLetter >= 65 && firstLetter <= 90;
//        System.out.println(result);

        // 코드 작성 끝
        // word가 "Oil"일때 기대 출력: true
        // word가 "gas"일때 기대 출력: false
        // 구글에 "아스키 테이블" 검색해서 a~z, A~Z에 맵핑된 아스키 코드 참고.
                                // 97 ~ 122 65 ~ 90

//        String a = new String("Hello");
//
//        String.charAt(); // X
//        String.format(); // O
//        a.charAt(); // O
//        a.format(); // X
        // 비정적 => 객체
        // 정적 => 타입

//        sayHello();
//
//        Sout2 s = new Sout2();
//        s.sayHi();

//        String message = "Hello World";
//        System.out.println(message);
//
//        byte b = 1;
//        short s = 2;
//        int i = 3;
//        long l = 4;
//        // 기초 타입은 소문자 시작, 약속어
//        String s1 = "Hello";
//        // 참조 타입은 대문자 시작
//
//        String lv;
//        // 지역 변수
//
//        final int age; // 자바는 가능, js는 불가능. 값 할당은 한 번만 가능
//
////        자바가 가지는 숫자 타입 간의 사칙 연산 결과는 두 피연산자의 타입이 같다면 반드시 동일 타입으로, 다르다면 보다 큰 타입으로 연산된다.
//        int ten = 10;
//        int three = 3;
//        System.out.println(ten / three);
//        double result = ten / three;
//                        // 먼저 계산 후 double 판단.
//        System.out.println(result);
//        double resultD = 10D / three;
//        System.out.println(resultD);
//
//        // 기초 타입: 스택 영역에 값 직접
//        // 참조 타입: 힙 영역에 값을 넣고 스택 영역에는 힙의 주소
//        // 동/부등 연산(==, !=): 스택 값 비교
//
//        int ia = 5; // 0x00
//        int ib = 5; // 0x01
//        boolean is = ia == ib;
//        System.out.println(is);
//
//        String sa = new String("Hello"); // 0x02, @ax00 ~ @ax04
//        String sb = new String("Hello"); // 0x03, @bx00 ~ @bx04
//        System.out.println(sa == sb); // false ==> 이렇게 하면 안 됨.
//        System.out.println(sa.equals(sb)); // true
//
//        char ca = 'a';
//        char cb = 'a';
//        System.out.println(ca == cb);

//        int ia = 10;
//        int ib = 3;
//        double result = (byte) ia / (float) ib;
//        System.out.println(result);

//        final int start = 2;
//        final int end = 58;
//
//        final int start1 = 16;
//        final int end1 = 192;
//
//        // 코드 작성 시작
//        // 위에 선언된 start 이상, end 이하의 숫자 중 짝수의 합을 출력(System.out.println)하세요.
//        int sum = 0;
//        for (int i = start; i <= end; i += 2) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.printf("start ~ end가 2 ~ 58일때의 기대 출력: %d\n", sum);
//
//        int sum1 = 0;
//        for (int i = start1; i <= end1; i += 2) {
//            if (i % 2 == 0) {
//                sum1 += i;
//            }
//        }
//        System.out.printf("start ~ end가 16 ~ 192일때의 기대 출력: %d\n", sum1);
//        // 코드 작성 끝
//
//        final int num = 56;
//        final int num1 = 1024;
//        // 위에 선언된 num이 콜라츠 추측에 의해 몇 회만에 1이 되는지의 값을 출력하세요.
//        // 콜라츠 추측은 모든 2 이상의 자연수는 아래 과정을 무한히 반복하면 결국 1이 될 것이라는 추측입니다.
//        // 어떠한 숫자가 홀수일 때 3을 곱하고 1을 더한다.
//        // 어떠한 숫자가 짝수일 때 2로 나눈다.
//        // 코드 작성 시작
//
//        int a = num;
//        int sum2 = 0;
//        while (a != 1) {
////            if (a % 2 == 1) {
////                a = a * 3 + 1;
////                sum2++;
////            } else {
////                a = a / 2;
////                sum2++;
////            }
//            a = a % 2 == 0 ? a / 2 : a * 3 + 1;
//            sum2++;
//        }
//        System.out.printf("num이 56일때의 기대 출력: %d\n", sum2);
//
//        int b = num1;
//        int sum3 = 0;
//        while (b != 1) {
//            if (b % 2 == 1) {
//                b = b * 3 + 1;
//                sum3++;
//            } else {
//                b = b / 2;
//                sum3++;
//            }
//        }
//        System.out.printf("num이 1024일때의 기대 출력: %d\n", sum3);
//        // 코드 작성 끝
    }
}
