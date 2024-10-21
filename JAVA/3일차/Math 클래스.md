# Math 클래스
- `Math`(`java.lang.Math`)클래스는 수학과 관련된 편의 기능을 제공하는 유틸리티 클래스이다.

## 정적 멤버 변수
- `E`: 자연상수(e)
- `PI`: 원주율($\pi$)

## 정적 메서드
- `abs(x)`: 숫자 `x`의 절댓값을 반환한다.
- `absExact(x)`: 숫자 `x`의 절댓값을 반환한다. 단, 오버플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
- `addExact(a, b)`: 숫자 `a`와 `b`의 합을 반환한다. 단, 오버플로우 혹은 언더플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
- `cbrt(x)`: 숫자 `x`의 세제곱근을 반환한다.
- `ceil(x)`: 실수 `x`를 올림한다.
- `decrementExact(x)`: 숫자 `x`에 `1`을 뺀 값을 반환한다. 단, 언더플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
- `floor(x)`: 실수 `x`를 내림한다.
- `incrementExact(x)`: 숫자 `x`에 `1`을 더한 값을 반환한다. 단, 오버플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
- `log(x)`: 숫자 `x`의 자연로그를 반환한다.
- `log10(x)`: 숫자 `x`의 상용로그를 반환한다.
- `max(a, b)`: 숫자 `a`와 `b` 중 큰 값을 반환한다.
- `min(a, b)`: 숫자 `a`와 `b` 중 작은 값을 반환한다.
- `multiplyExact(a, b)`: 숫자 `a`와 `b`의 곱을 반환한다. 단, 오버플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
- `negateExact(x)`: 숫자 `x`의 부호를 반전하여 반환한다. 단, 오버플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
- `pow(a, b)`: 숫자 `a`의 `b`(<code>a<sup>b</sup></code>)제곱을 반환한다.
- `random()`: `0`이상 `1`미만의 무작위 실수를 반환한다.
- `round(x)`: 실수 `x`의 소수부를 반올림하여 반환한다.
- `sqrt(x)`: 숫자 `x`의 제곱근을 반환한다.
- `subtractExact(a, b)`: 숫자 `a`에서 `b`를 뺀 값을 반환한다. 단, 오버플로우 혹은 언더플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
- `toIntExact(long x)`: 큰 정수(`long`)인 `a`를 정수(`int`)로 변환하여 반환한다. 단, 오버플로우 혹은 언더플로우가 발생할 경우 예외(`ArithmeticException`)가 발생한다.
