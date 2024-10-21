public class Cat extends Animal {
    String name = "고양이";

    @Override
    public void move() {
        System.out.println(name + "가 조용하게 움직였다.");
    }
}
