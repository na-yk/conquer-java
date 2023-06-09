# ☕Day3: 클래스(Class)와 인터페이스(Interface)
## 중첩 클래스(Nested Class)
### 클래스를 중첩하는 이유
- 내부 클래스에서 외부 클래스의 멤버들에 쉽게 접근할 수 있음
- 코드의 복잡성을 줄일 수 있음(캡슐화)
```Java
class OuterClass {  // 외부 클래스
    class InnerClass {
        // 내부 클래스
    }
}
```
### 내부 클래스(Inner Class)
> 클래스 내에 선언된 클래스  
> 내부 클래스는 자신의 외부 클래스를 제외하고는 다른 클래스에서 잘 사용되지 않아야 함  
#### 내부 클래스의 종류와 특징
|            종류            |         선언 위치          | 특징                                    | 주 사용 형태                             |
|:------------------------:|:----------------------:|:--------------------------------------|:------------------------------------|
| 인스턴스 클래스(instance class) |   외부 클래스의 멤버변수 선언 위치   | 외부 클래스의 인스턴스멤버처럼 다뤄짐                  | 외부 클래스의 인스턴스 멤버들과 관련된 작업            |
|  스태틱 클래스(static class)   |   외부 클래스의 멤버변수 선언 위치   | 외부 클래스의 `static`멤버처럼 다뤄짐              | 외부 클래스의 static멤버, 특히 static메소드에서 사용 |
|   지역 클래스(local class)    | 외부 클래스의 메소드나 초기화 블록 내부 | x                                     | 선언된 영역 내부에서만 사용                     |
| 익명 클래스(anonymous class)  |           ?            | 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스(일회용) | 이벤트 핸들러, 스레드, 인터페이스 구현              |

#### Static Class
- 외부 클래스의 멤버변수와 같은 위치에 선언되며 `static` 멤버와 같은 성질을 가짐
- 내부 클래스 중 static class만이 static변수를 선언할 수 있음
  - `final`, 즉 상수의 경우 어떤 경우라도 `static`을 붙일 수 있음
- `static`클래스는 외부 클래스의 인스턴스 멤버에 직접 접근할 수 없음
  - `static` 멤버에는 접근할 수 있음


## 클래스 vs 객체 vs 인스턴스
- 클래스: 객체를 속성과 동작의 구조로 정의해 놓은 것 = 객체의 설계도, 틀
- 객체: 실제로 존재하는 사물 또는 개념
- 인스턴스: **어떤 클래스로부터** 만들어진 객체

---
## Interface vs Abstract class
### 비교
|항목|            인터페이스(Interface)             |  추상 클래스(Abstract Class)   |
|:----:|:---------------------------------------:|:-------------------------:|
|정의 방식|            인터페이스 `interface`            |      클래스 `abstract`       |
|멤버|     추상 메소드, 상수, 디폴트 메소드, static 메소드     | 멤버변수, 추상 메소드, 일반 메소드, 생성자 |
|구현|    모든 메소드가 추상 메소드여야 하기 때문에 구현이 없어야 함    |추상 메소드는 선언만 존재해야 하며, 일반 메소드는 구현되어도 됨|
|상속|  다중 상속 지원, 클래스가 여러 인터페이스를 동시에 구현할 수 있음  |단일 상속만 지원, 하위 클래스는 추상 클래스를 상속·확장하여 사용할 수 있음|
|용도| 클래스 간 동작의 일관성 보장, 다형성 구현, 코드의 유연성 및 확장성 |공통적인 속성과 동작을 가지는 클래스의 부모 클래스로 사용될 수 있음|