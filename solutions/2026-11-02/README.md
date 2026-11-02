# 문제 제목

완전탐색 - 배포 서버 3대 선택

## 문제 이해

서버 N개 + 처리 용량 / 서로 다른 서버 3대
선택한 서버의 처리 용량 합 <= L

조건을 만족하는 선택 중 처리 용량 합의 최댓값

## 접근법
```
L : 처리 용량 한계값
N : 서버 개수
servers : 서버 배열

start, middle, end, max

for(start: 0 ~ N-2)
    for(middle: start+1 ~ N-1)
        for(end: middle+1 ~ N)
            int sum = start + middle + end
            if(sum <= L)
                max = Math.max(max, sum)
                
sout(max)
```
## 복잡도

- 시간 복잡도: O(N³)
- 공간 복잡도: O(N)

## 구현

`Main.java`에 풀이를 작성합니다.

## 테스트

- [ ] 예제 입력
- [ ] 최소 입력
- [ ] 최대 입력 또는 오버플로
- [ ] 중복·도달 불가 등 문제별 경계값

## 회고

- 막힌 부분:
- 틀린 이유:
- 흔한 구현 실수:
- 다시 풀 때 기억할 점:
