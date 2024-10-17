package a;

import a.b.Child;

public class Parent {
    public static void main(String[] args) {
        System.out.println(Child.sub(5, 5));
        // 정적인 리소스는 별도의 제약 없이 해당 리소스를 포함하는 대상의 이름을 통해 접근할 수 있다.
        // 위 코드에서는 정적인 메서드 sub를 사용하기 위해 이를 포함하는 대상의 이름인 Child로 접근했다.

        Child child = new Child();
        System.out.println(child.add(5, 5));
        // 정적인 공간에서 비정적인 것을 바로 참고할 수 없다. (바로 참고한다: 객체화 과정 없이 참고한다)
        // 비정적인 리소스(변수, 메서드 등)를 참고하기 위해서는 이를 소유하고 있는 대상을 객체화하여 접근하여야 한다.
        // 위 코드에서는 비정적인 메서드 add를 사용하기 위해 이를 포함하는 대상 Child를 객체화한 뒤 사용할 수 있다.
    }
}
