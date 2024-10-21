public class Sout4 {
    public static void main(String[] args) {
        try {
            int someInt = Integer.parseInt("Hello");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        }

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
