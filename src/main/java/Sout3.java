import java.sql.Wrapper;

public class Sout3 {

//    public static void doSomething2(int[] nums) {
//        nums = null;
//        System.out.println(nums);
//    }

//    public static int sum() {
//        return 5;
//    }
//
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }

    public static final int MAX_AGE = 50;
    public static final String PREFIX = "something";
    // static, final, literal ==> 명명법 대문자 스네이크 케이스

    public static void main(String[] args) {
        System.out.println("I am IronMan");

//        Integer i = 557;
//        byte b = i.byteValue();
//        System.out.println(b);

//        int red = 255;
//        System.out.println(Integer.toBinaryString(red));
//        System.out.println(Integer.toOctalString(red));
//        System.out.println(Integer.toHexString(red));
//
//        System.out.println(Integer.toString(red));

//        int red = Integer.parseInt("ff", 16);
//        System.out.println(red);

//        int pr = 5;
//        Integer rf = 5;
//        pr = rf;
//        rf = pr;
//
//        System.out.println(rf);

//        System.out.println(Math.E);

//        long l1 = 500L;
//        long l2 = 2147483648L;
//        System.out.println(Math.toIntExact(l1)); // O
//        Math.toIntExact(l2); // X

//        System.out.println(sum());
//        System.out.println(sum(1, 4));
//        System.out.println(sum(1, 2, 2));


//        int[] nums = {1, 2, 3};
//        doSomething2(nums);
//        System.out.println(nums.length);

//        int [] nums = new int[] {1, 2, 3};
//        for (int num : nums) {
//            System.out.println(num);
//        }

//        System.out.println(findMax(1, 3 ,5, 3, 3, 2, 1));
//        System.out.println(findMax(1, 7, 8, 9, 9, 9, 9, 9, 11, 1234, 352632462, 1213));

//        System.out.println(sum(1, 3, 5, 7, 9));
        // 가변인자 사용 int... nums

//        System.out.println(sum(nums));
//        System.out.println(sum(new int[] {1, 3, 5, 7, 9}));

////        byte b = null; // X
//        int [] is = null; // O
//        System.out.println(is);
//        String s = null;
//        System.out.println(s);

//        System.out.println(String.join("-", "2024", "10", "18"));

//        int age = 5;
//        String ageStr = String.valueOf(age);
//        System.out.println(ageStr);

//        String toPrint = "";
//        toPrint += String.format("신라면\t%10d원\n", 4580);
//        toPrint += String.format("찰옥수수\t%10d원\n", 12500);
//        toPrint += String.format("꼬막살\t%10d원\n", 8910);
//        toPrint += String.format("신라면\t%-10d원\n", 4580);
//        toPrint += String.format("찰옥수수\t%-10d원\n", 12500);
//        toPrint += String.format("꼬막살\t%-10d원\n", 8910);
//        System.out.println(toPrint);

//        String name = "김갑수";
//        int age = 77;
//        int price = 157800;
//        String twoPrint = "제 이름은 " + name + "이고, 나이는 " + age + "살입니다.";
//        System.out.println(twoPrint);
//        String toPrint = String.format("제 이름은 %s이고, 나이는 %d살입니다.", name, age);
//        System.out.println(toPrint);
//        String threePrint = String.format("총 %,d원 입니다.", price);
//        System.out.println(threePrint);

//        char [] cs = new char[] {'H', 'e', 'l', 'l', 'o'};
//        String st = String.copyValueOf(cs);
//        System.out.println(st);
////        System.out.println(st[1]);    // X
//        System.out.println(cs[1]);      // O , e
    }

//    public static int sum(int... nums) {
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        return sum;
//    }

//    public static int findMax(int... nums) {
//        // 전달받은 정수의 가변인자 nums가 가지는 인자 중 가장 큰 값을 반환하는 함수 findMax를 완성하세요.
//        int max = nums[0];
//        for (int num : nums) {
//            if (max < num) {
//                max = num;
//            }
//        }
//        return max;

//        int max;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i - 1] > nums[i]) {
//                max = nums[i];
//                nums[i] = nums[i - 1];
//                nums[i - 1] = max;
//            }
//        }
//        return nums[nums.length - 1];
//    }

}
