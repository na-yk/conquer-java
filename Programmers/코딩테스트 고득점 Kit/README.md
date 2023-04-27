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


