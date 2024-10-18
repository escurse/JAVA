# Long 클래스
- `Long(java.lang.Long)`클래스는 큰 정수(`long`)와 관련된 편의 기능을 제공하고, 해당 타입 자체가 `long`타입의 리터럴로 작동할 수 있는 큰 정수(`long`)의 래퍼(Wrapper) 클래스이다.
- `Long`클래스가 가지는 실질적인 값은 `long`이나, 이는 참조 타입임에 유의한다.

## 정적 멤버 변수
- `MAX_VALUE`: `long`타입이 가질 수 있는 최댓값
- `MIN_VALUE`: `long`타입이 가질 수 있는 최솟값

## 정적 메서드
- `parseLong(String s)`: 문자열 `s`를 `long`으로 변환하여 반환한다. 변환할 수 없는 문자열일 경우 `NumberFormatException`예외가 발생한다.
- `parseLong(String s, int radix)`: `radix`진법의 문자열 `s`를 `long`으로 변환하여 반환한다.
- `toBinaryString(long n)`: `long`타입인 `n`을 2진법으로 변환한 문자열을 반환한다.
- `toHexString(long n)`: `long`타입인 `n`을 16진법으로 변환한 문자열을 반환한다.
- `toOctalString(long n)`: `long`타입인 `n`을 8진법으로 변환한 문자열을 반환한다.
- `toString(long n)`: `long`타입인 `n`을 문자열로 반환한다.

## 객체 메서드
- `byteValue()`: 호출 대상이 가진 `long`값을 `byte`로 변환하여 반환한다. 오버플로우가 발생할 수 있음에 유의한다.
- `doubleValue()`: 호출 대상이 가진 `long`값을 `double`로 변환하여 반환한다.
- `floatValue()`: 호출 대상이 가진 `long`값을 `float`로 변환하여 반환한다.
- `intValue()`: 호출 대상이 가진 `long`값을 `int`로 변환하여 반환한다. 오버플로우가 발생할 수 있음에 유의한다.
- `longValue()`: 호출 대상이 가진 `long`값을 반환한다.
- `shortValue()`: 호출 대상이 가진 `long`값을 `short`로 변환하여 반환한다. 오버플로우가 발생할 수 있음에 유의한다.
- `toString()`: 호출 대상이 가진 `long`값을 문자열로 변환하여 반환한다.
