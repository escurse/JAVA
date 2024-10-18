# Double 클래스
- `Double(java.lang.Double)`클래스는 `double`타입과 관련된 편의 기능을 제공하고, 해당 타입 자체가 `double`타입의 리터럴로 작동할 수 있는 `double`의 래퍼(Wrapper) 클래스이다.
- `Double`클래스가 가지는 실질적인 값은 `double`이나, 이는 참조 타입임에 유의한다.

## 정적 멤버 변수
- `MAX_VALUE`: `double`타입이 가질 수 있는 최댓값
- `MIN_VALUE`: `double`타입이 가질 수 있는 최솟값
- `NaN`: 숫자가 아닌 값(Not a Number). 내부적으로 `0.0 / 0`연산으로 구현되어 있다.
- `NEGATIVE_INFINITY`: 음의 무한대. 내부적으로 `-1.0 / 0`연산으로 구현되어 있다.
- `POSITIVE-INFINITY`: 양의 무한대. 내부적으로 `1.0 / 0`연산으로 구현되어 있다.

## 정적 메서드
- `ifFinite(double d)`: `d`가 유한한가의 여부를 반환한다.
- `isInfinite(double d)`: `d`가 무한한가의 여부를 반환한다.
- `isNaN(double d)`: `d`가 `NaN`인가의 여부를 반환한다.
- `parseDouble(String s)`: 문자열 `s`를 `double`로 변환하여 반환한다. 변환할 수 없는 문자열일 경우 `NumberFormatException`예외가 발생한다.
- `toString(double d)`: `d`를 문자열로 변환하여 반환한다.

## 객체 메서드
- `byteValue()`: 호출 대상이 가진 `long`값을 `byte`로 변환하여 반환한다. 오버플로우가 발생할 수 있음에 유의한다.
- `doubleValue()`: 호출 대상이 가진 `double`값을 반환한다.
- `floatValue()`: 호출 대상이 가진 `double`값을 `float`로 변환하여 반환한다. 오버플로우가 발생할 수 있음에 유의한다.
- `intValue()`: 호출 대상이 가진 `double`값을 `int`로 변환하여 반환한다. 오버플로우가 발생할 수 있음에 유의한다.
- `longValue()`: 호출 대상이 가진 `double`값을 `long`으로 변환하여 반환한다. 오버플로우가 발생할 수 있음에 유의한다.
- `shortValue()`: 호출 대상이 가진 `double`값을 `short`로 변환하여 반환한다. 오버플로우가 발생할 수 있음에 유의한다.
- `toString()`: 호출 대상이 가진 `double`값을 문자열로 변환하여 반환한다.
