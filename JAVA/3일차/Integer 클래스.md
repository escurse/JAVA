# Integer 클래스
- `Integer(java.lang.Ingeger)`클래스는 일반 정수(`int`)와 관련된 편의 기능을 제공하고, 해당 타입 자체가 `int`타입의 리터럴로 작동할 수 있는 일반 정수(`int`)의 래퍼(Wrapper)클래스이다.
- `Integer`가 가지는 실질적인 값은 `int`이나, 이는 참조 타입임에 유의한다.

## 정적 멤버 변수
- `MAX_VALUE`: `int`타입이 가질 수 있는 가장 큰 값
- `MIN_VALUE`: `int`타입이 가질 수 있는 가장 작은 값

## 정적 메서드
- `parseInt(String s)`: 문자열 `s`를 일반 정수(`int`)로 변환하여 반환한다. 변환할 수 없는 문자열일 경우 `NumberFormatException`예외가 발생한다.
- `parseInt(String s, int radix)`: `radix`진법의 문자열 `s`를 10진법으로 변환한 `int`를 반환한다.
- `toBinaryString(int i)`: 정수 `i`를 2진법으로 변환한 문자열을 반환한다.
- `toHexString(int i)`: 정수 `i`를 16진법으로 변환한 문자열을 반환한다.
- `toOctalString(int i)`: 정수 `i`를 8진법으로 변환한 문자열을 반환한다.
- `toString(int i)`: 정수 `i`를 문자열로 반환한다.

## 객체 메서드
- `byteValue()`: 호출 대상이 가진 일반 `int`값을 `byte`타입으로 변환하여 반환한다. 오버플로우가 발생할 수 있음에 유의한다.
- `doubleValue()`: 호출 대상이 가진 일반 `int`값을 `double`타입으로 변환하여 반환한다.
- `floatValue()`: 호출 대상이 가진 일반 `int`값을 `float`타입으로 변환하여 반환한다.
- `intValue()`: 호출 대상이 가진 일반 `int`값을 반환한다.
- `longValue()`: 호출 대상이 가진 일반 `int`값을 `long`타입으로 변환하여 반환한다.
- `shortValue()`: 호출 대상이 가진 일반 `int`값을 `short`타입으로 변환하여 반환한다. 오버플로우가 발생할 수 있음에 유의한다.
- `toString()`: 호출 대상이 가진 `int`를 문자열로 변환하여 반환한다.
