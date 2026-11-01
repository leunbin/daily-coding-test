# 문제 제목
[2026-10-29] 문자열 - 연속 로그 압축

## 문제 이해
문자열에서 같은 문자가 연속해서 나타나면 => 압축하기
1. 문자가 한 번만 나타나면 -> 문자 기록
2. 같은 문자가 두 번 이상 -> 문자 + 횟수

## 접근법
str: 문자열

char fore, char now, string answer, int cnt

while(now != \n)
    if(fore == now)
        cnt++;
        fore = now;
        now++;
    if(fore != now)
        if(cnt != 1)
            answer += fore + cnt;
            cnt = 1;
            now = fore;
        else 
            answer += fore;
            now = fore;
## 복잡도

- 시간 복잡도: `O(N)`
    - 문자열을 한 번 순회하고 `StringBuilder`에 결과를 추가한다.
- 공간 복잡도: `O(N)`
    - 입력 문자 배열과 압축 결과를 저장한다.

## 구현

`Main.java`에 풀이를 작성합니다.

## 테스트

- [ ] 예제 입력
- [ ] 최소 입력
- [ ] 최대 입력 또는 오버플로
- [ ] 중복·도달 불가 등 문제별 경계값

## 회고

- 막힌 부분:
- 틀린 이유: `answer+= ...` 은 매번 기존 문자열을 복사하므로 최악의 경우 시간 복잡도가 `O(N²)`
- 흔한 구현 실수: 
- 다시 풀 때 기억할 점:
  - `StringBuilder`로 변경하면 안정적으로 `O(N)` 으로 구현 가능!!
