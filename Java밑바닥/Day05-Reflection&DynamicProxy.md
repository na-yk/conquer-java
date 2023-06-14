# ☕Day5: Reflection&DynamicProxy
## Reflection
> JVM이 클래스 로더를 통해 JVM 메모리에 저장하는 **클래스 정보**를 사용하는 기능
- 클래스 읽기, 인스턴스 생성, 메소드 실행, 필드 값 접근이 가능하다.
### Reflection의 용도
- 특정 어노테이션이 붙어 있는 필드 또는 메소드를 읽어올 때(JUnit, Spring)
  - `@Configuration`, `@Component`, `@Bean`
- 특정 네이밍 패턴에 해당하는 메소드 목록을 가져와서 호출할 때(getter, setter)

### `Class` 클래스
#### `getMethods` vs `getDeclaredMethods`
- `getMethods`: 상위 클래스와 상위 인터페이스에서 상속한 메소드를 모두 포함하여 `public`인 메소드를 모두 가져온다.
- `getDeclaredMethods`: 접근 제어자와 관계없이 상속한 메소드를 제외하고 직접 클래스에서 선언한 메소드들을 모두 가져온다.
#### 클래스 읽기와 인스턴스 생성
```java
    import java.lang.reflect.Constructor;

    // 클래스 이름을 문자열로 넘겨서 정보를 가져옴
    Class<?> myClass = Class.forName("com.example.MyClass");
    // 생성자를 통해 인스턴스를 생성함
    Constructor<?> constructor = myClass.getConstructor();
    Object myInstance = constructor.newInstance();
    // 리플렉션으로 생성된 인스턴스는 Object 타입으로 반환되어 클래스 캐스팅 필요함
    MyClass castedInstance = (MyClass) myInstance; 
```

## Dynamic Proxy
### Proxy란?
- 클라이언트로부터 타겟 대신 요청을 받아 부가 기능을 수행하는 객체
- 실제 객체인 타겟은 프록시를 거쳐 최종적으로 요청을 받아 처리함으로써 자신의 기능에 집중
#### 용도
- 클라이언트의 타겟 접근 방법을 제어
  - 예) JPA 지연 로딩
- ️타겟에 부가기능 부여
  - 예) 트랜잭션, 실행 시간 측정
#### proxy pattern
특정 객체에 대한 접근을 제어하거나 부가기능을 구현하는 데 사용되는 패턴
### Proxy의 장단점
#### 장점
- OCP(Open-Closed Principle, 개방폐쇄원칙): 기존 코드를 수정하지 않고도 새로운 기능을 추가할 수 있음
- SRP(Single Responsibility Principle, 단일책임원칙): 기존 코드의 책임을 유지할 수 있음
#### 단점
- 프록시 클래스를 구현해야 하기 때문에 코드가 더 복잡해지며 중복 코드가 발생한다.
### Dynamic Proxy
일반 proxy의 단점을 해결하기 위해 등장했다.
- 프록시 클래스를 직접 구현하지 않아 코드의 복잡성이 높아지지 않는다.
- `InvocationHandler`: 중복 코드를 방지할 수 있다.