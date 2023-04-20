# Lv.0 코딩테스트 입문
> 🐣 도전! Java 기본 문법 뿌수기 🐣

<br>

## 배열  
### 배열의 출력
```Java
    System.out.println(Arrays.toString(arr));
```
### 배열의 복사
1. for문으로 배열을 복사하기
2. `System.arraycopy()`를 이용하기
   ```Java
    System.arraycopy(arr, 0, newArr, 0, arr.length);
    // arr[0]에서 newArr[0]에 arr.length개의 데이터를 복사함
    // 배열을 자를 때도 사용할 수 있음
    ```

----
## 문자열
### 문자열 비교
```Java
Boolean result = str1.equals(str2); 
// str1과 str2의 일치 여부 boolean 타입 반환
// 객체를 비교하는 메서드임 => char형 비교에도 사용하면 좋음
```
### 문자열 나누기
#### 🔸특정 문자열 기준으로 나누기: `split`
```Java
String[] arr = str.split(" ");
// 구분자 기준으로 문자열을 나누고 배열로 반환
// 위 예시의 경우 공백을 기준으로 문자열 str을 나누어 배열 arr에 저장함
```
#### 🔸문자열 슬라이싱: `substring`
```Java
String str = "HelloWorld";
String owo = str.substring(4,7); //결과: oWo -> 4번째 문자부터 6번째까지
String world = str.substring(5); //결과: World -> 5번째 문자부터 마지막까지
```

### 문자열 일부 변경: `replace`, `replaceAll`
```Java
String result1 = str.replace("o","O"); // 결과: HellOWOrld"
```
### prefix와 suffix 확인하기
```Java
Boolean result1 = str.startsWith("Hello"); // 결과: true -> str이 "Hello"로 시작하는가?
Boolean result2 = str.endsWith("World");   // 결과: true -> str이 "World"로 끝나는가?
```

### 문자열 변환
#### 🔸문자열을 char형 배열로 변환하기: `toCharArray()`
```Java
char[] charArr = str.toCharArray();
// 결과: charArr = ['H','e','l','l','o','W','o','r','l','d']
```
----

<br>

## 📕 Reference
- 프로그래머스 코딩테스트 입문
- Java의 정석 3판, 남궁성, 도우출판