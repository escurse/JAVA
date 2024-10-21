public class Dog extends Animal {
    String name = "강아지";

    @Override
    public void move() {
        System.out.println(name + "가 활발하게 움직였다.");
    }

    @Override
    public void sayName() {
        System.out.println(name);
    }

    public void bark() {
        System.out.println("멍멍");
    }
}
