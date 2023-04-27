# 코딩테스트 고득점 Kit
> 🐥 Java + 알고리즘 = ❓

## 해시맵(HashMap)
- <Key(키) = Value(값)> 쌍으로 저장하는 데이터 구조.  
- Python의 딕셔너리와 비슷함
### 해시맵 선언
```Java
// 기본형
HashMap<KeyType, ValueType> hashMap = new HashMap<>();

// Key가 String, Value가 정수형인 해시맵 student 선언
HashMap<String, Integer> students = new HashMap<>();
```
### `Key=Value` 추가
```Java
students.put("Amelia",2019);
students.put("Molly", 2020);
// 결과: students = {"Amelia" = 2019, "Molly" = 2020}
```
### `Key`를 통해 `Value` 가져오기
```Java
int num = students.get("Amelia");
// 결과: num = 2019;
```
----
## 덱(Deque)
- `java.util` 패키지에 속하는 인터페이스
- 큐(Queue)의 일종 / deque은 양 끝에서 삽입, 삭제가 가능함
- 활용 예시: `BFS(너비 우선 탐색)`
### Deque 선언
```Java
Deque<Integer> deque1 = new LinkedList<>(); // LinkedList로 Deque 선언
Deque<Integer> deque2 = new ArrayDeque<>(); // ArrayDeque로 Deque 선언

Deque<int[]> deque3 = new LinkedList<>();   // int배열을 담는 Deque 선언
```
- 속도: LinkedList > ArrayDeque
- 메모리 사용량: LinkedList < ArrayDeque

### Deque 값 추가
```Java
deque1.add(newVal);  // 맨 뒤에 새로운 값 추가함
deque1.addFrist(newVal); // 맨 앞에 새로운 값 추가함

deque3.add(new int[] {0,1}); // 맨 뒤에 int 배열 {0,1}을 추가함
```

### Deque 값 빼내기
```Java
int valFirst = deque.remove();  // 맨 앞의 값을 빼냄
int valLast = deque.removeLast();   // 맨 뒤의 값을 빼냄
```
### Deque 비어있는지 확인: `isEmpty()`
```Java
Boolean result = deque.isEmpty();
```
----

