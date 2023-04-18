# Lv.0 코딩테스트 입문
> 🐣 도전! Java 기본 문법 뿌수기  

<br>

## 💡 배열  
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
    
## 문자열
### 문자열 비교
```Java
    Boolean result = str1.equals(str2); 
    // str1과 str2의 일치 여부 boolean 타입 반환
    // 객체를 비교하는 메서드임 => char형 비교에도 사용하면 좋음
```

