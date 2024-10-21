//min(a,b): 이거랑 유사하게 낸다면 max(a,b)? -- , 아니면 a는 b의 배수인가?
//num콜라츠 추측: 콜라츠 추측을 그대로 낼 수도 있고, 아니면 다른 수학적 개념이 출제 될 수도 있고, 예를 들어 피보나치 수열의 num번째 항 구하기? num이 소수인지 아닌지?
//피보나치 수는 첫째와 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열로, Fn = Fn-1 + Fn-2 라는 공식으로 표현할 수 있습니다.
//문자열을 가변인자로 받고 필터링 하는 개념은 그대로 들고 갈 것이라고 예상, 다만 필터링 목적이 달라질 듯? 예를 들어 숫자만으로 이루어진 문자열을 필터링 OR 숫자로 시작하는 문자열을 필터링
//주어진 int 형태의 가변 인자들을 무난하게 average계산 하는 것을 SUM, MIN,MAX을 구하는 것으로 바뀌는 정도? 아니면 조건의 만족하는 숫자들의 갯수를 카운팅 하는 정도? ex) 홀수의 갯수를 반환, 3의 배수를 반환

//int 형 가변 인자 n개 받는다고 가정(n은 2이상)
//        첫번째 인자가 전체 가변 인자들 중에서 몇 번째로 큰 수 인지 구하는 함수를 만드시오
//        ex) rankOf(8,2,3,6,1,7,12,6,5,4) = 2
//        1부터 num까지의 완전수들을 배열의 형태로 출력
//        피보나치 수열의 n번째 항을 구하시오(n >= 3)

import java.util.Arrays;

public class Prac {
    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static boolean getMul(int a, int b) {
        return a % b == 0;
    }


    public static int Odd(int... a) {
        int i = 0;
        for (int items : a) {
//            if (items % 2 == 1) {
//                i++;
//            }
            if (items % 3 == 0) {
                i++;
            }
        }
        return i;
    }

    public static int rankOf(int... n) {
        int t;
        int a = n[0];
        int b = 0;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1; j++) {
                if (n[j] > n[j + 1]) {
                    t = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < n.length - 1; i++) {
            if (a == n[i]) {
                return n.length - b;
            }
            b++;
        }
        return 0;
    }

//    1 1 2 3 5 7 9
//
public static int Fibonacci(int result) {
    // 피보나치 수열 전체 출력
    if (result <= 0) return 0;
    if (result == 1) return 1;

    int a = 0; // F(0)
    int b = 1; // F(1)
    int fib = 0;

    for (int i = 2; i <= result; i++) {
        fib = a + b; // F(n) = F(n-1) + F(n-2)
        a = b; // F(n-1)
        b = fib; // F(n)
    }

    return fib;
}


public static void main(String[] args) {
    System.out.println(Fibonacci(10));
//        System.out.println(rankOf(8, 2, 3, 6, 1, 7, 12, 6, 5, 4, 11, 7, 2, 4, 5, 8, 8, 8, 8, 10, 1));
//        System.out.println(getMax(5123, 5123));
//        System.out.println(getMul(201, 10));
//        System.out.println(Odd(1, 3, 5, 7, 12, 34, 56, 64, 21, 37, 9, 9));
}
}
