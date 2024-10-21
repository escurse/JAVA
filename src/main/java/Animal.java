public abstract class Animal {
    // 추상 메서드를 1개 이상 가지는 클래스는 반드시 추상 클래스여야 함.
    // 추상 메서드를 가지지 않더라도 클래스는 추상 클래스 일 수 있다.
    public String name;
    public int age;

    public abstract void move();
    // Animal의 이동 행동 단위를 구현하기 위한 메서드
}
