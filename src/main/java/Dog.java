public class Dog extends Animal {
    String name = "강아지";

    @Override
    public void move() {
        System.out.println(name + "가 활발하게 움직였다.");
    }
}
