import java.util.Arrays;

public class Sout4 {
    public static boolean transformable(String input) {
        // 입력된 문자열 input이 정수(int)형으로 변환될 수 있는가의 여부를 반환하는 메서드를 작성하세요.
        // 반드시 Integer.parse 메서드를 사용해야 합니다.
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static Integer sum(int a, int b) {
        // 두 정수 a, b의 합을 Integer로 반환하는 메서드를 작성하세요.
        // 단, 두 정수의 합이 int 범위를 벗어나는 경우 null을 반환해야 합니다.
//        long c = (long) a + (long) b;
//        if (c < Integer.MIN_VALUE || c > Integer.MAX_VALUE) {
//            return null;
//        } else {
//            return Integer.valueOf((int)c);
//        }

        try {
            return Math.addExact(a , b);
        }  catch (ArithmeticException e) {
//        catch (Throwable e) {}
            return null;
        }
    }

    public static boolean checkBirth(String birth) {
        // 전달받은 birth가 올바른 주민등록번호 앞자리인가의 여부를 반환하세요.
        // 추가로, 년/월/일을 출력하세요.
        // birth의 길이가 6자리인 경우: yyMMdd의 형식입니다.
        // birth의 길이가 5자리인 경우: yMMdd의 형식이고, 이는 01년생부터 09년생임을 의미할 수도 있습니다.
        // birth의 길이가 4자리인 경우: MMdd의 형식이고, 이는 00년생임을 의미할 수도 있습니다.
        // birth의 길이가 3자리인 경우: Mdd의 형식이고, 이는 00년생, 1월~9월생임을 의미할 수도 있습니다.
        // checkBirth("960713");    96/07/13 출력 후 true 반환
        // checkBirth("01213");     00/12/13 출력 후 true 반환
        // checkBirth("70808");     07/08/08 출력 후 true 반환
        // checkBirth("511");       00/05/11 출력 후 true 반환
        // checkBirth("131");       00/01/31 출력 후 true 반환
        // checkBirth("1317");      false 반환(13월은 없음)
        // checkBirth("09/07/16");  false 반환(올바른 형식이 아님)
        // 단, 모든 달의 일수는 31일까지 존재한다고 가정합니다. (30일까지 존재하는 달 및 윤달 무시)

        int birthNum;
        try {
            birthNum = Integer.parseInt(birth);
        } catch (NumberFormatException e) {
            return false;
        }
        if (birthNum < 101 || birthNum > 991231) {
            return false;
        }
        int year = birthNum / 10000;
        int month = birthNum % 10000 / 100;
        int day = birthNum % 100;
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        System.out.println(String.format("%02d/%02d/%02d", year, month, day));
        return true;

//        switch (birth.length()) {
//            case 1, 2: {
//                return false;
//            }
//            case 3: {
//                birth = "000" + birth;
//                if(Integer.parseInt(birth.substring(2, 4)) > 12 || Integer.parseInt(birth.substring(2, 4)) < 1 || Integer.parseInt(birth.substring(4, 6)) > 31 || Integer.parseInt(birth.substring(4, 6)) < 1) {
//                    return false;
//                } else {
//                    System.out.println(String.join("/", birth.substring(0, 2), birth.substring(2, 4), birth.substring(4, 6)));
//                    return true;
//                }
//            }
//            case 4: {
//                birth = "00" + birth;
//                if(Integer.parseInt(birth.substring(2, 4)) > 12 || Integer.parseInt(birth.substring(2, 4)) < 1 || Integer.parseInt(birth.substring(4, 6)) > 31 || Integer.parseInt(birth.substring(4, 6)) < 1) {
//                    return false;
//                } else {
//                    System.out.println(String.join("/", birth.substring(0, 2), birth.substring(2, 4), birth.substring(4, 6)));
//                    return true;
//                }
//            }
//            case 5: {
//                birth = "0" + birth;
//                if(Integer.parseInt(birth.substring(2, 4)) > 12 || Integer.parseInt(birth.substring(2, 4)) < 1 || Integer.parseInt(birth.substring(4, 6)) > 31 || Integer.parseInt(birth.substring(4, 6)) < 1) {
//                    return false;
//                } else {
//                    System.out.println(String.join("/", birth.substring(0, 2), birth.substring(2, 4), birth.substring(4, 6)));
//                    return true;
//                }
//            }
//            case 6: {
//                if(Integer.parseInt(birth.substring(2, 4)) > 12 || Integer.parseInt(birth.substring(2, 4)) < 1 || Integer.parseInt(birth.substring(4, 6)) > 31 || Integer.parseInt(birth.substring(4, 6)) < 1) {
//                    return false;
//                } else {
//                    System.out.println(String.join("/", birth.substring(0, 2), birth.substring(2, 4), birth.substring(4, 6)));
//                    return true;
//                }
//            }
//            default: {
//                return false;
//            }
//        }
    }

//    public static int getMin(int a, int b) {
//        // a와 b 중 더 작은 수를 반환합니다.
//        // a와 b가 같다면 무엇을 반환하든 무관합니다.
//        int result;
//        if (a > b) {
//            result = b;
//        } else if (a < b) {
//            result = a;
//        } else {
//            result = a;
//        }

//            result = Math.min(a,b);

//        return result;
//    }

//    public static int countCollatz(int num) {
        // 주어진 num이 몇 회만에 콜라츠 추측을 만족하는가를 반환합니다.
        // 홀수 *3 + 1;
        // 짝수 /2;
//        int result = 0;
//        if (num <= 0) {
//            System.out.println("값이 잘못 입력되었습니다.");
//            return num;
//        } else {
//            while (num != 1) {
//                if (num % 2 == 1) {
//                    num = num * 3 + 1;
//                    result++;
//                } else {
//                    num /= 2;
//                    result++;
//                }
//            }
//            return result;
//        }

//        int result;
//        if (num >= 1) {
//            for (result = 0; num != 1; result++) {
//                if (num % 2 == 0) {
//                    num /= 2;
//                } else {
//                    num = num * 3 + 1;
//                }
//            }
//            return result;
//        } else {
//            System.out.println("값이 잘못 입력되었습니다.");
//            return num;
//        }
//    }

//    public static String[] filterCapital(String...input) {
//        // 주어진 문자열 가변 인자가 가지는 문자열 중 대문자로 시작하는 인자만을 인자로 가지는 문자열 배열을 반환.
//        String[] result;
//        int a = 0;
//
//        for (String items : input) {
//            if(items.substring(0, 1).equals(items.substring(0, 1).toUpperCase())) {
//                a++;
//            }
//        }
//
//        result = new String[a];
//        int b = 0;
//        for (String items : input) {
//            if(items.substring(0, 1).equals(items.substring(0, 1).toUpperCase())) {
//                result[b++] = items;
//            }
//        }
//        return result;
//    }

//    public static double average(int... input) {
//        // 주어진 정수 가변 인자의 평균 값을 반환.
//        double result = 0;
//        for (double items : input) {
//            result += items;
//        }
//        result /= input.length;
//
//        return result;
//    }

    public static void main(String[] args) {

        System.out.println(checkBirth("960713"));
        System.out.println(checkBirth("01213"));
        System.out.println(checkBirth("70808"));
        System.out.println(checkBirth("511"));
        System.out.println(checkBirth("131"));
        System.out.println(checkBirth("1317"));
        System.out.println(checkBirth("09/07/16"));

//        System.out.println(average(1, 2, 3, 4, 5));

//        System.out.println(countCollatz(1234));

//        System.out.println(Arrays.toString(filterCapital("abc", "Abc", "ABC", "AAA", "acsd", "qwer", "QWER")));

//        System.out.println(getMin(130, 124));

//        System.out.println(transformable("57"));
//        System.out.println(transformable("Hi"));

//        System.out.println(sum(5, 7));
//        System.out.println(sum(2_100_000_000, 2_100_000_000));

//        try {
//            int someInt2 = Integer.parseInt("124");
//            System.out.println("변환한 숫자 : " + someInt2);
//            int someInt = Integer.parseInt("Hello");
//            System.out.println("변환한 숫자 : " + someInt);
//        } catch (Throwable e) {
//            System.out.println("숫자로 변환할 수 없습니다.");
//        }

        // throw new NullPointerException   O
        // throw new IOException            X try-catch 필수

//        Animal dog = new Dog();
//        dog.sayName();
//
//        Cat cat = new Cat();
//
//        Snake snake = new Snake();
//
//        Crow crow = new Crow();
//
//        Object[] animals = {dog, cat, snake, 12, 124, false, crow};
//        for (Object x : animals) {
//            if (x instanceof Animal) {
//                Animal animal = (Animal) x;
//                animal.move();
//            }
//        }

//        Animal[] animals = {dog, cat, snake, crow};
//        for (Animal animal : animals) {
//            animal.move();
//        }

//        Dog dog = new Dog();
//        dog.move();
//
//        Cat cat = new Cat();
//        cat.move();
//
//        Snake snake = new Snake();
//        snake.move();
//
//        Crow crow = new Crow();
//        crow.move();

//        Animal animal = new Animal();
//        animal.name = "햄스터";
////        animal.move();
//
//        Animal cat = new Animal();
//        cat.name = "고양이";
////        cat.move();
//
//        Animal dog = new Animal();
//        dog.name = "강아지";
//
//        Animal snake = new Animal();
//        snake.name = "뱀";
//
//        animal.move();
//        cat.move();
//        dog.move();
//        snake.move();
    }
}
