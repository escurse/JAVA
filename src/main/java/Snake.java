public class Snake extends Animal{
    String name = "뱀";

    @Override
    public void move() {
        System.out.println(name + "이 음습하게 움직였다.");
    }
}
