# ☕Day4: 예외(Exception)
> **예외처리란?** 
> 프로그램 실행 중 발생할 수 있는 예상치 못한 오류에 대비하여 코드를 작성하는 것
#### 🤔예외 처리는 왜 필요한가?
> *프로그램의 안정성과 신뢰성을 높일 수 있다!*  
- 프로그램의 정상적인 동작을 방해하는 오류들을 감지하고 적절히 조치를 취하도록 하여 프로그램이 예상대로 동작할 수 있도록 함
  - 프로그램 실행 중 오류가 발생하면 프로그램이 비정상적으로 종료될 수 있음
- 프로그램이 비정상적인 상황에서도 계속 실행될 수 있도록 함
  - 사용자의 잘못된 입력, 외부 리소스의 이상 동작 등으로 인한 예외 상황에서도 프로그램이 중지되지 않도록 함
- 오류를 추적하고 디버깅하며, 유지 보수를 용이하게 함
- 예외 발생 시 사용자에게 적절한 오류 메시지를 제공하거나 오류를 자동으로 처리하여 친화적인 인터페이스를 제공함

## Exception 구조
![exception 구조](https://github.com/na-yk/conquer-java/assets/102007066/ae7bcf58-1ef6-460c-a3d2-6e9154334e75)
## `Throwable`
- 모든 error와 exception의 슈퍼클래스
  - `Exception`과 `Error`에 대한 **메시지**를 담고 있음
  - 생성 시점에 쓰레드의 실행 스택을 스냅샷으로 포함함

<details>
<summary>🐣throw vs throws</summary>
 
#### `throw`
- 강제로 예외를 발생시키는 경우에 사용
  - 주로 메소드 내부에서 예외를 직접 발생시킬 때 사용됨
- `throw` 예약어 뒤에 `java.lang.Throwable` 클래스를 상속받은 자식 클래스 객체를 지정해야 함
- 상위 메소드에 오류 정보를 주어 상위 메소드에서 오류를 감지할 수 있도록 하는 데도 사용됨
#### `throws`
- 메소드 선언부에서 예외를 선언하는 데 사용됨
  - 메소드가 호출할 때 발생할 수 있는 예외
  - 해당 예외를 처리하지 않고 호출한 곳으로 예외 처리를 넘기는 것을 의미함

</details>

### `Error`
- 시스템 레벨에서 발생하는 심각한 오류→프로그램이 복구할 수 없거나 처리할 수 없는 심각한 상황
- 일반적으로 JVM 내부에서 발생하며 예외 처리로 방지하거나 복구할 수 없음
- 예: `OutOfMemoryError`, `StackOverflowError`
### `Exception`
- 프로그램이 처리할 수 있는 일반적인 예외 상황
- 논리, 사용자 입력, 외부 리소스 동작에서 발생하는 오류
- 개발자가 예외 처리를 통해 방지하거나 복구할 수 있음
- Checked Exception vs Unchecked Exception

## Checked Exception vs Unchecked Exception
### Checked Exception
> `RuntimeException`을 상속하지 않는 exception
- 컴파일러가 강제로 예외 처리를 요구하므로 프로그래머가 이를 명시적으로 처리해야 함
  - `try~catch`로 예외를 잡거나 `throws`로 메소드 시그니처에 예외를 선언해야 함
  - 예외를 명시적으로 처리하지 않으면 **컴파일 오류**가 발생함
- **외부 리소스와의 상호작용(파일 시스템, 네트워크 연결, DB 등)**에서 발생하는 예외
  - `IOException`: 파일 또는 네트워크와 관련된 입출력 작업에서 발생할 수 있는 예외
    - 파일이 존재하지 않거나 접근 권한이 없는 경우, 네트워크 연결이 끊어진 경우 등
  - `SQLException`: DB 연결, 쿼리 실행, 트랜잭션 관리 등 데이터베이스와 관련된 작업에서 발생할 수 있는 예외
    - DB 서버와의 통신 문제, 잘못된 SQL 문장, 테이블이나 칼럼이 존재하지 않는 경우 등
### Unchecked Exception
> `RuntimeException`을 상속하는 exception
- 컴파일러가 예외 처리를 감지하지 않아 강제하지 않음
  - 메소드 시그니처에 `throws`로 예외를 선언하거나 `try~catch`로 처리하지 않아도 됨
  - 프로그래머가 선택적으로 예외를 처리하면 됨
- 주로 **프로그래머의 실수, 논리 오류, 잘못된 입력 등**으로 발생하는 예외
  - `NullPointerException`: 객체 참조가 null인 상태에서 해당 객체의 메소드를 호출하거나 필드에 접근할 때 발생하는 예외
    - 객체가 초기화되지 않은 상태에서 사용하려고 할 때 발생함
  - `ArrayIndexOutOfBoundsException`: 배열의 인덱스 범위를 초과하여 접근할 때