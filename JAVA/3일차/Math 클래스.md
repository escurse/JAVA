# Math 클래스
- `Math`(`java.lang.Math`)클래스는 수학과 관련된 편의 기능을 제공하는 유틸리티 클래스이다.

## 정적 메서드
- `abs(x)`: 숫자 `x`의 절댓값을 반환한다.
- `addExact(a, b)`: 숫자 `a`와 `b`의 합을 반환한다. 단, 오버플로우 혹은 언더플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
- `decrementExact(x)`: 숫자 `x`에 `1`을 뺀 값을 반환한다. 단, 언더플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
- `incrementExact(x)`: 숫자 `x`에 `1`을 더한 값을 반환한다. 단, 오버플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
